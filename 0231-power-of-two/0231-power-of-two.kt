class Solution {
    fun isPowerOfTwo(n: Int): Boolean {
        var powerOfTwo = n
        var countLastOneBits = 0

        while(powerOfTwo > 0) {
            if((powerOfTwo and 1) == 1) {
                countLastOneBits++
            }

            powerOfTwo = powerOfTwo shr 1
        }

        return (countLastOneBits == 1) 
    }
}
