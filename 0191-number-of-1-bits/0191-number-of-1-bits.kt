class Solution {
    fun hammingWeight(n: Int): Int {
        return n.toString(2).count({ it == '1' })
    }
}
