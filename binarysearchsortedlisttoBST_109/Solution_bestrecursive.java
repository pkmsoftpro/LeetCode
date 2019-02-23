package binarysearchsortedlisttoBST_109;

public class Solution_bestrecursive {

	public TreeNode sortedListToBST(ListNode head) {
	    ListNode current = head;
	    int L = 0;
	    while(current!=null) {
	        ++L;
	        current = current.next;
	    }
	    return helper(head, L);
	}

	private TreeNode helper(ListNode head, int L) {
	    if(L==0) return null;
	    int i = 0;
	    ListNode current = head;
	    while(i++<L/2) 
	        current = current.next;
	    TreeNode root = new TreeNode(current.val);
	    root.left = helper(head, L/2);
	    root.right = helper(current.next, (L-1)/2);
	    return root;
	}
	
	public static void main(String[] args) {
		ListNode l = new ListNode(1);
		l.next = new ListNode(2);
		l.next.next= new ListNode(3);
		l.next.next.next=new ListNode(4);
		l.next.next.next.next=new ListNode(5);
		l.next.next.next.next.next=new ListNode(6);
		TreeNode t = new Solution_bestrecursive().sortedListToBST(l);
		System.out.println(t);
	}
}
