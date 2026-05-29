class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val temp = mutableMapOf<Int, Int>()
        var answer = mutableSetOf<Int>()

        for((index, i) in nums.withIndex()) {
            if(temp.containsKey(target - i)) {
                answer.add(index)
                answer.add(temp.getValue(target - i))

                break
            }

            temp.put(i, index)
        }

        return answer.toIntArray()
    }
}