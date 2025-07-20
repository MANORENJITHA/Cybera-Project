
package com.example.cybera

object ThreatAnalyzer {
    private val threatKeywords = listOf(
        "leak", "loser", "regret", "nothing", "find you", "scam", "bully", "phishing"
    )

    fun containsThreat(text: String?): Boolean {
        if (text == null) return false
        val lower = text.lowercase()
        return threatKeywords.any { keyword -> lower.contains(keyword) }
    }
}
