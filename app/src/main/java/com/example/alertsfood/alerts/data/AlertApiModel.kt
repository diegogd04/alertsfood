package com.example.alertsfood.alerts.data

import com.example.alertsfood.alerts.domain.Alert
import com.google.gson.annotations.SerializedName

data class AlertApiModel(
    @SerializedName("body") val body: String,
    @SerializedName("id") val id: String,
    @SerializedName("label_source") val labelSource: String,
    @SerializedName("publish_date") val publishData: Long,
    @SerializedName("summary") val summary: String,
    @SerializedName("title") val title: String,
    @SerializedName("type_alert") val typeAlert: Int,
    @SerializedName("url_main_image") val urlImage: String,
    @SerializedName("url_source") val urlSource: String
)

fun AlertApiModel.toDomain() = Alert(
    body,
    id,
    labelSource,
    publishData,
    summary,
    title,
    typeAlert,
    urlImage,
    urlSource
)