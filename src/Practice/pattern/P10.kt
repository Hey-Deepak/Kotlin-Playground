package org.example.Practice.pattern

fun main() {
    val line = readln().toInt()

    for (i in 0..line * 2){
        if (i <= line){
            for (j in 1..i){
                print("*")
            }
        } else {
            for (k in 1..< line * 2 - i){
                print("*")
            }
        }
        println()
    }
}