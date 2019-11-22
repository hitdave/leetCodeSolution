class Solution {
    public int search(int[] nums, int target) {
        //空判断
        if(nums.length == 0 || nums == null) return -1;
        int n = nums.length;
        int left = 0, right = n - 1;
        while(left + 1 < right){
            //避免溢出
            int mid = left + (right - left)/2;
            if(nums[mid] == target) return mid;
            //判断mid落于左区间或右区间
            if(nums[left] < nums[mid]){
                if(nums[left] <= target && nums[mid] >= target) right = mid;
                else left = mid;
            }else if(nums[right] > nums[mid]){
                if(nums[mid] <= target && target <= nums[right]) left = mid;
                else right = mid;
            }
        }
        if(nums[left] == target) return left;
        if(nums[right] == target) return right;
        return -1;
        
    }
}