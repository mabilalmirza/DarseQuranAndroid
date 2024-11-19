package com.bilmir.darsequran

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.bilmir.darsequran.screen.FileListScreen
import com.bilmir.darsequran.ui.theme.DarseQuranTheme

@Composable
fun App(modifier: Modifier = Modifier) {

    val context = LocalContext.current
    DarseQuranTheme {
        SplashScreen {
            Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                FileListScreen(context, Modifier.padding(innerPadding))
            }
        }
    }

}

