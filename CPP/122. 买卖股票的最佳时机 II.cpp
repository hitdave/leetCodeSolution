class Solution {
public:
    //想要获取最大profits，就要最高频的交易，不错过每一个赚钱的机会
    int maxProfit(vector<int>& prices) {
        if(prices.size() <2 || prices.empty()) return 0;
        int res = 0;
        for(int i = 0; i < prices.size() - 1; i++){
            if(prices[i+1] - prices[i] > 0){
                res = res + prices[i+1] - prices[i];
            }
        }
        return res;
    }
};