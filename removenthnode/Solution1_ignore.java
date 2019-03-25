package removenthnode;

class Solution1 {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 1, i=1;
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while(head.next!=null){
        	length++;
        	current.next = new ListNode(head.val);
        	current = current.next;
        	head = head.next;
        }
        current.next = new ListNode(head.val);
        head = dummy.next;
        dummy = new ListNode(0);
        current = dummy;
        int modifyNow = length-n;
        while(i++<=modifyNow){
        	current.next = new ListNode(head.val);
        	current = current.next;
        	head = head.next;
        }
        current.next = head.next;
        return dummy.next;
    }
    
    public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(3);
		l1.next.next.next = new ListNode(4);
		l1.next.next.next.next = new ListNode(5);
		ListNode n = removeNthFromEnd(l1,3);
		System.out.println(l1);
	}
}
