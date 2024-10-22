package com.bilmir.darsequran.data

import kotlinx.serialization.Serializable

@Serializable
data class Surah (
    val name: String,
    val topic: String,
    val part: Int? = null,
    val totalParts: Int? = null,
)