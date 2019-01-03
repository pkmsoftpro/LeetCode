package mergetwolist;

public class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
	
	public String toString(){
		String retVal = "";
		ListNode n = this;
		while(n!=null){
			retVal += n.val +" ";
			n = n.next;
		}
		return retVal;
	}
}
