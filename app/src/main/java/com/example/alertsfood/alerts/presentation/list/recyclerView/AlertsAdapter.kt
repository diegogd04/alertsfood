package com.example.alertsfood.alerts.presentation.list.recyclerView

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.alertsfood.alerts.domain.Alert
import javax.inject.Inject

class AlertsAdapter @Inject constructor(private val alert: Alert?) :
    RecyclerView.Adapter<AlertsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlertsViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(viewHolder: AlertsViewHolder, position: Int) {
        //viewHolder.imageAlert.
        viewHolder.titleAlert.text = alert?.title
        viewHolder.dateAlert.text = alert?.publishData.toString()
        viewHolder.bodyAlert.text = alert?.body
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}