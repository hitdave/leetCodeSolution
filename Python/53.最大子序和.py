class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n = len(nums)
        if n == 0:
            return 0
        #初始化n维dp数组
        dp = [0]*n
        dp[0] = nums[0]
        res = nums[0]
        i = 1
        while i < n:
            dp[i] = max(dp[i-1] + nums[i],nums[i])
            res = max(res,dp[i])
            i = i + 1
        return res