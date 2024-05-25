package com.example.draggerimplement

import android.app.Application

class ApplicationLevelDragger : Application() {


    lateinit var userRegistrationCompent: UserRegistrationCompent
    override fun onCreate() {
        super.onCreate()
        userRegistrationCompent = DaggerUserRegistrationCompent.factory().Create(3)
    }
}