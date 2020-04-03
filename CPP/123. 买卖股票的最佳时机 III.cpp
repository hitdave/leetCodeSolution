class Solution {
public:
    //该方法延续了maxProfit1解法的思想，减少重复计算
    //时间复杂度维持在O(n)
    int maxProfit(vector<int>& prices) {
        int n = prices.size();
        if(n < 2 || prices.empty()) return 0;
        //维护两个数组分别记录前向、后向的最大利润
        int forword[n];
        forword[0] = 0;
        int backword[n];
        backword[n - 1] = 0;
        int res = 0;
        //从左向右求解
        int minPrice = prices[0];
        for(int i = 1; i < n; i++){
            minPrice = min(prices[i],minPrice);
            forword[i] = max(forword[i-1],prices[i] - minPrice);
        }
        //从右向左求解
        int maxPrice = prices[n - 1];
        for(int i = n - 2; i >= 0; i--){
            maxPrice = max(maxPrice, prices[i]);
            backword[i] = max(backword[i+1], maxPrice - prices[i]);
        }

        //合并两个数组的结果
        for(int i = 0; i < n; i++){
            res = max(res, backword[i] + forword[i]);
        }
        return res;

    }
    //该方法配合getCurMaxProfit函数，机遇股票问题I的解法，将数组切分，进而求解
    //该方法会调用n次，这其中有较多的重复计算(比如计算arr0-arr5数组时，将重复计算0-4最大值计算)
    int maxProfit1(vector<int>& prices) {
        int n = prices.size();
        int res = 0;
        for(int i = 0; i < n; i++){
            int curMax = getCurMaxProfit(prices, 0, i) + getCurMaxProfit(prices, i + 1, n-1);
            res = max(res, curMax);
        }
        return res;
    }

    int getCurMaxProfit(vector<int>& prices, int start, int end) {
    int n = end - start + 1;
    if(n < 2 || prices.empty()) return 0;
    int min = prices[start], curMax = 0;
    for(int i = start + 1; i <= end; i++){
        int diff = prices[i] - min;
        if(diff <= 0){
            min = prices[i];
        }else{
            curMax = max(curMax, prices[i] - min);
        }

    }
    return curMax;
}
};