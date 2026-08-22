class Solution {
    fun addDigits(num: Int): Int {
        var n = num

        while(n >= 10) {
            n = n.toString()
                 .sumOf({it - '0'})
        }

        return n
    }
}
