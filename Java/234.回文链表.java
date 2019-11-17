class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null) return true;
        if(head.next==null) return true;
        ListNode left = head;
        ListNode mid = getHalf(head);
        ListNode right = reverse(mid);
        while((right!=null) && (left!=null)){
            System.out.println("cur " +left.val);
            System.out.println("cur right"+right.val);
            if(left.val != right.val){
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
        
    }
    
    public static ListNode getHalf(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null &&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    public static ListNode reverse(ListNode head){
        if(head==null) return null;
        if(head.next==null) return head;
        ListNode newHead = new ListNode(-1);
        while(head!=null){
            ListNode temp = head.next;
            head.next = newHead.next;
            newHead.next = head;
            head = temp;
        }
        return newHead.next;
    }
}