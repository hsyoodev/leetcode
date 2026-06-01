class Solution {
    fun isValid(s: String): Boolean {
        val arrayDeque = ArrayDeque<Char>()
        val map = mapOf<Char, Char>(')' to '(', ']' to '[', '}' to '{')

        for(c in s) {
            if(c in map.keys) {
                if(!arrayDeque.isEmpty()) {
                    if(map.getValue(c) == arrayDeque.last()) {
                        arrayDeque.removeLast()
                    } else {
                        return false
                    }
                } else {
                    return false
                }
            } else {
                arrayDeque.add(c)
            }
        }
        
        return arrayDeque.isEmpty()
    }
}
