package com.example.cybera

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CyberEducationActivity : AppCompatActivity() {

    private val topics = listOf(
        CyberEducation("DDoS Attack", "Overloads a server with traffic, making it slow or unavailable."),
        CyberEducation("Ransomware", "Locks or encrypts files and demands a ransom to unlock them."),
        CyberEducation("Brute Force Attack", "Repeatedly tries different passwords until it cracks the right one."),
        CyberEducation("Phishing", "Fake emails or messages that trick you into revealing sensitive info."),
        CyberEducation("Malware", "Malicious software designed to damage or gain unauthorized access."),
        CyberEducation("2FA (Two-Factor Authentication)", "Adds an extra layer of login security, like OTP or app-based codes."),
        CyberEducation("Rootkit", "Hidden software that gives attackers deep control over your system."),
        CyberEducation("Worm", "Self-replicating malware that spreads across networks without needing a host file."),
        CyberEducation("Trojan Horse", "Appears safe but contains harmful code hidden inside."),
        CyberEducation("Spyware", "Silently collects and sends your data to a hacker without your consent."),
        CyberEducation("Compression", "Shrinks file size for storage or quicker sharing."),
        CyberEducation("Cryptography", "Secures data using encryption so only authorized users can read it."),
        CyberEducation("Sniffing", "Capturing data traveling over a network to read sensitive information."),
        CyberEducation("Spoofing", "Pretending to be someone or something else (like a fake website or email)."),
        CyberEducation("Clickjacking", "Hiding malicious links under seemingly safe clicks."),
        CyberEducation("Social Engineering", "Tricking people (not systems) into giving up confidential info."),
        CyberEducation("Keylogger", "Tracks everything you type and sends it to the attacker (like passwords)."),
        CyberEducation("Botnet", "A network of infected devices controlled remotely by an attacker."),
        CyberEducation("Malware Injection", "Injecting malicious code into software or websites to exploit users."),
        CyberEducation("SQL Injection", "Inserting harmful SQL code into input fields to access or destroy databases."),
        CyberEducation("Tailgating", "Physically following someone into a secure area without authorization.")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cyber_education)

        val container = findViewById<LinearLayout>(R.id.educationContainer)
        val inflater = LayoutInflater.from(this)

        for (topic in topics) {
            val itemView = inflater.inflate(R.layout.item_cyber_term, container, false)

            val titleView = itemView.findViewById<TextView>(R.id.titleTextView)
            val descView = itemView.findViewById<TextView>(R.id.descriptionTextView)

            titleView.text = topic.title
            descView.text = topic.description

            container.addView(itemView)
        }
    }
}
