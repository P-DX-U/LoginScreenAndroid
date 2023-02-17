package com.third.loginscreenandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.google.android.material.snackbar.Snackbar
import com.third.loginscreenandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener { view ->
            val user = binding.userTextField.editText?.text.toString()
            val password = binding.passTextField.editText?.text.toString()
            if (user.isBlank() || password.length < 8) {
                Toast.makeText(this, R.string.blankUser, Toast.LENGTH_LONG).show()
            } else {
                val userSnackBar = Snackbar
                    .make(binding.root, getString(R.string.correctUserMessage, user), Snackbar.LENGTH_LONG)
                    .setBackgroundTint(getColor(R.color.primario))
                    .show()
            }
        }

        binding.forgotPasswordButton.setOnClickListener{ view ->
            Toast.makeText(this, R.string.restorePassword, Toast.LENGTH_LONG).show()
        }

        binding.createAccountButton.setOnClickListener{ view ->
            Toast.makeText(this, R.string.accountMessage, Toast.LENGTH_LONG).show()
        }


        loadImages()

    }

    private fun loadImages() {
        Glide.with(this)
        .load("https://images.unsplash.com/photo-1506914426289-e7fec369f90a?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=2070&q=80")
        .centerCrop()
        .into(binding.background)

        Glide.with(this)
        .load("https://www.pngkit.com/png/full/281-2812821_user-account-management-logo-user-icon-png.png")
        .centerCrop()
        .into(binding.userImage)
    }

}