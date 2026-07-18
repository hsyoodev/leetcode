class Solution {
    fun convertToTitle(columnNumber: Int): String {
        return when(columnNumber) {
            0 -> ""
            else -> convertToTitle((columnNumber - 1) / 26) + "${'A' + ((columnNumber - 1) % 26)}"
        }
    }
}
