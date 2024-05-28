package com.example.alertsfood.alerts.domain

import javax.inject.Inject

class GetAlertsUseCase @Inject constructor(private val repository: AlertRepository) {
    suspend operator fun invoke(): List<Alert> {
        return repository.getAlerts()
    }
}