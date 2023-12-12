package com.example.instagramclone.domain.use_cases.AuthenticationUseCases

data class AuthenticationUseCases (
    val isUseAuthenticated: IsUseAuthenticated,
    val firebaseAuthState: FirebaseAuthState,
    val firebaseSignIn: FirebaseSignIn,
    val firebaseSignOut: FirebaseSignOut,
    val firebaseSignUp: FirebaseSignUp
)