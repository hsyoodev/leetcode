class Solution {
    val map = mutableMapOf<Char, Char>()

    fun isIsomorphic(s: String, t: String): Boolean {
        for(i in 0 until s.length) {
            val c1 = s.get(i)
            val c2 = t.get(i)

            if(map.containsKey(c1)) {
                if(map.getValue(c1) != c2) {
                    return false
                }
            } else {
                if(map.containsValue(c2)) {
                    return false
                }
                
                map.put(c1, c2)
            }
        }  

        return true
    }
}
