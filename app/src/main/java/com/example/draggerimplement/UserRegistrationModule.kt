package com.example.draggerimplement

import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class UserRegistrationModule{



    /** I can use @Binds inpleace of @Provides by making class and function to abstract just like notifiaction Module**/
    @ActivityScope
    @Provides
    fun getuserRepository(sqlRepository: SQLRepository) : userRepository{
        return sqlRepository
    }
}