package com.example.onboardingjetpackcompose.feature_authentication.presentation.signup

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.onboardingjetpackcompose.feature_authentication.data.AuthRepository
import com.example.onboardingjetpackcompose.feature_authentication.presentation.login.LoginState
import com.example.onboardingjetpackcompose.util.ResultState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import javax.inject.Inject
@HiltViewModel
class SignUpViewModel @Inject constructor(private val repository: AuthRepository): ViewModel() {

    val _signUpState = Channel<LoginState>()
    val signUpState = _signUpState.receiveAsFlow()

    fun SignUpUser(email : String, password :String) = viewModelScope.launch {
        repository.loginUser(email, password).collect{ result ->
            when(result){
                is ResultState.Error -> _signUpState.send(LoginState(isError = result.message))
                is ResultState.Loading -> _signUpState.send(LoginState(isLoading = true))
                is ResultState.Success -> _signUpState.send(LoginState(isSuccess = "Sign In Success "))
            }
        }
    }
}