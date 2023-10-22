    package com.example.learn_jetpack_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.learn_jetpack_compose.FlowLayoutExample.FlowRowExample
import com.example.learn_jetpack_compose.complexUi.ImageCardComposable
import com.example.learn_jetpack_compose.components.ProgressIndicatorsExample
import com.example.learn_jetpack_compose.learn_jepack_compose.pager.HorizontalPagerExample
import com.example.learn_jetpack_compose.learn_jepack_compose.pager.VerticalPagerExample
import com.example.learn_jetpack_compose.ui.theme.Learn_jetpack_composeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Learn_jetpack_composeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ProgressIndicatorsExample()
                }
            }
        }
    }
}



