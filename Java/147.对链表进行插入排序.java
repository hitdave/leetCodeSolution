/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1);
        //pre记录插入位置的前指针，cur为当前指针，next为插入位置后续指针
        ListNode pre = dummy, cur = head, next = null;
        while(cur!=null){
            next = cur.next;
            //寻找pre
            while(pre.next !=null && pre.next.val < cur.val){
                pre = pre.next;
            }
            //插入
            cur.next = pre.next;
            pre.next = cur;
            cur = next;
            pre = dummy;
        }
        return dummy.next;
    }
}