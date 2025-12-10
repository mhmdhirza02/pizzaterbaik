package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {

    companion object {
        var name: String = "Hirza"
        var email: String = "mhmd.hirza027@amikom.ac.id"
        var password: String = "kasir123"
        var level: String = "Cashier"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Ambil input Login
        val txtUsername: EditText = findViewById(R.id.editTextUsername)
        val txtPassword: EditText = findViewById(R.id.editTextPassword)
        val btnLogin: Button = findViewById(R.id.buttonLogin)

        // Tombol Login ditekan
        btnLogin.setOnClickListener {

            val usernameInput = txtUsername.text.toString()
            val passwordInput = txtPassword.text.toString()

            if (usernameInput == email && passwordInput == password) {

                val intent = Intent(this, AccountActivity::class.java)
                startActivity(intent)

            } else {

                Toast.makeText(
                    this,
                    "Login failed, check your email and password",
                    Toast.LENGTH_SHORT
                ).show()

            }
        }
    }
}
