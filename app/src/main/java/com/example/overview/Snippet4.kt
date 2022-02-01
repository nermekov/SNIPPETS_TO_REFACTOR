package com.example.overview

import com.example.srpsamples.dummy.User
import java.util.*

interface EmployeeRepo {
    fun addUser(user: User)

    fun getUser(): User

    fun updateUser(user: User)

    fun removeUser()

    fun hireUser(user: User)

    fun checkUserHaveCredit(user: User): Boolean

    fun updateUserBirthDate(birthday: Date)
}