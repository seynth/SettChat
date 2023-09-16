package com.sett.settchat.screen.Home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sett.settchat.screen.Home.Components.AppBar
import com.sett.settchat.screen.Home.Components.ChatBody
import com.sett.settchat.screen.Home.Components.Stories
import com.sett.settchat.screen.Home.Components.Story
import com.sett.settchat.screen.Home.Components.UserChat

@Composable
fun HomeScreen() {
    Column (
        Modifier
            .fillMaxSize()
    ) {
        AppBar()
//        Stories()
        LazyColumn {
            items(100) {
                UserChat(username = "User $it", lastMessage = "hai $it")
            }
        }
//        ChatBody()
    }
}


@Composable
@Preview(showBackground = true)
fun HomeScreenPreview() {
    HomeScreen()
}