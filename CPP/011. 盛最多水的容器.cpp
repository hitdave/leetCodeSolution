class Solution {
public:
    //这道题的解法是一个缩减的过程
    //如题中给的样例，设s为左右两端最短的，s为height[0]
    //那么s与各个位置的容量最大值必为 height[0] 至 height[8]
    //记录该value，问题转换为height[1] 至height[8]的最大值
    int maxArea(vector<int>& height) {
        int n = height.size();
        if(n <= 1) return -1;
        int res = 0,left = 0, right = n - 1;
        while(left < right){
            int curMax = min(height[left],height[right]) * (right - left);
            res = max(res, curMax);
            height[left] > height[right]? right--: left++;
        }
        return res;
    }
};