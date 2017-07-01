package com.hendisantika.oprek.campuran

/**
 * Created by hendisantika on 7/1/17.
 */
object Singleton {

    var message: String = "default Message"

    init {
        println("Initializing object: $this")
    }

    fun showSingleMessage() {
        println("Message: " + message)
    }

    fun setSingleMessage(message: String) {
        this.message = message
    }
}

fun main(args: Array<String>) {

    println("--- Singleton ---")
    println(Singleton.message)

    Singleton.showSingleMessage()
    Singleton.setSingleMessage("Hello Kolination!")

    println("--- singleton1 ---")
    val singleton1 = Singleton
    singleton1.showSingleMessage()
    Singleton.setSingleMessage("Hello Kolineer!")

    println("--- singleton2 ---")
    val singleton2 = Singleton
    singleton2.showSingleMessage()
}