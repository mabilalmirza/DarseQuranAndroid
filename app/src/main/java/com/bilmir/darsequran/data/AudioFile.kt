package com.bilmir.darsequran.data

import kotlinx.serialization.Serializable

@Serializable
data class AudioFile(
    val id: String,
    val surah: List<Surah>,
    val link: String
)




