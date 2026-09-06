class NumArray(nums: IntArray) {
    val prefix = IntArray(nums.size)
    var sum = 0

    init {
        for(i in nums.indices) {
            sum += nums[i]
            prefix[i] = sum
        }
    }

    fun sumRange(left: Int, right: Int): Int {
        return if(left == 0) {
            prefix[right]
        } else {
            prefix[right] - prefix[left - 1]
        }
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * var obj = NumArray(nums)
 * var param_1 = obj.sumRange(left,right)
 */
