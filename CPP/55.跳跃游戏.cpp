class Solution {
public:
    bool canJump(vector<int>& nums) {
        int n = nums.size();
        int reach = 0;
        for(int i = 0; i < n && i <= reach; i++){
            reach  = max(reach, i + nums[i]);
            if(reach >= n - 1) return true;
        }
        return false;
    }
};