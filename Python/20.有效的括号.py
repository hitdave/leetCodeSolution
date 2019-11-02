class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        n = len(s)
        sk = []
        if n == 0:
            return True
        for i in range(n):
            if s[i] == '(' or s[i] == '[' or s[i] == '{':
                sk.append(s[i])
            elif len(sk) != 0 and self.match(sk[len(sk) - 1],s[i]):
                sk.pop()
            else:
                return False
        return len(sk) == 0

    def match(self,c1,c2):
        if c1 == '(' and c2 == ')':
            return True
        if c1 == '[' and c2 == ']':
            return True
        if c1 == '{' and c2 == '}':
            return True
        return False