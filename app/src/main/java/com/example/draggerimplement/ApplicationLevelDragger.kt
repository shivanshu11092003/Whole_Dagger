package com.example.draggerimplement

import android.app.Application

class ApplicationLevelDragger : Application() {


    lateinit var appLevelComponent: AppLevelComponent
    override fun onCreate() {
        super.onCreate()

        appLevelComponent =  DaggerAppLevelComponent.builder().build()
    }
}