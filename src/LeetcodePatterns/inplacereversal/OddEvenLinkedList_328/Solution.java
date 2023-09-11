package LeetcodePatterns.inplacereversal.OddEvenLinkedList_328;

// https://leetcode.com/problems/odd-even-linked-list/solutions/1606963/c-simplest-saddlebackvariant-w-explanation-one-pass/

import util.ListNode;

public class Solution {

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

    new Solution().oddEvenListVariant(node);
    System.out.println(node);
  }

  public ListNode oddEvenListVariant(ListNode head) {
    if (head == null || head.next == null || head.next.next == null)
      return head;

    ListNode odd = head;
    ListNode even = head.next;
    ListNode evenStart = head.next;

    while (odd.next != null && even.next != null) {
      odd.next = even.next; // Connect all odds
      even.next = odd.next.next; // Connect all evens
      odd = odd.next;
      even = even.next;
    }
    odd.next = evenStart; // Place the first even node after the last odd node.
    return head;
  }

  public ListNode oddEvenList(ListNode head) {

    if (head == null)
      return null;
    int i = 1;
    ListNode node = head;
    ListNode next = new ListNode(0);
    ListNode prev = new ListNode(0);
    ListNode r1 = prev;
    ListNode r2 = next;

    while (node != null) {
      if (i++ % 2 == 0) {
        prev.next = node;
        prev = prev.next;
      } else {
        next.next = node;
        next = next.next;
      }
      node = node.next;
    }
    prev.next = null;
    next.next = r1.next;
    return r2.next;
  }
}
