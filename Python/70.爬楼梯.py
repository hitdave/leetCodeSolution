class Solution(object):
    def climbStairs(self, n):
        """
        :type n: int
        :rtype: int
        """
        f1 = 1
        f2 = 2
        res = 0
        if n == 0:
            return 0
        if n == 1:
            return f1
        if n == 2:
            return f2
        while n - 3 >= 0:
            res = f1 + f2
            f1 = f2
            f2 = res
            n = n - 1
        return res
