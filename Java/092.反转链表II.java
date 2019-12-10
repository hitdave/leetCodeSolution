/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode preHead = dummy,stNode = head,edNode = head;
        for(int i = 1; i < m; i++){
            preHead = stNode;
            stNode = stNode.next;
        }
        for(int i = 1; i < n; i++){
            edNode = edNode.next;
        }

        while(edNode != stNode){
            preHead.next = stNode.next;
            stNode.next = edNode.next;
            edNode.next = stNode;
            stNode = preHead.next;
        }
        return dummy.next;
    }
}