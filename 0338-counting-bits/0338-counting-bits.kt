class Solution {
    fun countBits(n: Int): IntArray {
        val answer = IntArray(n + 1)

        for(i in 0..n) {
            answer[i] = answer[i shr 1] + (i and 1)
        }

        return answer
    }
}