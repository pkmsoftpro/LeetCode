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
    String ret = "";
    ListNode temp = this;
    if(temp==null) return ret;
    while(temp!=null){
      ret += " " + temp.val;
      temp = temp.next;
    }
    return ret;
  }

  public static ListNode createListNode(List<Integer> l1){
    ListNode node = new ListNode();
    ListNode temp = node;
    for(int t : l1){
      temp.val = t;
      temp.next = new ListNode();
      temp = temp.next;
    }
    return node;
  }
}
