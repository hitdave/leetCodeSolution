class Solution {
    public int majorityElement(int[] nums) {
        //摩尔投票法
        if(nums.length == 0) return -1;
        int res = nums[0],count = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == res) count++;
            else count--;
            if(count == 0){
                res = nums[i];
                count = 1;
            }
        }
        return res;
    }
}