package com.bilmir.darsequran

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay
import kotlin.time.Duration
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.Duration.Companion.seconds

@Composable
fun SplashScreen(duration: Duration = 10.milliseconds, content: @Composable () -> Unit) {
    var showSplash by remember { mutableStateOf(true) }

    LaunchedEffect(key1 = true) {
        delay(duration)
        showSplash = false
    }

    if (showSplash) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Dars-e-Quran", fontSize = 30.sp)
            Spacer(Modifier.height(20.dp))
            Text("By", fontSize = 18.sp)
            Text("Dr. Israr Ahmed", fontSize = 18.sp)
        }
    } else {
        content()
    }
}