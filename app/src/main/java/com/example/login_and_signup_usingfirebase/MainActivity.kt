package com.example.login_and_signup_usingfirebase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.login_and_signup_usingfirebase.navigation.MyAppNavigation
import com.example.login_and_signup_usingfirebase.pages.AuthViewModel
import com.example.login_and_signup_usingfirebase.ui.theme.Login_And_SignUp_UsingFireBaseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val authViewModel = AuthViewModel()
        setContent {
            Login_And_SignUp_UsingFireBaseTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MyAppNavigation(authViewModel = authViewModel, modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

