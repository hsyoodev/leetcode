class Solution {
    fun countBits(n: Int): IntArray {
        val answer = IntArray(n + 1)

        for(i in 0..n) {
            var countOneBits = 0
            var num = i
            while(num >= 2) {
                if(num % 2 == 1) {
                    countOneBits++
                }

                num /= 2
            }

            if(num == 1) {
                countOneBits++
            }

            answer[i] = countOneBits
        }

        return answer
    }
}