package com.example.instagramclone.domain.use_cases.PostsUseCases

import com.example.instagramclone.domain.repository.PostRepository
import javax.inject.Inject

class UploadPost @Inject constructor(
    private val repository: PostRepository
){
    operator fun invoke(
        userid : String, userName : String, userImage : String,
        postImage : String, postDescription : String, time : Long
    ) = repository.uploadPost(
        userId = userid,
        userImage = userImage,
        userName = userName,
        postDescription = postDescription,
        postImage = postImage,
        time = time
    )
}