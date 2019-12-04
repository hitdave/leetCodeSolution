class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length < 2) return 0;
        int profits = 0;
        for(int i = 0; i < prices.length - 1; i++){
            int profit = prices[i+1] - prices[i];
            if(profit > 0) profits += profit;
        }
        return profits;
    }
}