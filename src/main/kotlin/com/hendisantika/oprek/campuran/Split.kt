package com.hendisantika.oprek.campuran

/**
 * Created by hendisantika on 7/1/17.
 */
fun main(args: Array<String>) {
    val str = "Kotlination.com = Be Kotlineer - Be Simple - Be Connective"

    val separate1 = str.split("=|-".toRegex())
    println(separate1)

    val separate2 = str.split(" = "," - ")
    println(separate2)
}