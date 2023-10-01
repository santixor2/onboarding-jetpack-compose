package com.example.onboardingjetpackcompose

sealed class Screen(val route : String){
    object Welcome : Screen(route = "Welcome_screen")
    object Home : Screen(route = "Home_screen")
}
