package com.example.draggerimplement

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface NotifiactionService{
    fun Send(to:String,from:String,body : String)
}


@Singleton
class emailService @Inject constructor() : NotifiactionService{
    override fun Send(to:String, from:String, body : String){
        Log.d("EmailSent","Email Is Sent")
    }
}

class MessageService(val retryCount : Int) : NotifiactionService {
    override fun Send(to: String, from: String, body: String) {
        Log.d("MessageService","Message Send to customer with retry count $retryCount")
    }

}