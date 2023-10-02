package com.example.onboardingjetpackcompose.feature_authentication.presentation.login

data class LoginState(
    val isLoading: Boolean = false,
    val isSuccess: String? = "",
    val isError: String? = ""
)
