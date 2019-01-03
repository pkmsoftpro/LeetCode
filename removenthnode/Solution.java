package removenthnode;

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
