package com.example.instagramclone.domain.use_cases.AuthenticationUseCases

import com.example.instagramclone.domain.repository.AuthenticationRepository
import javax.inject.Inject

class IsUseAuthenticated @Inject constructor(
    private val repository: AuthenticationRepository
) {
    operator fun invoke() = repository.isUserAuthenticatedInFirebase()
}