class Solution {
public:
    /*最直接的想法是按顺序遍历每一个组合，时间复杂度为O(n^2)
    *比如 3 2 1 4 5 的时候，3、2、1都会和4、5比较，这个过程是重复的，可以想办法避免
    *从前向后遍历，在遍历的过程中计算迭代至当前的最大利润curmax，并更新最小值min
    *更新min是为了找到最大利润，更新curMax是为了记录“波动”时，最终res在数组前半部分
    */
    int maxProfit(vector<int>& prices) {
        int n = prices.size();
        if(n < 2 || prices.empty()) return 0;
        int min = prices[0], curMax = 0;
        for(int i = 1; i < n; i++){
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