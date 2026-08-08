class Solution {
    fun summaryRanges(nums: IntArray): List<String> {
        val answer = mutableListOf<String>()
        var start = 0
        
        if(nums.isEmpty()) {
            return answer
        }

        for(i in 1 until nums.size) {
            if((nums[i] - 1) != nums[i - 1]) {
                if(nums[start] == nums[i - 1]) {
                    answer.add("${nums[start]}")        
                } else {
                    answer.add("${nums[start]}->${nums[i - 1]}")
                }

                start = i
            }
        }

        if(nums[start] == nums.last()) {
            answer.add("${nums[start]}")
        } else {
            answer.add("${nums[start]}->${nums.last()}")
        }

        return answer        
    }
}
