package insertionsortlist_147;
/*
 * https://leetcode.com/problems/insertion-sort-list/discuss/46573/Clean-Java-solution-using-a-fake-head
 * 
 * https://leetcode.com/problems/insertion-sort-list/discuss/46531/Java-iterative-and-recursive-solutions.
 */

import linkedlistcycle_141.ListNode;

public class sol_jeantimex {

	public ListNode insertionSortList(ListNode head) {
		ListNode curr = head, next = null;
		// l is a fake head
		ListNode l = new ListNode(0);

		while (curr != null) {
			next = curr.next;

			ListNode p = l;
			while (p.next != null && p.next.val < curr.val)
				p = p.next;

			// insert curr between p and p.next
			curr.next = p.next;
			p.next = curr;
			curr = next;
		}

		return l.next;
	}//65318724
	
	public static void main(String[] args) {
		ListNode head = new ListNode(6);
		ListNode n1 = new ListNode(5);
		ListNode n2 = new ListNode(3);
		ListNode n3 = new ListNode(1);
		ListNode n4 = new ListNode(8);
		ListNode n5 = new ListNode(7);
		ListNode n6 = new ListNode(2);
		ListNode n7 = new ListNode(4);
		head.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		System.out.println(new sol_jeantimex().insertionSortList(head));
	}
}

/*
 * // recursively
public ListNode insertionSortList1(ListNode head) {
    if (head == null || head.next == null) {
        return head;
    }
    ListNode p = insertionSortList(head.next);
    if (head.val <= p.val) {  // already sorted
        head.next = p;
        return head;
    }
    ListNode ret = p;
    while (p.next != null && p.next.val < head.val) {
        p = p.next;
    }
    head.next = p.next;
    p.next = head;
    return ret;
}
 */
