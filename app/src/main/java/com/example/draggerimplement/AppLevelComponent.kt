package com.example.draggerimplement

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AnalyticServiceModule::class])
interface AppLevelComponent {
    fun getAnalyticService():  AnalyticSevice
}