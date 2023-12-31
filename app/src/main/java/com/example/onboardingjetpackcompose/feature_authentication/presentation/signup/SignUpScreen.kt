package com.example.onboardingjetpackcompose.feature_authentication.presentation.signup

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.onboardingjetpackcompose.R
import com.example.onboardingjetpackcompose.navigation.Screen
import com.example.onboardingjetpackcompose.ui.theme.lightBlue
import com.example.onboardingjetpackcompose.ui.theme.prueba
import kotlinx.coroutines.launch

@Composable
fun SignUpScreen(
){
        var email by rememberSaveable { mutableStateOf("") }
        var password by rememberSaveable { mutableStateOf("") }
        val scope = rememberCoroutineScope()
        val context = LocalContext.current

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.splashbloodred),
                contentDescription = "foto",
                contentScale = ContentScale.Fit,
                modifier = Modifier.size(250.dp).padding(top = 25.dp)
//                modifier = Modifier.padding(bottom = 10.dp),
//                text = "Create Account",
//                fontWeight = FontWeight.Bold,
//                fontSize = 35.sp,
            )

            TextField(
                modifier = Modifier.fillMaxWidth().padding(top = 50.dp),
                value = email,
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = prueba,
                    cursorColor = Color.Black,
                    disabledLabelColor = lightBlue,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                onValueChange = {
                    email = it

                },
                shape = RoundedCornerShape(8.dp),
                singleLine = true,
                placeholder = {
                    Text(text = "Email")
                }
            )

            Spacer(modifier = Modifier.height(24.dp))
            TextField(
                modifier = Modifier.fillMaxWidth(),
                value = password,
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = prueba,
                    cursorColor = Color.Black,
                    disabledLabelColor = lightBlue,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                onValueChange = {
                    password = it
                },
                shape = RoundedCornerShape(8.dp),
                singleLine = true,
                placeholder = {
                    Text(text = "Password")
                }
            )
            Button(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 50.dp, start = 30.dp, end = 30.dp),
                shape = RoundedCornerShape(15.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red)
            ) {
                Text(
                    text = "Iniciar Sesion",
                    color = Color.White,
                    modifier = Modifier.padding(7.dp),
                    fontSize = 15.sp
                )
            }
        }
    }
//    var email by rememberSaveable { mutableStateOf("") }
//    var password by rememberSaveable { mutableStateOf("") }
//    val scope = rememberCoroutineScope()
//    val context = LocalContext.current
//    val state = viewModel.signUpState.collectAsState(initial = null)
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(start = 30.dp, end = 30.dp),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Text(
//            text = "Enter yout credential to register",
//            fontWeight = FontWeight.Medium,
//            fontSize = 15.sp,
//            color = Color.Gray
//        )
//        TextField(
//            modifier = Modifier.fillMaxWidth(),
//            value = email,
//            colors = TextFieldDefaults.textFieldColors(
//                backgroundColor = lightBlue,
//                cursorColor = Color.Black,
//                disabledLabelColor = lightBlue,
//                focusedIndicatorColor = Color.Transparent,
//                unfocusedIndicatorColor = Color.Transparent
//            ),
//            onValueChange = {
//                email = it
//
//            },
//            shape = RoundedCornerShape(8.dp),
//            singleLine = true,
//            placeholder = {
//                Text(text = "Email")
//            }
//        )
//        Spacer(modifier = Modifier.height(16.dp))
//        TextField(
//            modifier = Modifier.fillMaxWidth(),
//            value = password,
//            colors = TextFieldDefaults.textFieldColors(
//                backgroundColor = lightBlue,
//                cursorColor = Color.Black,
//                disabledLabelColor = lightBlue,
//                focusedIndicatorColor = Color.Transparent,
//                unfocusedIndicatorColor = Color.Transparent
//            ),
//            onValueChange = {
//                password = it
//            },
//            shape = RoundedCornerShape(8.dp),
//            singleLine = true,
//            placeholder = {
//                Text(text = "Password")
//            }
//        )
//        Button(onClick = {
//            scope.launch {
//             viewModel.SignUpUser(email, password)
//         }
//
//        }, modifier = Modifier
//            .fillMaxWidth()
//            .padding(top = 20.dp, start = 30.dp, end = 30.dp),
//            colors = buttonColors(contentColor = Color.White), shape = RoundedCornerShape(15.dp)
//        ) {
//            Text(text = "Sign Up", color = Color.White, modifier = Modifier.padding(7.dp))
//        }
//        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
//            if (state.value?.isLoading == true) {
//                CircularProgressIndicator()
//            }
//        }
//        Text(
//            modifier = Modifier.padding(15.dp),
//            text = "Already Have an account? sign In",
//            fontWeight = FontWeight.Bold, color = Color.Black
//        )
//        Text(
//            modifier = Modifier.padding(top = 40.dp,),
//            text = "Or connect with",
//            fontWeight = FontWeight.Medium, color = Color.Gray
//        )
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(top = 10.dp),
//            horizontalArrangement = Arrangement.Center
//        ){
//            IconButton(onClick = { /*TODO*/ }) {
//                Icon(
//                    modifier = Modifier.size(50.dp),
//                    painter = painterResource(id = R.drawable.ic_google),
//                    contentDescription = "Google Icon",
//                    tint = Color.Unspecified
//                )
//            }
//        }
//        Spacer(modifier = Modifier.width(20.dp))
//        IconButton(onClick = { /*TODO*/ }) {
//            Icon(
//                modifier = Modifier.size(50.dp),
//                painter = painterResource(id = R.drawable.ic_facebook),
//                contentDescription = "Facebook Icon",
//                tint = Color.Unspecified
//            )
//        }
//        LaunchedEffect(key1 = state.value?.isSuccess ){
//            if(state.value?.isSuccess?.isNotEmpty() == true){
//                val sucess = state.value?.isSuccess
//                Toast.makeText(context,"${sucess}",Toast.LENGTH_SHORT).show()
//            }
//        }
//        LaunchedEffect(key1 = state.value?.isError ){
//            if(state.value?.isError?.isNotEmpty() == true){
//                val sucess = state.value?.isError
//                Toast.makeText(context,"${sucess}",Toast.LENGTH_SHORT).show()
//            }
//        }
//    }
//}
@Composable
@Preview(showBackground = true)
fun SignUpPreview(){
    Column(modifier = Modifier.fillMaxSize()) {
        SignUpScreen()
    }
}