package com.example.instagramclone.domain.model

data class User(
    var name : String = "",
    var userName : String = "",
    var userid : String = "",
    var email : String = "",
    var password : String = "",
    val imageUrl : String = "",
    var following : List<String> = emptyList(),
    var followers : List<String> = emptyList(),
    var totalPosts : String = "",
    var bio : String = "",
    var url : String = ""
)
