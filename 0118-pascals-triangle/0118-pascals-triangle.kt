class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        return (
            buildList {
                repeat(numRows) { index1 ->
                    val currentRow = List(index1 + 1) { index2 ->
                        if (index2 == 0 || index2 == index1) {
                            1
                        } else {
                            val prevRow = last()
                            prevRow[index2 - 1] + prevRow[index2]
                        }
                    }

                    add(currentRow)
                }
            }
        )
    }
}
