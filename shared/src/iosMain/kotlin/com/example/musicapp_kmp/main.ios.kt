package com.example.musicapp_kmp

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.ComposeUIViewController

fun MainiOS() = ComposeUIViewController {
    Column {
        Box(
            modifier = Modifier
                .height(40.dp)
        )
        MainCommon()
    }
}