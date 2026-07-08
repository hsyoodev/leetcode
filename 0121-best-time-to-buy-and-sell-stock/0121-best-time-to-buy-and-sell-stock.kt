class Solution {
    fun maxProfit(prices: IntArray): Int {
        var buy = prices[0]
        var profit = 0

        for(i in 1 until prices.size) {
            val sell = prices[i]
            profit = maxOf(profit, sell - buy)

            if(sell < buy) {
                buy = sell
            }
        }

        return profit
    }
}
