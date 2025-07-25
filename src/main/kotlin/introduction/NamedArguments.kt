package com.resk.introduction

fun joinOptions(options: Collection<String>) =
    options.joinToString(prefix = "[", postfix = "]")