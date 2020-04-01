class Solution {
public:
    //与之前题目相似，注意处理相同的问题
    bool search(vector<int>& nums, int target) {
        int n = nums.size();
        if(n == 0) return false;
        int left = 0, right = n - 1;
        while(left + 1 < right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target) return true;
            if(nums[left] < nums[mid]){
                if(target >= nums[left] && target < nums[mid]){
                    right = mid;
                }else{
                    left = mid;
                }
            }else if(nums[left] > nums[mid]){
                if(target > nums[mid] && target <= nums[right]){
                    left = mid;
                }else{
                    right = mid;
                }
            }else{
                left++;
            }
        }
        if(nums[left] == target || nums[right] == target) return true;
        return false;
    }
};