package reorderlist_143;

/*
 * https://leetcode.com/problems/reorder-list/discuss/45147/Java-solution-with-3-steps
 */

import linkedlistcycle_141.ListNode;

public class sol_jeantimex {
	public void reorderList(ListNode head) {
		if (head == null || head.next == null)
			return;

		// step 1. cut the list to two halves
		// prev will be the tail of 1st half
		// slow will be the head of 2nd half
		ListNode prev = null, slow = head, fast = head, l1 = head;

		while (fast != null && fast.next != null) {
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}

		prev.next = null;

		// step 2. reverse the 2nd half
		ListNode l2 = reverse(slow);

		// step 3. merge the two halves
		merge(l1, l2);
	}

	ListNode reverse(ListNode head) {
		ListNode prev = null, curr = head, next = null;

		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}

		return prev;
	}

	void merge(ListNode l1, ListNode l2) {
		while (l1 != null) {
			ListNode n1 = l1.next, n2 = l2.next;
			l1.next = l2;

			if (n1 == null)
				break;

			l2.next = n1;
			l1 = n1;
			l2 = n2;
		}
	}
	
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode n1 = new ListNode(2);
		ListNode n2 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		ListNode n6 = new ListNode(6);
		head.next = n1;
		n1.next = n2;
		n2.next = n4;
		n4.next = n5;
		n5.next = n6;
		new sol_jeantimex().reorderList(head);
		System.out.println(head);
	}
}
