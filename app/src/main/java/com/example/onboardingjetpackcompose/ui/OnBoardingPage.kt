package com.example.onboardingjetpackcompose.ui

import androidx.annotation.DrawableRes
import com.example.onboardingjetpackcompose.R

sealed class OnBoardingPage(
    @DrawableRes
    val image : Int,
    val title : String,
    val description : String
){
    object First : OnBoardingPage(
        image = R.drawable.firstonbor,
        title = "meeting",
        description = "vamos vamos "
    )
    object Second : OnBoardingPage(
        image = R.drawable.secondonbor,
        title = "locuras ",
        description = "mira vos"
    )
    object Third : OnBoardingPage(
        image = R.drawable.splashbloodred,
        title = "sangrita",
        description = "que sangrita"
    )
}
