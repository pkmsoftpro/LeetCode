package list.ReverseLinkedList_206;

import util.ListNode;

public class iterative {

  static ListNode newnode = null;
  public static void main(String[] args) {
    ListNode node = new ListNode(1);
    node.next = new ListNode(2);
    node.next.next = new ListNode(3);
    node.next.next.next = new ListNode(4);
    node.next.next.next.next = new ListNode(5);
    

    new iterative().recursive(node);
    System.out.println(newnode);
  }
  
  public ListNode reverseList(ListNode head) {
    ListNode newnode = null;
    while(head!=null) {
      ListNode next = head.next;
      head.next = newnode;
      newnode = head;
      head = next;
    }
    return newnode;
  }
  
  public ListNode recursive(ListNode head) {
    if(head==null) return null;
    ListNode next = head.next;
    head.next = newnode;
    newnode = head;
    return recursive(next);
  }
}
