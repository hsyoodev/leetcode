class Solution {
    val numbers = mutableSetOf<Int>()

    fun isHappy(n: Int): Boolean {
        if(n == 1) {
            return true
        }

        var number = n.toString().sumOf { it.digitToInt() * it.digitToInt() }
        
        if(!numbers.add(number)) {
            return false
        }

        return true && isHappy(number)
    }
}
