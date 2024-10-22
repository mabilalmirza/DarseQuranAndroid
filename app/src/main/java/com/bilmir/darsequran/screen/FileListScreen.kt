package com.bilmir.darsequran.screen

import android.content.Context
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.bilmir.darsequran.data.AudioFile
import com.bilmir.darsequran.util.loadAudioFileData

@Composable
fun FileListScreen(context: Context, modifier: Modifier = Modifier) {
    val audioFileList = remember { loadAudioFileData(context) }

    LazyColumn(
        modifier = modifier
    ) {
        items(audioFileList) { AudioFileItem(it) }
    }
}

@Composable
fun AudioFileItem(audioFile: AudioFile) {

    audioFile.surah.forEach { surah ->
        Text(text = "${surah.name} (${surah.topic})")
    }

}