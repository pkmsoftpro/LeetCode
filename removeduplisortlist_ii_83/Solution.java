package removeduplisortlist_ii_83;

/*
 * https://www.youtube.com/watch?v=j3Kd06VfJhw
 */

public class Solution {

	public ListNode deleteDuplicates(ListNode head) {
		ListNode next_next;
		ListNode current = head;
		
		while(current.next!=null){
			if(current.val==current.next.val){
				next_next = current.next.next;
				current.next = next_next;
			} else {
				current = current.next;
			}
		}
		
		return head;
	}
	
	public static void main(String[] args) {
		ListNode l = new ListNode(1);
		l.next = new ListNode(1);
		l.next.next= new ListNode(2);
		l.next.next.next=new ListNode(2);
		l.next.next.next.next=new ListNode(3);
		l.next.next.next.next.next=new ListNode(4);
		ListNode t = new Solution().deleteDuplicates(l);
		System.out.println(t);
	}
}
