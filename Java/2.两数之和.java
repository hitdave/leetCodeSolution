/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode res = new ListNode((l1.val + l2.val)%10);
        res.next = addTwoNumbers(l1.next,l2.next);
        if((l1.val + l2.val)/10 == 1){
            res.next = addTwoNumbers(res.next,new ListNode(1));
        }
        return res;
    }
}