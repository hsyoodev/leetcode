class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        val set: MutableSet<String> = mutableSetOf()
        var length = 1
        var answer = ""

        while (true) {
            set.clear()

            for (str in strs) {
                if (length > str.length) {
                    return answer
                }

                set.add(str.substring(0, length))
            }

            length++

            if (set.count() == 1) {
                answer = set.joinToString("")
            }
        }
    }
}