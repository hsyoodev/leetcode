class Solution {
    fun isPalindrome(x: Int): Boolean {
        return x.toString().equals(x.toString().reversed())
    }
}