package com.bilmir.darsequran.data

import kotlinx.serialization.Serializable

@Serializable
class AudioFile(
    val id: String,
    val name: String,
    val part: Int? = null,
    val totalParts: Int? = null,
    val link: String
)