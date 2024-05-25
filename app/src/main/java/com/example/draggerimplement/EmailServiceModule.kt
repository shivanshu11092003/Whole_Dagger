package com.example.draggerimplement

import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class EmailServiceModule(){



    //Method -1 to use provides
    /** @Provides
    fun getNotifiactionService ( emailService: emailService): NotifiactionService {
    return emailService
    } **/
    @ActivityScope
    @MessageQulifier
    @Provides
    fun getNotifiactionService(retryCount:Int): NotifiactionService {
        return MessageService(retryCount)
    }


    @Named("Email")
    @Provides
    fun getNotifiactionServiceofemail() : NotifiactionService{
        return emailService()
    }

    //Method 2 to use Binds
    /**@Named("Email")
    @Binds
    abstract fun getNotifiactionService(emailService: emailService): NotifiactionService
    } **/





}