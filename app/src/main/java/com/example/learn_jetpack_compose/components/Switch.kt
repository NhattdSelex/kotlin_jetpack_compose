package com.example.learn_jetpack_compose.components

import androidx.compose.material3.Switch
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue


@Composable
fun SwitchExample(){
    var checked by remember {
        mutableStateOf(true)
    }

    Switch(checked = checked, onCheckedChange = {
        checked = it
    })
}