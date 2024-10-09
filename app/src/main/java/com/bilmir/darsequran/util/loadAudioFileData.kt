package com.bilmir.darsequran.util

import android.content.Context
import com.bilmir.darsequran.R
import com.bilmir.darsequran.data.AudioFile
import kotlinx.serialization.json.Json


fun loadAudioFileData(context: Context): List<AudioFile> {
    val jsonString = context.resources.openRawResource(R.raw.data)
        .bufferedReader().use { it.readText() }

    return Json.decodeFromString<List<AudioFile>>(jsonString)
}