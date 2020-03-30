class Solution {
public:
    //与33.搜索旋转数组思路相似
    int findMin(vector<int>& nums) {
        int n = nums.size();
        if(n == 0) return -1;
        if(n == 1) return nums[0];
        int left = 0, right = n - 1;
        if(nums[left] < nums[right]) return nums[left];
        while(left + 1 < right){
            int mid = left + (right - left)/2;
            if(nums[mid] > nums[left]){
                //if left = mid + 1 在边界时会导致left指针进入“旋转段”
                left = mid;
            }else{
                right = mid;
            }
        }
        if(nums[left] > nums[right]){
            return nums[right];
        }else{
            return nums[left];
        }
        
    }
};