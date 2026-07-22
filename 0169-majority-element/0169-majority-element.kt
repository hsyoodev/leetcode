class Solution {
    fun majorityElement(nums: IntArray): Int {
        val map = mutableMapOf<Int, Int>()

        nums.forEach { num -> 
            map.put(num, map.getOrDefault(num, 0) + 1)
        }

        return map.filter { it.value > (nums.size / 2) }.firstNotNullOf { it.key }
    }
}
