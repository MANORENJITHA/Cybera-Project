package com.example.cybera

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var loginSection: LinearLayout
    private lateinit var dashboardSection: LinearLayout

    private lateinit var usernameEditText: EditText
    private lateinit var emailEditText: EditText
    private lateinit var loginButton: Button

    private lateinit var cyberEducationButton: Button
    private lateinit var chatbotButton: Button
    private lateinit var threatScannerButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginSection = findViewById(R.id.loginSection)
        dashboardSection = findViewById(R.id.dashboardSection)

        usernameEditText = findViewById(R.id.usernameEditText)
        emailEditText = findViewById(R.id.emailEditText)
        loginButton = findViewById(R.id.loginButton)

        cyberEducationButton = findViewById(R.id.cyberEducationButton)
        chatbotButton = findViewById(R.id.chatbotButton)
        threatScannerButton = findViewById(R.id.threatScannerButton)

        dashboardSection.visibility = View.GONE

        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val email = emailEditText.text.toString()

            if (username == "admin" && email == "admin@gmail.com") {
                Toast.makeText(this, "Welcome, $username!", Toast.LENGTH_SHORT).show()
                loginSection.visibility = View.GONE
                dashboardSection.visibility = View.VISIBLE
            } else {
                Toast.makeText(this, "Invalid login details", Toast.LENGTH_SHORT).show()
            }
        }

        cyberEducationButton.setOnClickListener {
            startActivity(Intent(this, CyberEducationActivity::class.java))
        }

        chatbotButton.setOnClickListener {
            startActivity(Intent(this, ChatbotActivity::class.java))
        }

        threatScannerButton.setOnClickListener {
            startActivity(Intent(this, ThreatScannerActivity::class.java))
        }
    }
}

