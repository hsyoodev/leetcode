class Solution {
    fun singleNumber(nums: IntArray): Int {
        var answer = 0

        nums.forEach { num -> 
            answer = answer xor num
        }

        return answer
    }
}
