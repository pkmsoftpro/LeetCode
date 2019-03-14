package linkedlistcycle_141;

/*
 * https://leetcode.com/problems/linked-list-cycle/discuss/44651/Java-1ms-reversing-list
 */

public class reverselist_good {

	public boolean hasCycle(ListNode head) {
		ListNode prev = null;
		ListNode curr = head;
		while (curr != null) {
			ListNode next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		if (prev == head && head != null && head.next != null) // if we reach again, there is a cycle
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		ListNode head = new ListNode(3);
		ListNode n1 = new ListNode(2);
		ListNode n2 = new ListNode(0);
		ListNode n4 = new ListNode(-4);
		head.next = n1;
		n1.next = n2;
		n2.next = n4;
		n4.next = n1;
		System.out.println(new reverselist_good().hasCycle(head));
	}
}
