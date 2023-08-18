package list.ReverseLinkedList_206;

import util.ListNode;

public class recursive {

  public static void main(String[] args) {
    ListNode node = new ListNode(1);
    node.next = new ListNode(2);
    node.next.next = new ListNode(3);
    node.next.next.next = new ListNode(4);
    node.next.next.next.next = new ListNode(5);
    

    ListNode newnode = new recursive().recursive(node, null);
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
  
  public ListNode recursive(ListNode head, ListNode newnode) {
    if(head==null) return newnode;
    ListNode next = head.next;
    head.next = newnode;
    return recursive(next, head);
  }
}
