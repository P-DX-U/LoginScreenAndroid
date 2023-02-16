package com.third.loginscreenandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    private lateinit var background: ImageView
    private lateinit var userimage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        background = findViewById(R.id.background)
        userimage = findViewById(R.id.userImage)

        loadBackground()

    }

    private fun loadBackground() {
        Glide.with(this)
        .load("https://images.unsplash.com/photo-1506914426289-e7fec369f90a?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=2070&q=80")
        .centerCrop()
        .into(background)

        Glide.with(this)
        .load("https://www.pngkit.com/png/full/281-2812821_user-account-management-logo-user-icon-png.png")
        .centerCrop()
        .into(userimage)
    }


}