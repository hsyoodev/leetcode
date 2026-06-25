class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var idx = 0

        for(i in 0 until nums1.size) {
            if(nums1[i] == 0) {
                if(idx < n) {
                    nums1[i] = nums2[idx++]
                }
            }
        }

        nums1.sort()
    }
}
