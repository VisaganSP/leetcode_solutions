public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (buyPrice > prices[i])
                buyPrice = prices[i];

            profit = Math.max(profit, prices[i] - buyPrice);
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices1 = { 7, 1, 5, 3, 6, 4 };
        int[] prices2 = { 7, 6, 4, 3, 1 };

        System.out.println(maxProfit(prices1));
        System.out.println(maxProfit(prices2));
    }
}
