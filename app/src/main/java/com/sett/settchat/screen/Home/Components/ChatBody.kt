package com.sett.settchat.screen.Home.Components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ChatBody() {
    Box (
        Modifier
            .fillMaxSize()
    ) {
        Text(text = "ini buat chat body")
    }
}

@Composable
fun UserChat(
    username: String,
    lastMessage: String

) {

    var hasMessage = true
    var numOfMessage = 10000

    Row (
        Modifier
            .fillMaxWidth()
            .padding(8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row (
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier
                    .clip(CircleShape)
                    .background(Color.Gray)
                    .padding(5.dp)
                    .size(height = 32.dp, width = 32.dp),
                imageVector = Icons.Default.Person,
                contentDescription = "userAvatar"
            )
            Spacer(modifier = Modifier.width(8.dp))
            Column {
                Text(
                    text = username,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
//                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = lastMessage,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal

                )
            }
        }
        if (hasMessage){
            Box (
                modifier = Modifier
                    .size(24.dp)
                    .background(
                        color = Color.Red,
                        shape = CircleShape
                    ),
                contentAlignment = Alignment.Center
            ){
                Text(
                    modifier = Modifier
                        .padding(1.dp),
                    text = if (numOfMessage > 0 && numOfMessage >= 100) "99+" else "$numOfMessage",
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ChatBodyPreview() {
//    ChatBody()
    UserChat("Setyo", "hai")
}