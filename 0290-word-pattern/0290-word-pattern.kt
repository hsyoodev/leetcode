class Solution {
    fun wordPattern(pattern: String, s: String): Boolean {
        val map1 = mutableMapOf<Char, String>()
        val map2 = mutableMapOf<String, Char>()
        val words = s.split(" ")

        if(pattern.length != words.size) {
            return false
        }
        
        for(i in 0 until pattern.length) {
            val c = pattern[i]
            val w = words[i]

            if(map1.containsKey(c) && !map1[c].equals(w)) {
                return false
            }

            if(map2.containsKey(w) && (map2[w] != c)) {
                return false
            }

            map1.put(c, w)
            map2.put(w, c)
        }

        return true
    }
}
