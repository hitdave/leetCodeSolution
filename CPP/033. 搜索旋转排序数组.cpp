class Solution {
public:
    //把数组画成二维x-y，找寻mid规律
    //分情况讨论mid所在的位置
    int search(vector<int>& nums, int target) {
        int n = nums.size();
        if(n == 0) return -1;
        int left = 0, right = n - 1;
        //二分法，最后left right 指向最后两个"可能"元素
        //本二分法在更新时，无论+1 与否 都可
        while(left + 1 < right){
            int mid = left + (right - left)/2;
            if(target == nums[mid]) return mid;
            if(nums[mid] > nums[left]){
                if(nums[mid] > target && target >= nums[left]){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }else {//nums[mid] < nums[right]
                if(nums[mid] < target && target <= nums[right]){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
        }
        if(target == nums[left]) return left;
        if(target == nums[right]) return right;
        return -1;
    }
};