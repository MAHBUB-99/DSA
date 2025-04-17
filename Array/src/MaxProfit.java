class MaxProfit {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price : prices) {
            if(price < minPrice)
            {
                minPrice = price;
            }
            else
            {
                maxProfit = Math.max(maxProfit,price-minPrice);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        MaxProfit sol = new MaxProfit();

        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println(sol.maxProfit(prices1)); // Expected Output: 5

        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println(sol.maxProfit(prices2)); // Expected Output: 0
    }
}
