class Solution {
    fun romanToInt(s: String): Int {
        val map = mapOf<String, Int>(
            "I" to 1,
            "V" to 5,
            "X" to 10,
            "L" to 50,
            "C" to 100,
            "D" to 500,
            "M" to 1000,
            "IV" to -2,
            "IX" to -2,
            "XL" to -20,
            "XC" to -20,
            "CD" to -200,
            "CM" to -200
        )
        val arr = ArrayDeque<String>()
        var answer = 0;

        s.forEach { ch -> 
            answer += map.getValue(ch.toString())
            arr.add(ch.toString())
            
            if(arr.count() == 2) {
                answer += map.getOrDefault(arr.joinToString(""), 0)
                arr.removeFirst()
            }
        }    

        return answer
    }
}