package com.example.pppbtugaslogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.pppbtugaslogin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var userEmail: String
    private lateinit var userPass: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        userEmail = "jontor@mail.com"
        userPass = "1224"

        binding.loginBtn.setOnClickListener{
            if (binding.email.text.toString() == userEmail && binding.password.text.toString() == userPass){
                Toast.makeText(this@MainActivity, "Log In Succeed",Toast.LENGTH_SHORT).show()
            } else{
                Toast.makeText(this@MainActivity, "Wrong  E-Mail or Password",Toast.LENGTH_SHORT).show()
            }
        }
    }
}