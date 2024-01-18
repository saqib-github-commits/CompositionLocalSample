package com.jetpackcompose.compositionlocalsample.analytics

import com.jetpackcompose.compositionlocalsample.analytics.AnalyticsLogger
import com.jetpackcompose.compositionlocalsample.analytics.AnalyticsParam

class DummyAnalyticsLogger: AnalyticsLogger {
    override fun logEvent(name: String, params: List<AnalyticsParam>) = Unit
}