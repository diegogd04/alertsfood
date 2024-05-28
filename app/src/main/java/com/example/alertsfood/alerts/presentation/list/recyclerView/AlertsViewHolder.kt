package com.example.alertsfood.alerts.presentation.list.recyclerView

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.alertsfood.R
import com.google.android.material.imageview.ShapeableImageView
import javax.inject.Inject

class AlertsViewHolder @Inject constructor(view: View) : ViewHolder(view) {
    val imageAlert: ShapeableImageView = view.findViewById(R.id.image_alert)
    val titleAlert: TextView = view.findViewById(R.id.title_alert)
    val dateAlert: TextView = view.findViewById(R.id.date_alert)
    val bodyAlert: TextView = view.findViewById(R.id.body_alert)
}