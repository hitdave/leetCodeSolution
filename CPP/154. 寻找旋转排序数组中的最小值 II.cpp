class Solution {
public:
    int findMin(vector<int>& nums) {
        int n = nums.size();
        if(n == 0) return -1;
        if(n == 1) return nums[0];
        int left = 0, right = n - 1;
        if(nums[left] < nums[right]) return nums[left];
        while(left + 1 < right){
            int mid = left + (right - left)/2;
            if(nums[mid] < nums[right]){
                right = mid;
            }else if(nums[mid] > nums[right]){
                left = mid;
            }else{
                right--;
            }
        }
        if(nums[left] > nums[right]){
            return nums[right];
        }else{
            return nums[left];
        }
    }

};