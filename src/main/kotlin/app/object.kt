package app

import data.Person

fun main() {
    val bagas = Person()
    bagas.firstName = "Bagas"
    bagas.lastName = "Harfianto"
    val ara = Person()
    val izor = Person()

    println(bagas.firstName+" "+bagas.lastName)
}