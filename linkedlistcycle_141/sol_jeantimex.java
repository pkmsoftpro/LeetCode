package linkedlistcycle_141;

/*
 * Floyd’s cycle finding algorithm, also called the Tortoise and hare algorithm
 * 
 * 
 */

public class sol_jeantimex {

	public boolean hasCycle(ListNode head) {
		ListNode slow = head, fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast)
				return true;
		}

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
		System.out.println(new sol_jeantimex().hasCycle(head));
	}
}
