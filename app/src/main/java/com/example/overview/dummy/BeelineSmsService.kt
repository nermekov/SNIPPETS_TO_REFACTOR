package com.example.overview.dummy

import android.content.Context
import com.example.dv.SmsService

class BeelineSmsService(
    private val context: Context,
    private val onSmsReceived: (String) -> Unit
) : SmsService {
    var counter = 1;

    override fun increase() {
        counter++
    }
}