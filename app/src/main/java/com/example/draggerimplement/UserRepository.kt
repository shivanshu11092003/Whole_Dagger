package com.example.draggerimplement

import android.util.Log
import javax.inject.Inject

interface userRepository{
    fun saveUser(email:String,password:String)

}
@ActivityScope
class SQLRepository @Inject constructor(val analyticSevice: AnalyticSevice) : userRepository{


    override fun saveUser(email:String, password:String){
        Log.d("SaveUser","User is saved in Db")
        analyticSevice.tractEvent("saveUser","Create")
    }
}
class FireBaseRepository(val analyticSevice: AnalyticSevice) : userRepository{
    override fun saveUser(email: String, password: String) {
        Log.d("SaveUser","User is saved in Firestore")
        analyticSevice.tractEvent("saveUser","Create")
    }

}
