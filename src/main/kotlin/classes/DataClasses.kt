package com.resk.classes

data class Person(val name: String, val age:Int)

fun getPeople(): List<Person> {
    return listOf(Person("Alice", 29), Person("Bob", 31))
}

fun comparePeople(): Boolean {
    val myInteger: java.lang.Integer = java.lang.Integer(20)
    val p1 = Person("Alice", 29)
    val p2 = Person("Alice", 29)
    return p1 == p2  // should be true
}