class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        min_val = -(2**31);
        max_val = 2**31 - 1;
        sign = -1 if x < 0 else 1
        x = abs(x)
        ans = 0
        while x != 0:            
            ans = ans * 10 + (x % 10)
            x //= 10
        ans *= sign
        if ans > max_val or ans < min_val: return 0
        return ans 