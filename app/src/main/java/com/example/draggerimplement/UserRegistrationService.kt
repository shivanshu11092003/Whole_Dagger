package com.example.draggerimplement

import javax.inject.Inject


class UserRegistrationService @Inject constructor(
    //iske andar bhi do class hai unka constructor kaise call hoga vo bhi inhi class ke andar
    // define hoga
    private val userRepository: userRepository,
    @MessageQulifier private val notifiactionService: NotifiactionService
) {

    fun registerUser(email:String,password:String){
        userRepository.saveUser(email,password)
        notifiactionService.Send(email,"Shivanshugupta@gmail.com","Welcome User")
    }
}