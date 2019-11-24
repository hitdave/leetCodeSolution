class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        if(nums == null || nums.length == 0) return res;
        int n = nums.length;
        //find the start
        int start = 0, end = n - 1;
        int st_pos = -1, ed_pos = -1;
        while(start + 1 < end){
            int mid = start + (end - start)/2;
            if(nums[mid] >= target) end = mid;
            else start = mid;
        }
        if(nums[start] == target) st_pos = start;
        else if(nums[end] == target) st_pos = end;
        if(st_pos == -1) return res;
        //find the end
        start = st_pos;
        end = n -1;
        while(start + 1 < end){
            int mid = start + (end - start)/2;
            if(nums[mid] <= target) start = mid;
            else end = mid;
        }
        if(nums[end] == target) ed_pos = end;
        else if(nums[start] == target) ed_pos = start;
        res[0] = st_pos;
        res[1] = ed_pos;
        return res;
    }
}