package com.example.learn_jetpack_compose.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun ProgressIndicatorsExample() {
    var currentPregress by remember {
        mutableStateOf(0f)
    }
    var loading by remember {
        mutableStateOf(false)
    }

    val scope = rememberCoroutineScope()

    Column(
        verticalArrangement = Arrangement.spacedBy(12.dp),
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Button(
            onClick = {
                loading = true
                scope.launch {
                    loadProgress { progress -> currentPregress = progress }
                    loading = false

                }
            }, enabled = !loading
        ) {
            Text("Start loading")
        }

        if (loading) {
            LinearProgressIndicator(
                modifier = Modifier.fillMaxWidth(),
                progress = currentPregress,
            )

            CircularProgressIndicator(
                progress = currentPregress,
            )

        }


        /* CircularProgressIndicator(
             modifier = Modifier.width(64.dp),
             color = MaterialTheme.colorScheme.surfaceVariant,

         )

         LinearProgressIndicator(
             modifier = Modifier.width(64.dp),
             color = MaterialTheme.colorScheme.surfaceVariant,
             trackColor = MaterialTheme.colorScheme.primary

         )*/
    }
}

suspend fun loadProgress(updateProgress: (Float) -> Unit) {
    for (i in 1..100) {
        updateProgress(i.toFloat() / 100)
        delay(100)
    }
}