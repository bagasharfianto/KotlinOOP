package app

import data.Car

fun main() {
    val toyota = Car("Toyota",2021)
    toyota.brand = "Honda"

    println(toyota.brand)
}