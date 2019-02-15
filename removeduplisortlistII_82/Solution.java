package removeduplisortlistII_82;

/*
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/discuss/28424/Java-Recursive-Solution_divideAndConquer
 */

public class Solution {
	
	public ListNode deleteDuplicates(ListNode head) {
		head = getTrueHead(head);
 	        if(head == null || head.next == null || head.next.next == null) return head;
		ListNode par = head;
		while(par != null){
			ListNode cur = par.next;		
			par.next = getTrueHead(cur);
			par = par.next;
 		}
		
		return head;
    }

    public ListNode getTrueHead(ListNode head){
		if(head == null || head.next == null) return head;
		if(head.val != head.next.val) return head;
		ListNode cur = head;
		ListNode next = cur.next;
		int val = cur.val;
		while(next != null && val == next.val ) next = next.next;
		head = next;
		return getTrueHead(head);
    }
    
    public static void main(String[] args) {
		ListNode l = new ListNode(1);
		l.next = new ListNode(2);
		l.next.next= new ListNode(2);
		l.next.next.next=new ListNode(3);
		l.next.next.next.next=new ListNode(3);
		l.next.next.next.next.next=new ListNode(4);
		ListNode t = new Solution().deleteDuplicates(l);
		System.out.println(t);
	}
}
