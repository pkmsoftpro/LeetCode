package linkedlist.mergesortedlist;

import linkedlist.ListNode;

/*
<pre>
Time complexity : O(n + m)O(n+m)

Because exactly one of l1 and l2 is incremented on each loop iteration,
the while loop runs for a number of iterations equal to the sum of the lengths of the two lists.
All other work is constant, so the overall complexity is linear.

Space complexity : O(1)O(1)

The iterative approach only allocates a few pointers, so it has a constant overall memory footprint.
</pre>
 */

public class Iterative {
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    // maintain an unchanging reference to node ahead of the return node.
    ListNode prehead = new ListNode(-1);

    ListNode prev = prehead;
    while (l1 != null && l2 != null) {
      if (l1.val <= l2.val) {
        prev.next = l1;
        l1 = l1.next;
      } else {
        prev.next = l2;
        l2 = l2.next;
      }
      prev = prev.next;
    }

    // At least one of l1 and l2 can still have nodes at this point, so connect
    // the non-null list to the end of the merged list.
    prev.next = l1 == null ? l2 : l1;

    return prehead.next;
  }
}
