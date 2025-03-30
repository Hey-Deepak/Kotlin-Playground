package org.example.CodeChef

fun main() {
    println(
        isAnagram(
            s = "ggii",
            t = "eekk"
        )
    )
}

fun isAnagram(s: String, t: String): Boolean {
    return s.toCharArray().sorted() == t.toCharArray().sorted()
}