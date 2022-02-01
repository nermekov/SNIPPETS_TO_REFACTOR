package com.example.overview

import com.example.overview.dummy.action1
import com.example.overview.dummy.action2
import com.example.overview.dummy.action4
import com.example.overview.dummy.action5

fun branches5(action: String) {
    when (action) {
        "a1" -> {
            action1()
        }
        "a2" -> {
            action2()
        }
        "a3" -> {
            action4()
            action5()
        }
    }
}