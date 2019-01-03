package kgroupreversenode25;

/*
 * //https://leetcode.com/problems/reverse-nodes-in-k-group/discuss/211129/Easy-understandable-Java-Solution
//Reverse a Doubly Linked List in C by Vivekanand Khyade - Algorithm Every Day
// https://www.youtube.com/watch?v=uz6dimvl40Q
// https://www.youtube.com/watch?v=9F55R1VJRZ4
// his channel: https://www.youtube.com/user/vivekanandkhyade/videos
 */

class Solution {
	public static ListNode reverseKGroup(ListNode head, int k) {
		ListNode dummyHead = new ListNode(0);
		dummyHead.next = head;
		ListNode prev = dummyHead, cur = dummyHead;
		while (cur != null) {
			for (int i = 0; i < k; i++) {
				if (cur == null || cur.next == null)
					return dummyHead.next;
				cur = cur.next;
			}
			ListNode nxt = prev.next;
			prev.next = reverse(prev.next, cur.next);
			prev = nxt;
			cur = nxt;
		}
		return dummyHead.next;
	}

	private static ListNode reverse(ListNode head, ListNode tail) {
		if (head == tail || head.next == tail)
			return head;
		ListNode prev = head, cur = head.next;
		while (cur != tail) {
			ListNode nxt = cur.next;
			cur.next = prev;
			prev = cur;
			cur = nxt;
		}
		head.next = tail;
		return prev;
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(3);
		l1.next.next.next = new ListNode(4);
		l1.next.next.next.next = new ListNode(5);

		System.out.println(reverseKGroup(l1, 3));
	}
}
