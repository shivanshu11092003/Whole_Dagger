package com.example.draggerimplement

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AnalyticServiceModule {
    @Singleton
    @Provides
    fun getAnalyticService() : AnalyticSevice{
        return Mixpanel()
    }
}