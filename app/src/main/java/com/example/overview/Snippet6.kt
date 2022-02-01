package com.example.overview

import com.example.overview.dummy.action1
import com.example.overview.dummy.action2

fun doSomeActions(z: Int) {
    if (z > 6)
        action1()
    else action2()

    if (System.currentTimeMillis() > 6)
        action2()
}