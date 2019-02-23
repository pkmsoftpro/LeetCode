package binarysearchsortedlisttoBST_109;

/*
 * https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/discuss/35567/Java-fast-slow-pointer-recursive-solution.
 * 
 * intuition: 
 * 1) Get the Middle of the linked list and make it root.
2) Recursively do same for left half and right half.
       a) Get the middle of left half and make it left child of the root
          created in step 1.
       b) Get the middle of right half and make it right child of the
          root created in step 1.
          
move fast 2 steps and slow 1 step until fast is null. 

divide at slow.next = null;
before slow and after slow (recursive).
 */

public class recursive {

	public TreeNode sortedListToBST(ListNode head) {
	    if (head == null) {
	        return null; 
	    }
	    if (head.next == null) {
	        return new TreeNode(head.val);
	    }
	    ListNode fast = head, slow = head;
	    if (fast != null && fast.next != null) {
	        fast = fast.next.next;
	    }
	    while(fast != null && fast.next != null) {
	        fast = fast.next.next;
	        slow = slow.next;
	    }
	    TreeNode node = new TreeNode(slow.next.val);
	    node.right = sortedListToBST(slow.next.next);
	    slow.next = null;
	    node.left = sortedListToBST(head);
	    return node;
	}
	
	public static void main(String[] args) {
		ListNode l = new ListNode(1);
		l.next = new ListNode(2);
		l.next.next= new ListNode(3);
		l.next.next.next=new ListNode(4);
		l.next.next.next.next=new ListNode(5);
		l.next.next.next.next.next=new ListNode(6);
		TreeNode t = new recursive().sortedListToBST(l);
		System.out.println(t);
	}
}
