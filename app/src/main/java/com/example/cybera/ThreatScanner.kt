package com.example.cybera

import android.content.Context
import android.widget.Toast

object ThreatScanner {

    fun scanMessage(context: Context, message: String) {
        val lowerMessage = message.lowercase()

        when {
            lowerMessage.contains("click") || lowerMessage.contains("win") || lowerMessage.contains("free") -> {
                showTip(context, "⚠️ Don’t click suspicious links. It could be a scam.")
            }

            lowerMessage.contains("password") -> {
                showTip(context, "🔒 Never share your password with anyone.")
            }

            lowerMessage.contains("otp") || lowerMessage.contains("code") -> {
                showTip(context, "🔐 Never share OTPs. Even with friends.")
            }

            lowerMessage.contains(".apk") || lowerMessage.contains(".exe") -> {
                showTip(context, "🧨 Don’t install apps or files from unknown links.")
            }

            lowerMessage.contains("urgent") || lowerMessage.contains("limited offer") -> {
                showTip(context, "🛡️ Be careful of urgent scam messages.")
            }

            else -> {
                showTip(context, "✅ No threats detected.")
            }
        }
    }

    private fun showTip(context: Context, tip: String) {
        Toast.makeText(context, tip, Toast.LENGTH_LONG).show()
    }
}
