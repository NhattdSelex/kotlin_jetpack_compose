package com.example.learn_jetpack_compose.components

import android.inputmethodservice.Keyboard
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldExample(){
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(title = { Text("Ceter Aligned top app bar") })
        },
        floatingActionButton = {
            IconButton(onClick = { /*TODO*/ }) {
                Text("click")
            }
        },
        bottomBar = {
            Row {
                IconButton(onClick = { /*TODO*/ }) {
                    Text("hello world")
                }
            }
        },
        snackbarHost = {
            Text("snack bar")
        }
    ) {
        paddingValues -> Text("Hello kotlin $paddingValues")
    }
}


@Preview
@Composable
fun ScaffoldPreview(){
    ScaffoldExample()
}