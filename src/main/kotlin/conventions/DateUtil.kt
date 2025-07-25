package com.resk.conventions

import java.util.*


fun MyDate.followingDate(): MyDate {
    val c = Calendar.getInstance()
    c.  set (year, month, dayOfMonth)
    val millisecondsInADay = 24 * 60 * 60 * 1000L
    val timelnMillis = c.timeInMillis + millisecondsInADay
    val result = Calendar.getInstance()
    result.timeInMillis = timelnMillis
    return MyDate(result.get(Calendar.YEAR), result.get(Calendar. MONTH) , result.get (Calendar. DATE))
}

fun MyDate.addTimeIntervals(timeInterval: TimeInterval, amount: Int): MyDate {
    val c = Calendar.getInstance()
    c.set(year + if (timeInterval == TimeInterval.YEAR) amount else 0, month, dayOfMonth)
    var timeInMillis = c.timeInMillis
    val millisecondsInADay = 24 * 60 * 60 * 1000L
    timeInMillis += amount * when (timeInterval) {
        TimeInterval.DAY -> millisecondsInADay
        TimeInterval.WEEK -> 7 * millisecondsInADay
        TimeInterval.YEAR -> 0L
    }
    val result = Calendar.getInstance()
    result.timeInMillis = timeInMillis
    return MyDate(result.get(Calendar.YEAR), result.get(Calendar.MONTH), result.get(Calendar.DAY_OF_MONTH))
}