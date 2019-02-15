package reverselinklist_206;

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        return reverse(head);
    }
    
    private ListNode reverse(ListNode node) {
        if (node.next == null) return node;
        ListNode head = reverse(node.next);
        node.next.next = node;
        node.next = null;
        return head;
    }
    
    public static void main(String[] args) {
		ListNode l = new ListNode(1);
		l.next = new ListNode(2);
		l.next.next= new ListNode(3);
		l.next.next.next=new ListNode(4);
		/*l.next.next.next.next=new ListNode(3);
		l.next.next.next.next.next=new ListNode(4);
		l.next.next.next.next.next.next=new ListNode(4);*/
		ListNode t = new Solution().reverseList(l);
		System.out.println(t);
	}
}
