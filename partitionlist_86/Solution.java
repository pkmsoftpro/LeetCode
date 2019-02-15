package partitionlist_86;
/*
 * https://leetcode.com/problems/partition-list/discuss/29185/Very-concise-one-pass-solution
 */

public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode less = new ListNode(0);
        ListNode big = new ListNode(0);
        ListNode p1 = less, p2 = big;
        while(head!=null){
        	if(head.val<x){
        		p1 = p1.next = head;
        	} else {
        		p2 = p2.next = head;
        	}
        	head = head.next;
        }
        p2.next = null;
        p1.next = big.next;
    	return less.next;
    }
    
    public static void main(String[] args) {
		ListNode l = new ListNode(1);
		l.next = new ListNode(4);
		l.next.next= new ListNode(3);
		l.next.next.next=new ListNode(2);
		l.next.next.next.next=new ListNode(5);
		l.next.next.next.next.next=new ListNode(2);
		ListNode t = new Solution().partition(l, 3);
		System.out.println(t);
	}
}
