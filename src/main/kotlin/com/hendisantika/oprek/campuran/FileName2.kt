package com.hendisantika.oprek.campuran

/**
 * Created by hendisantika on 7/1/17.
 */
fun main(args: Array<String>) {

    val fullPath = "Kotlination/Kotlin/Practice/getFileNameExample.kt"

    val directory = fullPath.substringBeforeLast("/")
    val fullName = fullPath.substringAfterLast("/")
    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")

    println("dir: $directory | fileName: $fileName | extension: $extension")
}