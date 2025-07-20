package com.example.cybera

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ChatbotActivity : AppCompatActivity() {

    private lateinit var inputEditText: EditText
    private lateinit var sendButton: Button
    private lateinit var responseTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chatbot)

        inputEditText = findViewById(R.id.editTextInput)
        sendButton = findViewById(R.id.buttonSend)
        responseTextView = findViewById(R.id.chatbotTextView)

        sendButton.setOnClickListener {
            val userInput = inputEditText.text.toString()
            val response = getBotResponse(userInput)
            responseTextView.text = "Bot: $response"
        }
    }

    private fun getBotResponse(input: String): String {
        return when {
            input.contains("scam", ignoreCase = true) -> "Scams often try to trick you into giving personal information. Be careful!"
            input.contains("bully", ignoreCase = true) -> "Cyberbullying can be harmful. Always speak to someone you trust."
            input.contains("phishing", ignoreCase = true) -> "Phishing is an attempt to get your info by pretending to be someone else."
            else -> "I'm here to help you learn about cyber threats!"
        }
    }
}

