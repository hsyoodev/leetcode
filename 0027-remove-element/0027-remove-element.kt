class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var k = 0
        
        nums.forEachIndexed { index, num ->
            if(num != `val`) {
                nums[k++] = num
            }
        }

        return k
    }
}