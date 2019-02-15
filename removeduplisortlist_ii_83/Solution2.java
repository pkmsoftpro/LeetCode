package removeduplisortlist_ii_83;

/*
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/discuss/28773/Two-Pointers-Java-Solution_divideAndConquer
 */

public class Solution2 {
	
	public ListNode deleteDuplicates(ListNode head) {
		if(head==null || head.next==null) return head;
		ListNode current = head;
		ListNode nn = current.next;
		while(nn!=null){
			if(current.val!=nn.val){
				current.next = nn;
				current = nn;
			}
			nn = nn.next;
		}
		current.next = null;
		return head;
	}
	
	public static void main(String[] args) {
		ListNode l = new ListNode(1);
		l.next = new ListNode(1);
		l.next.next= new ListNode(2);
		l.next.next.next=new ListNode(2);
		l.next.next.next.next=new ListNode(3);
		l.next.next.next.next.next=new ListNode(4);
		l.next.next.next.next.next.next=new ListNode(4);
		ListNode t = new Solution2().deleteDuplicates(l);
		System.out.println(t);
	}
}
