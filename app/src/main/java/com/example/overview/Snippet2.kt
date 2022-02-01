package com.example.overview

import com.example.overview.dummy.loadUiDataForUI
import com.example.overview.dummy.notificationManager
import com.example.overview.dummy.repo

fun sendNotificationToUsers() {
    loadUiDataForUI()
    val users = repo.fetchUsers()
    notificationManager.sendTo(users)
}