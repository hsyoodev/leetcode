class Solution {
    fun missingNumber(nums: IntArray): Int {
        nums.sort()

        for(i in 0..nums.last()) {
            if(i != nums[i]) {
                return i
            }
        }

        return nums.last() + 1        
    }
}
