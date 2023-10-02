package com.example.onboardingjetpackcompose.feature_authentication.presentation.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.onboardingjetpackcompose.feature_authentication.data.AuthRepository
import com.example.onboardingjetpackcompose.util.ResultState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import javax.inject.Inject
@HiltViewModel
class LoginViewModel @Inject constructor(private val repository: AuthRepository): ViewModel() {

    val _signInState = Channel<LoginState>()
    val signInState = _signInState.receiveAsFlow()

    fun loginUser(email : String, password :String) = viewModelScope.launch {
        repository.loginUser(email, password).collect{ result ->
            when(result){
                is ResultState.Error -> _signInState.send(LoginState(isError = result.message))
                is ResultState.Loading -> _signInState.send(LoginState(isLoading = true))
                is ResultState.Success -> _signInState.send(LoginState(isSuccess = "Sign In Success "))
            }
        }
    }
}