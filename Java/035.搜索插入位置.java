class Solution {
    public int searchInsert(int[] nums, int target) {
        //二分查找位置
        if(nums.length == 0) return 0;
        int left = 0;
        int right = nums.length - 1;
        while(left + 1 < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] > target){
                right = mid;
            }else if(nums[mid] < target){
                left = mid;
            }else{
                return mid;
            }
        }
        if(target > nums[right]){
            return right + 1;
        }else if(target <= nums[left]){
            return left;
        }else{
            return right;
        }
    }
}