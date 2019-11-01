class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        if len(nums) < 2:
             return [0,0]
        dict ={}
        i = 0
        while(i < len(nums)):
            if nums[i] in dict.keys():
                return [i,dict[nums[i]]]
            dict[target - nums[i]] = i
            i = i + 1
        return [0,0]