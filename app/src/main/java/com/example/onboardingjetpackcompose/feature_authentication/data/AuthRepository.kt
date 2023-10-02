package com.example.onboardingjetpackcompose.feature_authentication.data

import com.example.onboardingjetpackcompose.util.ResultState
import com.google.firebase.auth.AuthCredential
import com.google.firebase.auth.AuthResult
import kotlinx.coroutines.flow.Flow

interface AuthRepository {
    fun loginUser(email: String, password: String): Flow<ResultState<AuthResult>>
    fun registerUser(email: String, password: String): Flow<ResultState<AuthResult>>

    //fun googleSignIn(credential: AuthCredential): Flow<ResultState<AuthResult>>
}