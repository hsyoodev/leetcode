class Solution {
    fun titleToNumber(columnTitle: String): Int {
        var answer = 0

        for(c in columnTitle) {
            answer = answer * 26 + (c.code % 64)
        }

        return answer
    }
}
