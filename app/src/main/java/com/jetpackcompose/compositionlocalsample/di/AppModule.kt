package com.jetpackcompose.compositionlocalsample.di

import com.jetpackcompose.compositionlocalsample.analytics.AnalyticsLogger
import com.jetpackcompose.compositionlocalsample.analytics.AnalyticsLoggerImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class AppModule {

    @Binds
    abstract fun bindAnalyticsLogger(analyticsLoggerImpl: AnalyticsLoggerImpl): AnalyticsLogger

}