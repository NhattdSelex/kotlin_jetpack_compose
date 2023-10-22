package com.example.learn_jetpack_compose.components

import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CardExample(){
    Card {
        Text("this is card")
    }
}

@Preview
@Composable
fun CardPreview(){
    CardExample()
}