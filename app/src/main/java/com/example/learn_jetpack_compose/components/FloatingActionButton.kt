package com.example.learn_jetpack_compose.components

import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun FloatingActionButtonExample() {
    FlowColumn {
        FloatingActionButton(onClick = { /*TODO*/ }) {
            Icon(Icons.Filled.Add, "Floating action button")
        }
        SmallFloatingActionButton(onClick = { /*TODO*/ }) {
            Icon(Icons.Filled.Add, "Floating action button")
        }
        LargeFloatingActionButton(onClick = { /*TODO*/ }, shape = CircleShape) {
            Icon(Icons.Filled.Add, "Floating action button")
        }

        ExtendedFloatingActionButton(
            onClick = { /*TODO*/ },
            icon = { Icon(Icons.Filled.Add, "iicon") },
            shape = CircleShape,
            text = {
                Text("Hello world")
            }
        )
    }
}

@Preview
@Composable
fun FloatingActionButtonPreview() {
    FloatingActionButtonExample()
}