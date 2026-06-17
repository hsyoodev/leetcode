class Solution {
    fun lengthOfLastWord(s: String): Int {
        var answer = 0

        for(i in s.length - 1 downTo 0) {
            if(s[i] != ' ') {
                answer++
            } else if(s[i] == ' ' && answer > 0) {
                break
            }
        }

        return answer
    }
}
