class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        strs.sort()

        val str1 = strs[0]
        val str2 = strs[strs.count() - 1]
        var index = 0;

        while(index < str1.length && index < str2.length) {
            if(str1.get(index) == str2.get(index)) {
                index++
            } else {
                break
            }
        }

        return str1.substring(0, index)
    }
}
