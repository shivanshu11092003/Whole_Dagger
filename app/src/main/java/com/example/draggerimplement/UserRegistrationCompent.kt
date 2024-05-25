package com.example.draggerimplement

import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [UserRegistrationModule::class,EmailServiceModule::class])
interface UserRegistrationCompent {
//    //component ke through ham batate hai ki hame konsa object cchhaihye
//
//    fun getUserRegistrationService() : UserRegistrationService
//    //iska object chaihye ye idhar bta diya par ye  object bnega kaise vo ham UserRegistrationService ke andar
//    // @inject constructor lga ke pass karenge
//
//    fun  getEmaillService() :emailService
                    /*  upar vale code me hame bar bar ek ek ko define karna padega agar ahme 50 chaihye hongi
                    * to  50 function bannene pandege so we have different method to call all require function
                    *  let go then    */
    fun inject(mainActivity: MainActivity)

    fun getemailService() : emailService

    @Component.Factory
    interface Factory{
        fun Create(@BindsInstance retryCount: Int) :UserRegistrationCompent

    }
}