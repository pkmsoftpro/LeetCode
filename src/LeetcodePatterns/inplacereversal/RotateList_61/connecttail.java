package LeetcodePatterns.inplacereversal.RotateList_61;

import util.ListNode;

public class connecttail {

  public static void main(String[] args) {
    ListNode node = new ListNode(1);
    node.next = new ListNode(2);
    node.next.next = new ListNode(3);
    node.next.next.next = new ListNode(4);
    node.next.next.next.next = new ListNode(5);
    node.next.next.next.next.next = new ListNode(6);
    node.next.next.next.next.next.next = new ListNode(7);
    node.next.next.next.next.next.next.next = new ListNode(8);
    node.next.next.next.next.next.next.next.next = new ListNode(9);
    node.next.next.next.next.next.next.next.next.next = new ListNode(10);
    node.next.next.next.next.next.next.next.next.next.next = new ListNode(11);
    
    int k = 0;
    
    node = new connecttail().rotateRight(node, k);
    System.out.println(node);
  }
  
  public ListNode rotateRight(ListNode head, int k) {
    
    if(head==null) return null;
    ListNode node = head;
    int count = 1;
    
    while(head.next!=null) {
      count++;
      head = head.next;
    }
    
    head.next = node;
    
    k %= count;
    int rotation = count-k;
    
    while(rotation>0) {
      head = head.next;
      rotation--;
    }
    
    node = head.next;
    head.next = null;
    return node;
  }
}