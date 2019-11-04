class Solution(object):
    def canJump(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        n = len(nums)
        reach = 0
        i = 0
        while i < n and i <=reach:
            reach = max(reach, i + nums[i])
            i = i + 1
            if reach >= n-1:
                return True
        return False