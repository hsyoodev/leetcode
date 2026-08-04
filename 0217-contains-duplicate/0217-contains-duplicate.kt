class Solution {
    val set = mutableSetOf<Int>()

    fun containsDuplicate(nums: IntArray): Boolean {
        for(num in nums) {
            if(!set.add(num)) {
               return true 
            }
        }

        return false
    }
}
