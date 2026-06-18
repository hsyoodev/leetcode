class Solution {
    fun plusOne(digits: IntArray): IntArray {
        for(i in digits.size - 1 downTo 0) {
            if(digits[i] < 9) {
                digits[i]++

                return digits    
            }

            digits[i] = 0
        }

        val newDigits = IntArray(digits.size + 1)
        newDigits[0] = 1

        return newDigits
    }
}
