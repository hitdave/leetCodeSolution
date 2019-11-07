class Solution {
    public int removeDuplicates(int[] nums) {
        //空判断
        if(nums.length == 0) return 0;
        //记录目前已知不重复最大值
        int cur = nums[0];
        //记录第一个要更新的元素
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