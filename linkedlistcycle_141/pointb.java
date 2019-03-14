package linkedlistcycle_141;

/*
 * https://leetcode.com/problems/linked-list-cycle/discuss/44558/Java-change-the-next-pointer-pointing-to-itself
 */

public class pointb {

	// change the next pointer pointing to itself
	public boolean hasCycle(ListNode head) {
	    ListNode next = head;
	    while (next != null) {
	        if (next.next == next)
	            return true;
	        ListNode tmp = next.next;
	        next.next = next;
	        next = tmp;
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
		System.out.println(new pointb().hasCycle(head));
	}	
}
