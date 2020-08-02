package io.github.aishrath.euler

/*
* A palindromic number reads the same both ways.
* The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
*
* Find the largest palindrome made from the product of two 3-digit numbers.
*/

fun main() {
    print((100_001..999 * 999).filter { it.isPalindrome() && it.isProductOfTwoThreeDigitNums() })
    //print((100_001..999 * 999).filter { it.isPalindrome() })
    //print((100_001..999 * 999).filter { it.isProductOfTwoThreeDigitNums() }.max())
}

private fun Int.isProductOfTwoThreeDigitNums(): Boolean {
    val s = mutableListOf<Int>()
    for (x in 100..999) {
        if (this % x == 0) {
            s.add(x)
        }
    }
    println("$this --> $s")
    return false
}

private fun Int.isPalindrome(): Boolean {
    val (x, y) = this.toString().chunked(3)
    return x == y.reversed()
}




