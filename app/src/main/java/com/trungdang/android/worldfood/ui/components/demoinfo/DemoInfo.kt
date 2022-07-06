package com.trungdang.android.favoritefood.ui.components.demoinfo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun DemoInfo() {
    Column(modifier = Modifier
        .fillMaxWidth()
        .background(MaterialTheme.colors.secondary)) {
        Row() {
            Column( modifier = Modifier.weight(0.6F)) {
                Text("Demo title")
                Text("Demo description")
            }
            TextButton(
                modifier = Modifier
                    .weight(0.4F)
                    .background(MaterialTheme.colors.secondaryVariant),
                onClick ={}) {
                    Text("Try Demo Now")
                }
        }
    }
}