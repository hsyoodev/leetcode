class Solution {
    fun isPalindrome(s: String): Boolean {
        var left = 0
        var right = s.length - 1

        while(left <= right) {
            if(!s[left].isLetterOrDigit()) {
                left++

                continue
            } else if(!s[right].isLetterOrDigit()) {
                right--

                continue
            } else if(!s[left].equals(s[right], true)) {
                return false
            } 

            left++
            right--        
        }

        return true
    }
}
