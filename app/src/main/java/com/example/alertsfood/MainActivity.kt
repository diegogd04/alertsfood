package com.example.alertsfood

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.alertsfood.alerts.data.AlertDataRepository
import com.example.alertsfood.alerts.presentation.list.recyclerView.AlertsAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val alertDataRepository = AlertDataRepository(this)

        //Código test
        val alerts = alertDataRepository.getAlerts()
        val alert = alertDataRepository.getAlert(alerts.first().id)

        val alertsAdapter = AlertsAdapter(alert)
        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.adapter = alertsAdapter
    }
}