package com.example.onboardingjetpackcompose.util

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
        title = "Busca donantes de Sangre",
        description = "+++++++++++++++++"
    )
    object Second : OnBoardingPage(
        image = R.drawable.secondonbor,
        title = "Realiza una peticion de donacion",
        description = "++++++++++++++"
    )
    object Third : OnBoardingPage(
        image = R.drawable.splashbloodred,
        title = "Puede donar para los necesitados y solicitar sangre si necesita",
        description = "+++++++++++++++"
    )
}
