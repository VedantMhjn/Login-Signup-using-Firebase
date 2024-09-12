package com.example.login_and_signup_usingfirebase

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.login_and_signup_usingfirebase.pages.HomePage
import com.example.login_and_signup_usingfirebase.pages.LoginPage
import com.example.login_and_signup_usingfirebase.pages.SignUpPage

@Composable
fun MyAppNavigation(modifier: Modifier = Modifier, authViewModel: AuthViewModel) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "login") {
        composable(route = "login") {
            LoginPage(modifier = Modifier, navController = navController, authViewModel = authViewModel)
        }
        composable(route = "signup") {
            SignUpPage(modifier = Modifier, navController = navController, authViewModel = authViewModel)
        }
        composable(route = "home") {
            HomePage(modifier = Modifier, navController = navController, authViewModel = authViewModel)
        }

    }
}