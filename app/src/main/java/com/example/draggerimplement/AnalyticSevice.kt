package com.example.draggerimplement

import android.util.Log

interface AnalyticSevice {
    fun tractEvent(eventName:String,eventType: String)
}

class Mixpanel: AnalyticSevice{
    override fun tractEvent(eventName: String, eventType: String) {
        Log.w("AnalyticSevice","Mixpanel-$eventName-$eventType")
    }

}
class FirebaseAnalytic:AnalyticSevice{
    override fun tractEvent(eventName: String, eventType: String) {
        Log.w("AnalyticSevice","FirebaseAnalytic-$eventName-$eventType")
    }

}