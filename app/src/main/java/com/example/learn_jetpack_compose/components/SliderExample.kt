package com.example.learn_jetpack_compose.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SliderExample(){
    var sliderPosition by remember {
        mutableStateOf(0f)
    }

    Column {
        Slider(
            value = sliderPosition,
            onValueChange = {sliderPosition = it}
        )
        Text(sliderPosition.toString())
    }
}

@Preview
@Composable
fun SliderPreview(){
    SliderExample()
}