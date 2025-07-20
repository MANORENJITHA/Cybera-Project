
package com.example.cybera

object UserSettings {
    private val allowedContacts = mutableSetOf<String>()

    fun allowContact(name: String) {
        allowedContacts.add(name)
    }

    fun removeContact(name: String) {
        allowedContacts.remove(name)
    }

    fun isAllowedContact(name: String?): Boolean {
        return name != null && allowedContacts.contains(name)
    }

    fun getAllAllowed(): List<String> = allowedContacts.toList()
}
