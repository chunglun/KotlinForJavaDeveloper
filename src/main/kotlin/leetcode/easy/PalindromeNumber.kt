package leetcode.easy

fun isPalindrome(x: Int): Boolean {
    if (x < 0) return false
    val xStr = x.toString()
    return xStr == xStr.reversed()
}