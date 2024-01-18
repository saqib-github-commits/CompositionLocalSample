package com.jetpackcompose.compositionlocalsample.analytics

import javax.inject.Inject

class AnalyticsLoggerImpl @Inject constructor(

) : AnalyticsLogger {
    override fun logEvent(name: String, params: List<AnalyticsParam>) {
        // actual implementation via firebase or newrelic or any other
    }
}