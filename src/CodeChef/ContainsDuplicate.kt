package org.example.CodeChef

fun main() {
    println(
        containsDuplicate(nums = intArrayOf(1, 2, 3, 1))
    )

}

fun containsDuplicate(nums: IntArray): Boolean {
    return nums.distinct().size < nums.size
}