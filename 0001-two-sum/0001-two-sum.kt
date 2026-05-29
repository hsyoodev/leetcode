class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val temp = mutableMapOf<Int, Int>()

        nums.forEachIndexed { index, i -> 
            if (temp.containsKey(target - i)) {
                return intArrayOf(temp.getValue(target - i), index)
            }

            temp[i] = index
        }

        return intArrayOf()
    }
}
