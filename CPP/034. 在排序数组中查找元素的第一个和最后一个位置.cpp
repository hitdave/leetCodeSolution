class Solution {
public:
    //问题本质是求左右边界，使用2个二分查找分别查找左、右边界
    vector<int> searchRange(vector<int>& nums, int target) {
        int n = nums.size();
        if(n == 0) return {-1,-1};
        int left = 0, right = n - 1, leftRes = -1,rightRes = -1;
        //处理左边界
        while(left + 1 < right){
            int mid = left + (right - left)/2;
            if(nums[mid] >= target){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        if(nums[left] == target){
            leftRes = left;
        }else if(nums[right] == target){
            leftRes = right;
        }else{
            return {-1, -1};
        }
        //处理右边界
        left = 0;
        right = n - 1;
        while(left + 1 < right){
            int mid = left + (right - left)/2;
            if(nums[mid] <= target){
                left = mid;
            }else{
                right = mid - 1;
            }
        }
        if(nums[right] == target){
            rightRes = right;
        }else if(nums[left] == target){
            rightRes = left;
        }else{
            return {-1, -1};
        }
        return {leftRes,rightRes};

    }
};