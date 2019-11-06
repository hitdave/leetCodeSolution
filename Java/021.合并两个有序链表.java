/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //空判断
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode res;
        //递归求解
        if(l1.val < l2.val){
            res = l1;
            res.next = mergeTwoLists(l1.next, l2);
        }else{
            res = l2;
            res.next = mergeTwoLists(l1, l2.next);
        }
        return res;
    }
}