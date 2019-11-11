class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if(n <= 1) return 0;
        int index = 0, curMax = 0, step = 0, nextMax = 0;
        while(index <= curMax){
            while(index <= curMax){
                nextMax = Math.max(nextMax, index + nums[index]);
                index++;
            }
            curMax = nextMax;
            step++;
            if(curMax >= nums.length - 1) return step;
        }
        return 0;
    }
}