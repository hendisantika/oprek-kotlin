package com.hendisantika.oprek.campuran

/**
 * Created by hendisantika on 7/1/17.
 */
fun main(args: Array<String>) {

    val fullPath = "Kotlination/Kotlin/Practice/getFileNameExample.kt"

    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(fullPath)

    if (matchResult != null) {
        val (directory, fileName, extension) = matchResult.destructured
        println("dir: $directory | fileName: $fileName | extension: $extension")
    }
}