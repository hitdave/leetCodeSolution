class Solution(object):
	#滑动窗口
	#字典记录上次出现位置
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        dict = {}
        left = -1
        j = 0
        res = 0
        for j in range(len(s)):
            if s[j] in dict.keys() and dict[s[j]] > left:
                left = dict[s[j]]
            res = max([res, j-left])
            dict[s[j]] = j
        return res