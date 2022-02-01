package com.example.overview

import com.example.overview.dummy.action1
import com.example.overview.dummy.action2
import com.example.overview.dummy.action4

fun doSomeActions2(z: Int) {
    if (z > 6){
        action1()
        action4()
    }
    else action2()
}