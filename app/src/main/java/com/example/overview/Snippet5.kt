package com.example.overview

import com.example.srpsamples.dummy.User
import com.example.overview.dummy.UserReferral

interface UserRepo {
    fun saveUser(user: User)

    fun deleteUser(user: User)

    fun saveUserReferral(userReferral: UserReferral)
}