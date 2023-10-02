package com.example.onboardingjetpackcompose.feature_authentication.data

import com.example.onboardingjetpackcompose.util.ResultState
import com.google.firebase.auth.AuthCredential
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.tasks.await
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(private val firebaseAuth: FirebaseAuth) : AuthRepository {
    override fun loginUser(email: String, password: String): Flow<ResultState<AuthResult>> {
        return flow {
            emit(ResultState.Loading())
            val result = firebaseAuth.signInWithEmailAndPassword(email, password).await()
            emit(ResultState.Success(result))
        }.catch{
            emit(ResultState.Error(it.message.toString()))
        }
    }

    override fun registerUser(email: String, password: String): Flow<ResultState<AuthResult>> {
        return flow {
            emit(ResultState.Loading())
            val result = firebaseAuth.createUserWithEmailAndPassword(email, password).await()
            emit(ResultState.Success(result))
        }.catch{
            emit(ResultState.Error(it.message.toString()))
        }
    }

//    override fun googleSignIn(credential: AuthCredential): Flow<ResultState<AuthResult>> {
//        TODO("Not yet implemented")
//    }
}