package com.example.latihanmobile1

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.math.log
import android.content.Intent
import android.widget.Toast


class MainActivity : AppCompatActivity() {


    lateinit var usernameInput : EditText
    lateinit var passwordInput : EditText
    lateinit var loginBtn : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        usernameInput = findViewById(R.id.username_input)
        passwordInput = findViewById(R.id.password_input)
        loginBtn = findViewById(R.id.login_btn)

        loginBtn.setOnClickListener {
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()
            //Log.i("Test Credentianls", "username : $username and password : $password")
            if (username == "admin" && password == "1234") {
                // Pindah ke MainActivity setelah login berhasil
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
                finish() // Untuk menutup LoginActivity agar pengguna tidak bisa kembali ke halaman login
            } else {
                // Tampilkan pesan error jika login gagal
                Toast.makeText(this, "Username atau password salah", Toast.LENGTH_SHORT).show()
            }
        }


    }
}