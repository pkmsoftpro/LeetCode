package linkedlistcycle_141;

/*
 * breaks the original list, so no
 * 
 * https://leetcode.com/problems/linked-list-cycle/discuss/44603/Shorter-Solution-in-Java
 */

public class recursive {

	public boolean hasCycle(ListNode head) {
		ListNode temp = head;
		if (head == null || head.next == null){
			head = temp;
			return false;
		}
		if (head.next == head) {
			head = temp;
			return true;
		}
		ListNode nextNode = head.next;
		head.next = head;
		boolean isCycle = hasCycle(nextNode);
		return isCycle;
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
		System.out.println(new recursive().hasCycle(head));
	}
}
