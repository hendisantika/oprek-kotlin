package com.hendisantika.oprek.lazy

/**
 * Created by hendisantika on 7/1/17.
 */
class BookManager {

    companion object {

        fun loadBooks(person: Person2): List<String> {

            println("Load books for ${person.name}")
            return listOf("Master Kotlin at Kotlination", "Be Happy to become Kotlineer")
        }

    }
}

data class Person2(val name: String) {

    val books by lazy { BookManager.loadBooks(this) }
}

fun main(args: Array<String>) {

    val person = Person2("Hendi")

    println(person.books)

    println("--- call again ---")
    println(person.books)
}