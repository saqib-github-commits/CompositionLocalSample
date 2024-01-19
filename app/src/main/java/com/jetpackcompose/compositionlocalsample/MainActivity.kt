package com.jetpackcompose.compositionlocalsample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.jetpackcompose.compositionlocalsample.analytics.AnalyticsLogger
import com.jetpackcompose.compositionlocalsample.analytics.LocalAnalyticsLogger
import com.jetpackcompose.compositionlocalsample.screens.WelcomeScreen
import com.jetpackcompose.compositionlocalsample.ui.theme.CompositionLocalSampleTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    protected lateinit var analyticsLogger: AnalyticsLogger


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CompositionLocalProvider(LocalAnalyticsLogger provides analyticsLogger) {
                CompositionLocalSampleTheme {
                    // A surface container using the 'background' color from the theme
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colorScheme.background
                    ) {
                        WelcomeScreen()
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(
        text = "Hello $name!",
        color = MaterialTheme.colorScheme.primary,
        style = MaterialTheme.typography.bodyLarge,
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CompositionLocalSampleTheme {
        Greeting("Android")
    }
}