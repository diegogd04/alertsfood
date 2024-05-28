package com.example.alertsfood.alerts.data

import android.content.Context
import com.example.alertsfood.R
import com.example.alertsfood.alerts.domain.Alert
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject


class AlertDataRepository @Inject constructor(@ApplicationContext val context: Context) {

    val typeToken = object : TypeToken<List<AlertApiModel>>() {}.type

    fun getAlerts(): List<Alert> {
        val json = context.resources.openRawResource(R.raw.alerts)
            .bufferedReader().use { it.readText() }

        val apiAlerts = Gson().fromJson<List<AlertApiModel>>(json, typeToken)
        return apiAlerts.map {
            it.toDomain()
        }
    }

    fun getAlert(alertId: String): Alert? {
        val alerts = getAlerts()
        alerts.forEach {
            if (it.id == alertId) {
                return it
            }
        }
        return null
    }
}