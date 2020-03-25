class Solution {
public:
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