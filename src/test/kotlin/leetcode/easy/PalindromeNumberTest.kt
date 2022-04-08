package leetcode.easy

import io.kotlintest.shouldBe
import io.kotlintest.specs.FunSpec

class PalindromeNumberTest : FunSpec() {
    init {
        test("test 1") {
            val result = isPalindrome(121)
            result shouldBe true
        }
        test("test 2") {
            val result = isPalindrome(-121)
            result shouldBe false
        }
        test("test 3") {
            val result = isPalindrome(10)
            result shouldBe false
        }
        test("test 4") {
            val result = isPalindrome(986535689)
            result shouldBe true
        }
        test("test 5") {
            val result = isPalindrome(-986535689)
            result shouldBe false
        }
    }
}