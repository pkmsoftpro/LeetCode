package LeetcodePatterns.fspointer.ReorderList_143;

import util.ListNode;

public class Solution {

  public static void main(String[] args) {
    ListNode node = new ListNode(1);
    node.next = new ListNode(2);
    node.next.next = new ListNode(3);
    node.next.next.next = new ListNode(4);
    node.next.next.next.next = new ListNode(5);
    

    System.out.println(new Solution().reorderList(node));
  }

  public ListNode reorderList(ListNode head) {
    ListNode node = reorder(head);
    return node;
  }

  public ListNode reorder(ListNode head) {
    
    if(head==null || head.next==null) return head;
    ListNode slow = head;
    ListNode fast = head;
    ListNode prev = head;
    
    while(fast!=null && fast.next!=null) {
      prev = slow;
      slow = slow.next;
      fast = fast.next.next;
    }
    prev.next = null;
    
    ListNode head2 = reverseList(slow);
    
    ListNode thread = head, curr = new ListNode(0);
    
    while(head!=null || head2!=null) {
      
      if(head!=null){
        curr.next = head;
        head = head.next;
        curr = curr.next;
      }
      if(head2!=null) {
        curr.next = head2;
        head2 = head2.next;
        curr = curr.next;
      }
    }
    
    return thread;
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
}
