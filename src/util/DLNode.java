package util;

public class DLNode {   //Doubly Linked ListNode
  public int val;
  public DLNode next;
  public DLNode random;

  public DLNode(int val) {
      this.val = val;
      this.next = null;
      this.random = null;
  }
  
  public String toString() {
    
    StringBuilder result = new StringBuilder();
    DLNode dummy = this;
    
    while(dummy!=null) {
      result = result.append(dummy.val).append(":");
      dummy = dummy.next;
      if(result.length()>50) break;
    }
    
    String name = result.toString();
    return name.substring(0, name.length() - 1);
  }
}
