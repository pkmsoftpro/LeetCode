package binarysearchsortedlisttoBST_109;

public class recursive2 {
	private ListNode node;

	public TreeNode sortedListToBST(ListNode head) {
		if (head == null) {
			return null;
		}
		int size = 0;
		node = head;
		while (head != null) {
			head = head.next;
			size++;
		}

		return helper(0, size - 1);
	}

	private TreeNode helper(int start, int end) {
		if (start > end) {
			return null;
		}
		int mid = (end - start) / 2 + start;
		TreeNode left = helper(start, mid - 1);
		TreeNode cur = new TreeNode(node.val);
		cur.left = left;
		node = node.next;
		TreeNode right = helper(mid + 1, end);
		cur.right = right;
		return cur;
	}
	
	public static void main(String[] args) {
		ListNode l = new ListNode(1);
		l.next = new ListNode(2);
		/*l.next.next= new ListNode(3);
		l.next.next.next=new ListNode(4);
		l.next.next.next.next=new ListNode(5);
		l.next.next.next.next.next=new ListNode(6);*/
		TreeNode t = new recursive2().sortedListToBST(l);
		System.out.println(t);
	}
}