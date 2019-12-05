class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null ||prices.length < 2) return 0;
        int len = prices.length;
        int[] left = new int[len];
        int[] right = new int[len];
        //从左到右求解
        int min = prices[0], curMax = 0;
        for(int i = 1; i < len; i++){
            min = Math.min(prices[i],min);
            left[i] = Math.max(left[i-1],prices[i] - min);
        }
        //从右到左求解
        int max = prices[len - 1];
        for(int i = len -2;i >=0; i--){
            max = Math.max(max,prices[i]);
            right[i] = Math.max(max - prices[i],right[i+1]);
        }
        int res = 0;
        for(int i = 0; i < len; i++){
            res = Math.max(res, left[i] + right[i]);
        }
        return res;
    }
}