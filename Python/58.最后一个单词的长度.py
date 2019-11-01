class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        n = len(s)
        i = n-1
        cnt = 0
        while i >= 0 and s[i]==' ':
            i = i-1
        if i < 0:
            return 0
        while i >= 0 and s[i]!=' ':
            cnt = cnt + 1
            i = i - 1
        return cnt