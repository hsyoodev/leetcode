class Solution {
    fun getRow(rowIndex: Int): List<Int> {
        val pascalsTriangle = mutableListOf<MutableList<Int>>()

        for(i in 0 until (rowIndex + 1)) {
            val currentRow = mutableListOf<Int>()

            for(j in 0 until (i + 1)) {
                if(j == 0 || j == i) {
                    currentRow.add(1)
                } else {
                    val prevRow = pascalsTriangle.get(i - 1)

                    currentRow.add(prevRow.get(j - 1) + prevRow.get(j))
                }
            }

            pascalsTriangle.add(currentRow)
        }

        return pascalsTriangle.get(rowIndex)
    }
}
