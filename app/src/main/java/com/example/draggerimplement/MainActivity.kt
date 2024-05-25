package com.example.draggerimplement

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.draggerimplement.ui.theme.DraggerImplementTheme
import javax.inject.Inject

class MainActivity : ComponentActivity() {
    // latenit method 3 is field innjection method
    @Inject
    lateinit var userRegistrationService: UserRegistrationService






    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        /**
         * Method 1
         * val emailService = emailService()
        val userRepository = UserRepository()
        val userRegistrationService = UserRegistrationService(userRepository,emailService)


        upar vala kam nhi karna padega aur ham kanhi hame userragistration cahihye hoga
        niche jaise dagger call karke bna lenge
         **/


        /** **/
        /** Method -2
         * val userRegistrationService= DaggerUserRegistrationCompent.builder()
        .build().getUserRegistrationService()
        val emailService = DaggerUserRegistrationCompent.builder().build()
        .getEmaillService()

         **/

        /**  Method 3**/

        /** when we want to pass dynamic value then we our module to pass that value and we use it and component build karte time dynamic
         * vale object hame khud banna padega ".emailServiceModule(EmailServiceModule(3))"
         *
         * if  .emailServiceModule(EmailServiceModule(3))  do not call this (if module accepting some value so we have create module by ourself )
         * if we donot want to make Module then we have then we have to use of ""Factory""**/
        val appComponent=(application as ApplicationLevelDragger).appLevelComponent
        val userRegistrationCompent = DaggerUserRegistrationCompent.factory()
            .Create(4,appComponent).inject(this)




        userRegistrationService.registerUser("Shivanshugupta@gmail.com","12345")







        //Now we get email service also through mwthod 3


            setContent {
            DraggerImplementTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DraggerImplementTheme {
        Greeting("Android")
    }
}