package removenthnode;
/*
 * This algorithm generates counter. In this case, list size is 5 and n is 1. so we will
 * generate a counter FAST, it lapses the list by 1 from the beginning, so we are left with 
 * a counter with count equals 4.  
dummy,fast,slow = 0 1 2 3 4 5 
	after fast while counter
	fast  = 2 3 4 5
after slow while counter, slow will point to the element that is needed to be removed 
	slow  = 4 5 
 */
class Solution {
	public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        
        while(n + 1> 0) {
            fast = fast.next;
            n--;
        }
        
        while(fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        
        // nth from the end is "slow", now delete it
        slow.next = slow.next.next;
        
        return dummy.next;
    }
    
    public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(3);
		l1.next.next.next = new ListNode(4);
		l1.next.next.next.next = new ListNode(5);
		ListNode n = removeNthFromEnd(l1,2);
		System.out.println(l1);
	}
}
