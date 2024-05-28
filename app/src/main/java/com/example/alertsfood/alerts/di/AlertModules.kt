package com.example.alertsfood.alerts.di

import com.example.alertsfood.alerts.data.AlertDataRepository
import com.example.alertsfood.alerts.domain.AlertRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class AlertModules {
    @Binds
    abstract fun bindAlertDataRepository(alertDataRepository: AlertDataRepository): AlertRepository
}