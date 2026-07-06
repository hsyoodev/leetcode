class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        val pascalTriangle: MutableList<MutableList<Int>> = mutableListOf()

        for(i in 0 until numRows) {
            val currentRow: MutableList<Int> = mutableListOf()

            for(j in 0 until (i + 1)) {
                if(j == 0 || j == i) {
                    currentRow.add(1)
                } else {
                    val prevRow = pascalTriangle.get(i - 1)

                    currentRow.add(prevRow.get(j - 1) + prevRow.get(j))
                }
            }

            pascalTriangle.add(currentRow)
        }

        return pascalTriangle
    }
}
