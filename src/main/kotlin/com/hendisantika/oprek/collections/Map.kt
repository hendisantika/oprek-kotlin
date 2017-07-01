package com.hendisantika.oprek.collections

/**
 * Created by hendisantika on 7/1/17.
 */
fun main(args: Array<String>) {

    val productMap = mapOf(
            "a" to Product("A", 100),
            "b" to Product("B", 200),
            "c" to Product("C", 300),
            "d" to Product("C", 400),
            "e" to Product("C", 500)
    )

    val quantity = productMap.map { it.value.quantity }.fold(0, { total, next -> total + next })
    println("quantity: " + quantity)
}