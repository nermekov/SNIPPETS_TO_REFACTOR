package com.example.overview

import android.content.Context
import com.example.overview.dummy.BeelineSmsService
import com.example.overview.dummy.SmsService

class Presenter5(context: Context) {
    internal val smsService: SmsService = BeelineSmsService(context, {})

    /*
    Logic
     */
}