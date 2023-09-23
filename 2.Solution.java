public  void insertSpecific(int newElement, int position) {     
    Node newNode = new Node(); 
    newNode.data = newElement;
    newNode.next = null;

    if(position < 1) {
      System.out.print("\nposition should be >= 1.");
    } else if (position == 1) {
      newNode.next = head;
      head = newNode;
    } else {
      
      Node temp = new Node();
      temp = head;
      for(int i = 1; i < position-1; i++) {
        if(temp != null) {
          temp = temp.next;
        }
      }
   
      if(temp != null) {
        newNode.next = temp.next;
        temp.next = newNode;  
      } else {
        System.out.print("\nThe previous node is null.");
      }       
    }
  }
