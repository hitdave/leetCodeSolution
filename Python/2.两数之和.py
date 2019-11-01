# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        if l1 is None:
            return l2
        if l2 is None:
            return l1
        res = ListNode((l1.val + l2.val)%10)
        res.next = self.addTwoNumbers(l1.next,l2.next)
        if (l1.val + l2.val)/10 == 1:
            res.next = self.addTwoNumbers(res.next,ListNode(1))
        return res