class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int reach = 0;
        for(int i = 0; i < n && i <= reach; i++){
            reach = Math.max(reach, i + nums[i]);
            if(reach >= n - 1) return true;
        }
        return false;
    }
}