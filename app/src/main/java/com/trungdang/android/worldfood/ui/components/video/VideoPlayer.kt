package com.trungdang.android.worldfood.ui.components.video

import android.R.color.holo_green_dark
import android.R.color.holo_purple
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.ui.StyledPlayerView


@Composable
fun VideoPlayer() {
    val sampleVideo = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4"

    val context = LocalContext.current

    val testing = remember {
        mutableStateOf(true)
    }

    val playWhenReady = rememberSaveable {
        mutableStateOf(true)
    }
    val player = remember {
        ExoPlayer.Builder(context).build().apply {
            this.playWhenReady = playWhenReady.value
            this.setMediaItem(MediaItem.fromUri(sampleVideo))
            this.prepare()
        }

    }

    if (testing.value) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .background(color = colorResource(id = holo_green_dark))) {
            Text("Video player test.", modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth()
                .background(color = colorResource(id = holo_purple)))
        }
    } else {
        DisposableEffect(
            AndroidView(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                factory = {
                    StyledPlayerView(context).apply {
                        this.player = player
                    }
                }
            )
        ) {
            onDispose {
                player.release()
            }
        }
    }


}