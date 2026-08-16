class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val sChar = s.toCharArray()
        val tChar = t.toCharArray()

        sChar.sort()
        tChar.sort()

        return sChar.contentEquals(tChar)              
    }
}
