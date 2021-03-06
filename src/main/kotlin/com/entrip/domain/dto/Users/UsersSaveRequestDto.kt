package com.entrip.domain.dto.Users

import com.entrip.domain.entity.Users

class UsersSaveRequestDto (
    val user_id : String,
    val nickname : String,
    val gender : Int,
    val photoUrl : String? = null
){
    fun toEntity() : Users {
        return Users(
            user_id = user_id,
            nickname = nickname,
            gender = gender,
            photoUrl = photoUrl
        )
    }
}