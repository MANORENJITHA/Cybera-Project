
package com.example.cybera

data class Threat(val contact: String, val message: String, val appName: String)

object DetectedThreatStore {
    private val threats = mutableListOf<Threat>()

    fun addThreat(threat: Threat) {
        threats.add(threat)
    }

    fun getAllThreats(): List<Threat> = threats.toList()
}
