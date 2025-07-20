package com.example.cybera

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ThreatScannerActivity : AppCompatActivity() {
    private lateinit var scannerResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_threat_scanner)

        scannerResult = findViewById(R.id.scannerResult)

        val fakeMessages = listOf(
            "Send me your OTP now!",
            "If you don’t pay me, I’ll expose your chats.",
            "Click this link to win a free iPhone!",
            "You're such a loser. Just die.",
            "You're nothing without me."
        )

        val detected = fakeMessages.filter { ThreatAnalyzer.containsThreat(it) }

        scannerResult.text = if (detected.isNotEmpty()) {
            "🔍 Threats Detected:\n\n" + detected.joinToString("\n\n") { "⚠️ $it" }
        } else {
            "✅ No threats found."
        }
    }
}
