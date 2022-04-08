package leetcode.easy

import io.kotlintest.shouldBe
import io.kotlintest.specs.FunSpec

class TwoSumTestKotlin : FunSpec() {
    init {
        test("test 1") {
            val result = twoSum(intArrayOf(2, 7, 11, 15), 9)
            result[0] shouldBe 0
            result[1] shouldBe 1
        }

        test("test 2") {
            val result = twoSum(intArrayOf(3, 2, 4), 6)
            result[0] shouldBe 1
            result[1] shouldBe 2
        }

        test("test 3") {
            val result = twoSum(intArrayOf(3, 3), 6)
            result[0] shouldBe 0
            result[1] shouldBe 1
        }

        test("test 4") {
            val result = twoSum(intArrayOf(1, 6, 8, 2, 5, 9, 5), 8)
            result[0] shouldBe 1
            result[1] shouldBe 3
        }
    }
}