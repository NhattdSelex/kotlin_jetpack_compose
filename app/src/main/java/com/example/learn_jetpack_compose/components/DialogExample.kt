package com.example.learn_jetpack_compose.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Build
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun DialogExample(){
    AlertDialog({ /*TODO*/ }, { /*TODO*/ },
        icon = {
        Icon(Icons.Rounded.Build, contentDescription = null)
        }
    , title = {
        Text("this is title dialog")
        },
        dismissButton = {
            Icon(Icons.Rounded.Add, contentDescription = null)
        },

    )
}

@Preview
@Composable
fun DialogPreview(){
    DialogExample()
}