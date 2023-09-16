package com.sett.settchat.screen.Home.Components

import android.widget.ScrollView
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.draw.scale
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

@Composable
fun Stories() {
    Column (
        Modifier
            .fillMaxWidth(),
    ) {
        Text(
            text = "Stories",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
        Size(height = 20.0f, width = 0.0f)
        LazyRow {
            items(100){
                Text(text = "item ke $it")
            }
        }
    }
}

@Composable
fun Story() {
    Box (
        Modifier
            .clip(RoundedCornerShape(corner = CornerSize(20.dp)))
            .fillMaxSize()
    ) {
        AsyncImage(
            modifier = Modifier
                .fillMaxSize(),
            model = "https://picsum.photos/1000/1500",
            contentDescription = null
        )
        Text(text = "each story")
    }
}


@Preview(showBackground = true)
@Composable
fun StoryPreview() {
//    Story()
    Story()
}