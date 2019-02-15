package reverselinklist_92;

/*
 * https://leetcode.com/problems/reverse-linked-list-ii/discuss/236020/Java-Solution-with-explanation
 */

/*
 * 1 -> 2 -> 3 -> 4 ->5 -> 6 -> 7 -> NULL, m = 3, n = 6
prev: 2
curr: 3
next: 4
step 1: find the node prev at (m - 1) position
step 2:
while (curr.next != null) {
reverse curr and curr.next:
curr.next = next.next;
next.next = prev.next;
prev.next = next;
}
Update m, until m == n, return output

TC: O(n)
SC: O(1)
 */


public class Solution {
	public ListNode reverseBetween(ListNode head, int m, int n) {
	    if (head == null || head.next == null || m >= n) {
	        return head;
	    }
	    ListNode dummy = new ListNode(0);
	    dummy.next = head;
	    ListNode prev = dummy;
	    ListNode curr = head;
	    int pos = 0;
	    while (curr != null && pos < m - 1) {
	        prev = curr;
	        curr = curr.next;
	        pos++;
	    }
	    while (curr.next != null && m < n) {
	        ListNode next = curr.next;
	        curr.next = next.next;
	        next.next = prev.next;
	        prev.next = next;
	        m++;
	    }
	    return dummy.next;
	}
	
	public static void main(String[] args) {
		ListNode l = new ListNode(1);
		l.next = new ListNode(2);
		l.next.next= new ListNode(3);
		l.next.next.next=new ListNode(3);
		l.next.next.next.next=new ListNode(4);
		l.next.next.next.next.next=new ListNode(4);
		l.next.next.next.next.next.next=new ListNode(5);
		ListNode t = new Solution().reverseBetween(l, 3, 5);
		System.out.println(t);
	}
}
