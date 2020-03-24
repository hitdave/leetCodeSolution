class Solution {
public:
    //在while中判断end - start > 1 最后指向两个不同元素
    int search1(vector<int>& nums, int target) {
        int n = nums.size();
        if(n == 0) return -1;
        int start = 0, end = n - 1;
        while(end - start > 1){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        if(nums[start] == target){
            return start;
        }else if(nums[end] == target){
            return end;
        }else{
            return -1;
        }
    }

    //最标准的二分查找
    //最后left right 指针指向 最后一轮mid 和 mid左/右
    int search(vector<int>& nums, int target) {
        int n = nums.size();
        if(n == 0) return -1;
        int left = 0, right = n - 1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }
};