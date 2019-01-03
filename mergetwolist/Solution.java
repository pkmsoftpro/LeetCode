package mergetwolist;

public class Solution {

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		if(l1.val < l2.val){
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		} else{
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
	}
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(6);
		l1.next.next = new ListNode(8);
		
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(7);
		l2.next.next = new ListNode(9);
		System.out.println(mergeTwoLists(l1, l2));
	}
}
