class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        val distinctNums = nums.distinct()

        distinctNums.forEachIndexed {index, num ->
            nums[index] = num
        }

        return distinctNums.count()
    }
}