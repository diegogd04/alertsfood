package com.example.alertsfood.alerts.domain

interface AlertRepository {
    suspend fun getAlerts(): List<Alert>
    suspend fun getAlert(): Alert
}