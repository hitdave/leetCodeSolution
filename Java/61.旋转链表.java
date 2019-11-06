/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null || head.next == null) return head;
        ListNode rear = head;
        int n = 1;
        while(rear.next != null){
            rear = rear.next;
            n++;
        }
        rear.next = head;
        k = k % n;
        for(int i = 0; i < n - k; i++){
            head = head.next;
            rear = rear.next;
        }
        rear.next = null;
        return head;

    }
}