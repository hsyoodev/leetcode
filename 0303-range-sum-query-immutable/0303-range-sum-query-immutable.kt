class NumArray(nums: IntArray) {
    val nums = nums
    var sum = 0

    fun sumRange(left: Int, right: Int): Int {
        sum = 0

        for(i in left until (right + 1)) {
            sum += nums[i]
        }

        return sum
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * var obj = NumArray(nums)
 * var param_1 = obj.sumRange(left,right)
 */
