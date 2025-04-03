package org.example.Practice.pattern

fun main() {
    val line = readln().toInt()

    repeat(line){
        repeat(line){
            print("*")
        }
        println()
    }
}