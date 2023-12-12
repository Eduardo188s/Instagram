package com.example.instagramclone.domain.use_cases.PostsUseCases

import javax.inject.Inject

data class PostsUseCases @Inject constructor(
    var getAllPosts: GetAllPosts,
    var uploadPost: UploadPost
)
