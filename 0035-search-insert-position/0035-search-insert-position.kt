class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        return nums.binarySearch(target).let {
            if(it >= 0) it 
            else -(it + 1)
        }
    }
}
