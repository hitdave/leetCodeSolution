/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;
        ListNode slow = head, fast = head.next;
        while(fast != null){
            if(fast.val == slow.val) return true;
            slow = slow.next;
            if(fast.next != null){
                fast = fast.next.next;
            }else{
                return false;
            }
        }
        return false;
    }
}