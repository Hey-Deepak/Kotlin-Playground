package org.example.Practice.pattern

fun main() {
    val line = readln().toInt()

    for (i in 1..line) {
        for (j in  1..< i) {
            print(" ")
        }
        for (k in  1..< (line - i) * 2) {
            print("*")
        }
        println()
    }
}