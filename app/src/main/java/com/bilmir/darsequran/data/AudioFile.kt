package com.bilmir.darsequran.data

import kotlinx.serialization.Serializable

@Serializable
data class AudioFile(
    val id: String,
    val surah: List<Surah>,
    val part: Int? = null,
    val totalParts: Int? = null,
    val link: String
)

@Serializable
data class Surah (val name: String, val topic: String)


