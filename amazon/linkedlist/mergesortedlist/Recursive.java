package linkedlist.mergesortedlist;
/*<pre>
Complexity Analysis

Time complexity : O(n + m)O(n+m)

Because each recursive call increments the pointer to l1 or l2 by one
(approaching the dangling null at the end of each list),
there will be exactly one call to mergeTwoLists per element in each list.
Therefore, the time complexity is linear in the combined size of the lists.

Space complexity : O(n + m)O(n+m)

The first call to mergeTwoLists does not return until the ends of both l1 and l2 have been reached,
so n + mn+m stack frames consume O(n + m)O(n+m) space.
</pre>*/
import linkedlist.ListNode;

public class Recursive {
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    if (l1 == null) {
      return l2;
    } else if (l2 == null) {
      return l1;
    } else if (l1.val < l2.val) {
      l1.next = mergeTwoLists(l1.next, l2);
      return l1;
    } else {
      l2.next = mergeTwoLists(l1, l2.next);
      return l2;
    }
  }
}
