package com.example.draggerimplement

import android.util.Log
import javax.inject.Inject

interface userRepository{
    fun saveUser(email:String,password:String)

}

class SQLRepository @Inject constructor() : userRepository{


    override fun saveUser(email:String, password:String){
        Log.d("SaveUser","User is saved in Db")
    }
}
class FireBaseRepository : userRepository{
    override fun saveUser(email: String, password: String) {
        Log.d("SaveUser","User is saved in Firestore")
    }

}
