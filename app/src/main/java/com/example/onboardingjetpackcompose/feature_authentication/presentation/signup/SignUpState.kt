package com.example.onboardingjetpackcompose.feature_authentication.presentation.signup

data class SignUpState(
    val isLoading: Boolean = false,
    val isSuccess: String? = "",
    val isError: String? = ""
)
