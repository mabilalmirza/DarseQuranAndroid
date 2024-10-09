package com.bilmir.darsequran

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.bilmir.darsequran.screen.FileListScreen
import com.bilmir.darsequran.ui.theme.DarseQuranTheme

@Composable
fun App(modifier: Modifier = Modifier) {

    var showSplash by remember { mutableStateOf(true) }
    val context = LocalContext.current
    DarseQuranTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

            if (showSplash) {
                SplashScreen { showSplash = false }
            } else {
                FileListScreen(context, Modifier.padding(innerPadding))
            }


        }
    }
    
}

