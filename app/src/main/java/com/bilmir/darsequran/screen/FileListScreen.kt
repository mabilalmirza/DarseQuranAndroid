package com.bilmir.darsequran.screen

import android.content.Context
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
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

    Column ( modifier = Modifier.padding(20.dp) ) {
        audioFile.surah.forEach {
            Row {
                Text(
                    text = it.name,
                    style = MaterialTheme.typography.headlineSmall,
                    modifier = Modifier.padding(2.dp)
                )
                Text(
                    text = "(${it.topic})",
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(2.dp)
                )
            }
        }
    }

//    Row (modifier = Modifier.padding(6.dp)) {
//        for(i in 1.. audioFile.surah.size) {
//            val surah = audioFile.surah[i - 1]
//            Text(
//                text = surah.name,
//                style = MaterialTheme.typography.labelLarge,
//                modifier = Modifier.padding(2.dp)
//            )
//            Text(
//                text = "(${surah.topic})",
//                style = MaterialTheme.typography.labelSmall,
//                modifier = Modifier.padding(2.dp)
//            )
//
//            if (i < audioFile.surah.size) {
//                Text(
//                    text = " / ",
//                    style = MaterialTheme.typography.labelSmall,
//                    modifier = Modifier.padding(2.dp)
//                )
//            }
//        }
//    }

}