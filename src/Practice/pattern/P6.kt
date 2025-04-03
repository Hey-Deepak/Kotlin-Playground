package org.example.Practice.pattern

fun main() {
    val line = readln().toInt()

    for (i in 0..line){
        for (j in 1..line-i){
            print(j)
        }
        println()
    }
}