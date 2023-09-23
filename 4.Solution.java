class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode p1 = head;
        ListNode p2 = reverse(getRight(head));
        while(p1!=null && p2!=null){
            if(p1.val != p2.val)return false;
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head){
        if(head == null || head.next == null)
        return head;
        ListNode curr  = head;
        ListNode prev = null;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public ListNode getRight(ListNode head){
        if(head == null)
        return null;
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.next;
    }
}
