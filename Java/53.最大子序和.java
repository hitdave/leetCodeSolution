class Solution {
    /**
    dp[i]记录到第i个数字的最大子序列和
    dp[i] = max(dp[i-1] + nums[i], nums[i])
    */
    public int maxSubArray(int[] nums) {
        if(nums.length == 0) return 0;
        //初始化dp和max
        int max = nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            dp[i] = Math.max(dp[i-1] + nums[i], nums[i]);
            max = Math.max(dp[i], max);
        }
        return max;
    }
}