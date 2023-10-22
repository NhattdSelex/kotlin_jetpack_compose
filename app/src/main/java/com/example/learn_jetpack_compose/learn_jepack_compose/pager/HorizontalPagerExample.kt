package com.example.learn_jetpack_compose.learn_jepack_compose.pager

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@OptIn(ExperimentalFoundationApi::class)


@Composable
fun HorizontalPagerExample(){
    HorizontalPager(pageCount = 10) {
        page -> Text("$page")
        
    }
}