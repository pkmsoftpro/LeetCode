package LeetcodePatterns.fspointer.SortList_148;

import util.ListNode;

public class Solution {
  
  public static void main(String[] args) {
    ListNode node = new ListNode(4);
    node.next = new ListNode(2);
    node.next.next = new ListNode(1);
    node.next.next.next = new ListNode(3);
    

    System.out.println(new Solution().sortList(node));
  }

  public ListNode sortList(ListNode head) {
    ListNode node = mergesort(head);
    return node;
  }
  
  public ListNode mergesort(ListNode head) {
    
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
    
    return merge(mergesort(head), mergesort(slow));
  }
  
  public ListNode merge(ListNode node1, ListNode node2) {
    ListNode dummy = new ListNode(0);
    ListNode curr = dummy;
    while(node1!=null || node2!=null) {
      if(node1==null || (node2!=null && node1.val>=node2.val)) {
        curr.next = node2;
        node2 = node2.next;
      }
      else {
        curr.next = node1;
        node1 = node1.next;
      }
      curr = curr.next;
    }
    return dummy.next;
  }
  
  public ListNode mergevariant(ListNode node1, ListNode node2) {
    ListNode dummy = new ListNode(0);
    ListNode curr = dummy;
    while(node1!=null || node2!=null) {
      if(node1==null) {
        curr.next = node2;
        node2 = node2.next;
      }
      else if(node2==null) {
        curr.next = node1;
        node1 = node1.next;
      }
      else {
        if(node1.val>=node2.val) {
          curr.next = node2;
          node2 = node2.next;
        } else {
          curr.next = node1;
          node1 = node1.next;
        }
      }
      curr = curr.next;
    }
    return dummy.next;
  }
}
