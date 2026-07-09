class Solution {
    fun singleNumber(nums: IntArray): Int {
        val map = mutableMapOf<Int, Int>()

        nums.forEach { num -> 
            map[num] = map.getOrDefault(num, 0) + 1
        }

        return map.entries.first { it.value == 1 }.key
    }
}
