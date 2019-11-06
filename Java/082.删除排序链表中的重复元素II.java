/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode newHead = new ListNode(-1);
        newHead.next = head;
        ListNode pre = newHead, cur = head;
        while(pre.next!=null && pre.next.next != null){
            if(pre.next.val == pre.next.next.val){
                cur = cur.next;
                while(cur.val == cur.next.val){
                cur = cur.next;
                }
                pre.next = cur.next;
            }else{
                pre = pre.next;
                cur = cur.next;
            }
        }
        return newHead.next;
    }
}