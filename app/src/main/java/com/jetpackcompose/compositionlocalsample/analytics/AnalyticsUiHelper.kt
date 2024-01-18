package com.jetpackcompose.compositionlocalsample.analytics

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.staticCompositionLocalOf


val LocalAnalyticsLogger = staticCompositionLocalOf {
    DummyAnalyticsLogger()
}

@Composable
fun LogScreenVisited(
    screenName: String,
    analyticsLogger: AnalyticsLogger = LocalAnalyticsLogger.current
) = LaunchedEffect(Unit) {
    analyticsLogger.logScreenVisited(screenName)
}