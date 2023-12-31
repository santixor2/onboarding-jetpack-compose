package com.example.onboardingjetpackcompose.feature_onboarding.presentation.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HomeScreen(){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = "Home",
            fontSize = MaterialTheme.typography.titleLarge.fontSize
        )
    }
}
@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){
    HomeScreen()
}