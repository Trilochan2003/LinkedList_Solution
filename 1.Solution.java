class Solution{
  public int find(Node head, int x){
    Node temp = head;
    while(temp != null){
      if(temp.data == x)
        return 1;
      temp = temp.next;
    }
    return 0;
  }
}
