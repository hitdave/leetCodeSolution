class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int cur = nums[0];
        int p = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > cur){
                nums[p] = nums[i];
                cur = nums[p];
                p++;
            }
        }
        return p;
    }
}