class Solution {
    fun romanToInt(s: String): Int {
        val map = mapOf<Char, Int>(
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000
        )
        var answer = 0;

        for(index in s.indices) {
            val currentKey = s[index]
            val currentValue = map.getValue(currentKey)
            
            if(index + 1 < s.length) {
                val nextKey = s[index + 1]
                val nextValue = map.getValue(nextKey)

                if(currentValue >= nextValue) {
                    answer += currentValue
                } else {
                    answer -= currentValue
                } 
            } else {
                answer += currentValue
            }
        }    

        return answer
    }
}