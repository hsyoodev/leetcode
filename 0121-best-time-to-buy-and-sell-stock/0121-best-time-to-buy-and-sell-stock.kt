class Solution {
    fun maxProfit(prices: IntArray): Int {
        var buy = Int.MAX_VALUE
        var profit = 0

        for(sell in prices) {
            if(buy >= sell) {
                buy = sell
            } else if((sell - buy) > profit) {
                profit = (sell - buy)
            }
        }

        return profit
    }
}
