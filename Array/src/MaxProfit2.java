class MaxProfit2 {
    /**
     * Problem Summary:
     * - Given an array `prices` where `prices[i]` represents the stock price on day `i`.
     * - You can buy and sell the stock multiple times, but you can only hold at most one share at a time.
     * - You can buy and sell on the same day.
     * - The goal is to maximize profit by choosing the best days to buy and sell.
     *
     * Example:
     * Input:  prices = [7,1,5,3,6,4]
     * Output: 7
     * Explanation:
     *   - Buy on day 2 (price = 1), sell on day 3 (price = 5) → profit = 5 - 1 = 4
     *   - Buy on day 4 (price = 3), sell on day 5 (price = 6) → profit = 6 - 3 = 3
     *   - Total profit = 4 + 3 = 7
     *
     * Constraints:
     * - 1 <= prices.length <= 3 * 10^4
     * - 0 <= prices[i] <= 10^4
     */
    public int maxProfit(int[] prices) {
        int profit =0 ;
        for(int i=0;i<prices.length-1;i++)
        {
            if(prices[i+1]>prices[i])
            {
                profit+=Math.max(0,prices[i+1]-prices[i]);
            }
        }
        return profit;

    }

    public static void main(String[] args) {
        MaxProfit2 sol = new MaxProfit2();

        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println(sol.maxProfit(prices1)); // Expected Output: 7

        int[] prices2 = {1, 2, 3, 4, 5};
        System.out.println(sol.maxProfit(prices2)); // Expected Output: 4

        int[] prices3 = {7, 6, 4, 3, 1};
        System.out.println(sol.maxProfit(prices3)); // Expected Output: 0
    }
}
