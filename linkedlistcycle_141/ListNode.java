package linkedlistcycle_141;

public class ListNode {
	public int val;
	public ListNode next;

	public ListNode(int x) {
		val = x;
	}

	public String toString() {
		String retVal = "";
		int safetyNet = 0;
		ListNode n = this;
		while (n != null) {
			retVal += n.val + " ";
			n = n.next;
			if(safetyNet++>10) break;
		}
		return retVal;
	}
}
