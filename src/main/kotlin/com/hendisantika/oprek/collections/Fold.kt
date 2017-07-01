package com.hendisantika.oprek.collections

/**
 * Created by hendisantika on 7/1/17.
 */
fun main(args: Array<String>) {

    val total = listOf(1, 2, 3, 4, 5).fold(0, { total, next -> total + next })
    println("total: " + total)

    val mul = listOf(1, 2, 3, 4, 5).fold(1, { mul, next -> mul * next })
    println("mul: " + mul)

    val productList = listOf(
            Product("A", 100),
            Product("B", 200),
            Product("C", 300),
            Product("D", 400),
            Product("E", 500)
    )

    val quantity = productList.map { it.quantity }.fold(0, { total, next -> total + next })
    println("quantity: " + quantity)
}