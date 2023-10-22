package com.example.learn_jetpack_compose.components

import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun ButtonExample() {
    FlowRow(
        modifier = Modifier.fillMaxWidth()
    ) {
        Button(
            onClick = {},

            ) {
            Text("Button")
        }

        ElevatedButton(onClick = { /*TODO*/ }) {
            Text("ElevatedButton")
        }

        FilledTonalButton(onClick = { /*TODO*/ }) {
            Text("Filled tonal button")
        }

        OutlinedButton(onClick = { /*TODO*/ }) {
            Text("Outline Button")
        }

        TextButton(onClick = { /*TODO*/ }) {
            Text("Button")
        }
    }
}


@Preview
@Composable
fun ButtonExamplePreview() {
    ButtonExample()
}