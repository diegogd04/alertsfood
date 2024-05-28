package com.example.alertsfood.alerts.domain

import javax.inject.Inject

class GetAlertUseCase @Inject constructor(private val repository: AlertRepository) {
    suspend operator fun invoke(): Alert {
        return repository.getAlert()
    }
}