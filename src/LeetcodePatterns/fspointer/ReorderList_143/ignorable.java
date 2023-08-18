package LeetcodePatterns.fspointer.ReorderList_143;

import util.ListNode;

public class ignorable {
  
  public static void main(String[] args) {
    ListNode node = new ListNode(1);
    node.next = new ListNode(2);
    node.next.next = new ListNode(3);
    node.next.next.next = new ListNode(4);
    node.next.next.next.next = new ListNode(5);
    
    new ignorable().reorderList(node);
    System.out.println(node);
  }

  public void reorderList(ListNode head) {
    if (head == null || head.next == null)
      return;

    // Find the middle of the list
    ListNode slow = head;
    ListNode fast = head;
    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    // Reverse the half after middle 1->2->3->4->5->6 to 1->2->3->6->5->4
    ListNode head2 = slow;
    ListNode next = slow.next;
    while (next.next != null) {
      ListNode current = next.next;
      next.next = current.next;
      current.next = head2.next;
      head2.next = current;
    }

    // Start reorder one by one 1->2->3->6->5->4 to 1->6->2->5->3->4
    slow = head;
    fast = head2.next;
    while (slow != head2) {
      head2.next = fast.next;
      fast.next = slow.next;
      slow.next = fast;
      slow = fast.next;
      fast = head2.next;
    }
  }
}
