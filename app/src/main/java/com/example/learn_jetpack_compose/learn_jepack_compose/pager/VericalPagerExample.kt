package com.example.learn_jetpack_compose.learn_jepack_compose.pager

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun VerticalPagerExample(){
    VerticalPager(pageCount = 10) { page -> Text(text = "$page",
        modifier = Modifier.fillMaxSize()
        ) }
}
