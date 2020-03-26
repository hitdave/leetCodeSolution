class Solution {
public:
    int jump(vector<int>& nums) {
        int n = nums.size();
        int maxReach = 0, jump = 0, curReach = 0;
        for(int i =0; i < n; i++){
            if(maxReach >= n - 1) return jump;
            if(maxReach < i){
                jump++;
                maxReach = curReach;
            }
            curReach = max(curReach, nums[i] + i);
        }
        return jump;
    }
};