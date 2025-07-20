package com.example.cybera

import android.service.notification.NotificationListenerService
import android.service.notification.StatusBarNotification
import android.app.Notification
import android.util.Log

class ChatNotificationListener : NotificationListenerService() {
    override fun onNotificationPosted(sbn: StatusBarNotification?) {
        val packageName = sbn?.packageName ?: return
        val extras = sbn.notification?.extras ?: return
        val title = extras.getString(Notification.EXTRA_TITLE) ?: ""
        val text = extras.getCharSequence(Notification.EXTRA_TEXT)?.toString() ?: ""

        if (packageName.contains("whatsapp") || packageName.contains("messenger")) {
            if (UserSettings.isAllowedContact(title)) {
                if (ThreatAnalyzer.containsThreat(text)) {
                    DetectedThreatStore.addThreat(
                        Threat(title, text, packageName)
                    )
                    NotificationHelper.sendToAdult(this, title, text, packageName)
                    Log.d("ChatNotificationListener", "Threat detected from $packageName: $text")
                }
            }
        }
    }
}
