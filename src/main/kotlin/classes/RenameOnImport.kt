package com.resk.classes

import kotlin.random.Random as rR
import java.util.Random as uR

fun useDifferentRandomClasses(): String {
    return "Kotlin random: " +
            rR.nextInt(2) +
            " Java random:" +
            uR().nextInt(2) +
            "."
}