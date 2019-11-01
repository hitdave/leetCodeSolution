class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 0) return -1;
        int res = 0;
        for(int num : nums){
            res^=num;
        }
        return res;
    }
}