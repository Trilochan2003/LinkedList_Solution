class Solution{
    static Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
        first = reverse(first);
        second = reverse(second);
        int sum =0;
        int carry = 0;
        Node temp = null;
        Node head = null;
        Node tail = null;
        
        while(first!=null || second != null){
           
            sum = carry+(first!=null?first.data:0)+(second!=null?second.data:0);
            carry = (sum>=10)?1:0;
            sum = sum%10;
            temp = new Node(sum);
            
            if(head == null)
            head = temp;
            else
            tail.next = temp;
            
            tail = temp;
            if(first != null) first = first.next;
            if(second != null) second = second.next;
        }
        if(carry > 0)
        tail.next = new Node(carry);
        
        head = reverse(head);
        return head;
    }
}
