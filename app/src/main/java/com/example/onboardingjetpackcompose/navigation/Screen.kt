package com.example.onboardingjetpackcompose.navigation

sealed class Screen(val route : String){
    object Welcome : Screen(route = "Welcome_screen")
    object Home : Screen(route = "Home_screen")
    object SignUp : Screen(route = "SignUp_screen")
}
