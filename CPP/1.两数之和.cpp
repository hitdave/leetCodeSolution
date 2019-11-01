class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> res;
        unordered_map<int,int> mp;
        if(nums.size() <2) return res;
        for(int i = 0; i < nums.size(); i++){
            if(mp.count(nums[i])){
                return {i,mp[nums[i]]};
            }
            mp[target - nums[i]] = i;
        }
        return {};
    }
};