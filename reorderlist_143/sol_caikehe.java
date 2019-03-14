package reorderlist_143;

/*
 * https://leetcode.com/problems/reorder-list/discuss/45099/Java-iterative-in-place-solution.
 */

import linkedlistcycle_141.ListNode;

public class sol_caikehe {

	public void reorderList(ListNode head) {
	    if (head == null || head.next == null || head.next.next == null) {
	        return;
	    }
	    ListNode slow = head, fast = head.next; // take care here
	    while (fast != null && fast.next != null) {
	        fast = fast.next.next;
	        slow = slow.next;
	    }
	    ListNode p = slow.next, node = null;
	    slow.next = null;  // cut the first part
	    while (p != null) {  // reverse the second part
	        ListNode nxt = p.next;
	        p.next = node;
	        node = p;
	        p = nxt;
	    }
	    while (node != null) {  // merge two lists
	        ListNode nxt = node.next;
	        node.next = head.next;
	        head.next = node;
	        head = head.next.next;
	        node = nxt;
	    }
	}
}
