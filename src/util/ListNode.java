package util;

public class ListNode {
  public int val;
  public ListNode next;

  public ListNode(int x) {
    val = x;
    next = null;
  }

  public String toString() {
    
    StringBuilder result = new StringBuilder();
    ListNode dummy = this;
    
    while(dummy!=null) {
      result = result.append(dummy.val).append(":");
      dummy = dummy.next;
      if(result.length()>50) break;
    }
    
    String val = result.toString();
    return val.substring(0, val.length() - 1);
  }
}
