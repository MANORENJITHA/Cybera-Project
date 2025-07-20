package com.example.cybera

import android.content.Context
import android.util.Log

object NotificationHelper {
    fun sendToAdult(context: Context, contact: String, message: String, appName: String) {
        // For now just log the alert
        Log.d("NotificationHelper", "Alert! Threat from $contact in $appName: $message")
        // TODO: Implement notification to trusted adult
    }
}
