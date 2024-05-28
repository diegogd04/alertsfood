package com.example.alertsfood.alerts.presentation.list

import androidx.lifecycle.ViewModel
import com.example.alertsfood.alerts.domain.GetAlertsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel

@HiltViewModel
class ListViewModel(private val getAlertsUseCase: GetAlertsUseCase) : ViewModel() {
    fun loadAlerts() {

    }
}