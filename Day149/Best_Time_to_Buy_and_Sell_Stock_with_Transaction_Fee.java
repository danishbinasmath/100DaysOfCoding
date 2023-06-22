package Day149;

public class Best_Time_to_Buy_and_Sell_Stock_with_Transaction_Fee {
    class Solution {
        public int maxProfit(int[] prices, int fee) {
            int n = prices.length;
            int free = 0, hold = -prices[0];

            for (int i = 1; i < n; i++) {
                int tmp = hold;
                hold = Math.max(hold, free - prices[i]);
                free = Math.max(free, tmp + prices[i] - fee);
            }

            return free;
        }
    }
}
