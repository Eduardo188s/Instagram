package com.example.instagramclone.util

sealed class Screens(val route:String){
    object SplashScreen: Screens("splash_screen")
    object  LoginScreen: Screens("Login_screen")
    object SignUpScreen: Screens("signUp_screen")
    object FeedsScreen : Screens("feeds_screen")
    object ProfileScreen : Screens("profile_screen")
    object SearchScreen : Screens("search_screen")
}
