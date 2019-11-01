class Solution {
public:
//通过异或运算，得出唯一出现一次的结果
    int singleNumber(vector<int>& nums) {
        if(nums.size() == 0) return -1;
        int res = 0;
        for(auto num :nums){
            res^=num;
        }
        return res;
    }
};