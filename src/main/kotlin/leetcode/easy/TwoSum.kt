package leetcode.easy

fun twoSum(nums: IntArray, target: Int): IntArray {
    nums.onEachIndexed { indexi, i ->
        nums.onEachIndexed { indexj, j ->
            if (indexi != indexj && i+j == target){
                return intArrayOf(indexi, indexj)
            }
        }
    }
    return IntArray(2)
}