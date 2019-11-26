class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n <=2 || n == 0) return n;
        int loc = 2;
        for(int idx = 2; idx < n; idx++){
            if(!(nums[loc - 1] == nums[loc -2] && nums[loc - 1] == nums[idx])){
                nums[loc++] = nums[idx];
            }
        }
        return loc;
    }
}