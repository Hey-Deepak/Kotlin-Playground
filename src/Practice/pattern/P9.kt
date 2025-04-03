package org.example.Practice.pattern

fun main() {
    val line = readln().toInt()

    for (i in 1..line * 2){
        if (i <= 5){
            for (j in 1.. line - i){
                print(" ")
            }
            for (j in 1..< i * 2){
                print("*")
            }
        } else {
            for (k in  1..< i - line){
                print(" ")
            }
            for (l in 1.. (line * 2 - i ) * 2 + 1){
                print("*")
            }
        }
        println()
    }
}