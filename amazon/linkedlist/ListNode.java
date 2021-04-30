package linkedlist;

import java.util.List;

public class ListNode {
  public int val;
  public ListNode next;


  public ListNode() {}

  public ListNode(int val) {
    this.val = val;
  }

  public ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  @Override
  public String toString() {
    int maxCount = 10;
    String ret = "";
    ListNode temp = this;
    if(temp==null) return ret;
    while(temp!=null && maxCount>0){
      ret += temp.val + " ";
      temp = temp.next;
      maxCount--;
    }
    return ret;
  }

  public static ListNode createListNode(List<Integer> l1){
    if(l1.isEmpty()) return null;
    ListNode node = new ListNode(l1.get(0));
    ListNode temp = node;
    int len = l1.size();
    for(int i=1; i<len; i++){
      node.next = new ListNode(l1.get(i));
      node = node.next;
    }
    return temp;
  }
}
