package com.resk.introduction

fun containsEven(collection: Collection<Int>): Boolean =
    collection.any { it % 2 == 0 }