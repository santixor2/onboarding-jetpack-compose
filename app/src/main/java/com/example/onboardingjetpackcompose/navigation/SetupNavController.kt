package com.example.onboardingjetpackcompose.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.onboardingjetpackcompose.feature_authentication.presentation.signup.SignUpScreen
import com.example.onboardingjetpackcompose.feature_onboarding.presentation.screen.HomeScreen
import com.example.onboardingjetpackcompose.feature_onboarding.presentation.screen.WelcomeScreen
import com.google.accompanist.pager.ExperimentalPagerApi

@ExperimentalPagerApi
@ExperimentalAnimationApi
@Composable
fun SetupNavGraph(
    navController : NavHostController,
    startDestination : String
){
    NavHost(
        navController = navController,
        startDestination = startDestination
    ){
        composable(route = Screen.Welcome.route){
            WelcomeScreen(navController = navController)
        }
        composable(route = Screen.Home.route){
            HomeScreen()
        }
        composable(route = Screen.SignUp.route){
            SignUpScreen()
        }
    }

}