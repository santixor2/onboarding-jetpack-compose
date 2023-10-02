package com.example.onboardingjetpackcompose.util

import java.lang.Exception

sealed class ResultState<T>(val data: T? = null, val message: String? = null){
    class Success<T>(data: T) : ResultState<T>(data)
    class Error<T>(message: String, data: T? = null) : ResultState<T>(data, message)
    class Loading<T>(data: T? = null) : ResultState<T>(data)
}
