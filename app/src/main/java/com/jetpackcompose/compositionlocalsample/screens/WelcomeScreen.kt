package com.jetpackcompose.compositionlocalsample.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.jetpackcompose.compositionlocalsample.analytics.LogScreenVisited

@Composable
fun WelcomeScreen() {
    Column {
        Text(
            text = "Hello World!",
            color = MaterialTheme.colorScheme.primary,
            style = MaterialTheme.typography.bodyLarge,
        )
    }
    LogScreenVisited(screenName = "Welcome")
}