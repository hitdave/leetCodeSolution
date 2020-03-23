class Solution {
public:
    //通过遍历数组，将非val元素移动至数组前边
    int removeElement(vector<int>& nums, int val) {
        if(nums.size() == 0) return 0;
        int index = 0;
        for(int j = 0; j < nums.size(); j++){
            if(nums[j] != val){
                nums[index++] = nums[j];
            }
        }
        return index;
    }
};