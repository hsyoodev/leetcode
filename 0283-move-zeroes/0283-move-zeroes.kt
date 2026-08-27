class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var nonZeroCount = 0

        for(num in nums) {
            if(num != 0) {
                nums[nonZeroCount++] = num
            }
        }

        for(i in nonZeroCount until nums.size) {
            nums[i] = 0
        }
    }
}
