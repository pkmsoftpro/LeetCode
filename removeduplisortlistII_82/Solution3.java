package removeduplisortlistII_82;

/*
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/discuss/28335/My-accepted-Java-code
 */

public class Solution3 {

	public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode pre=dummy;
        ListNode cur=head;
        while(cur!=null){
            while(cur.next!=null&&cur.val==cur.next.val){
                cur=cur.next;
            }
            if(pre.next==cur){
                pre=pre.next;
            }
            else{
                pre.next=cur.next;
            }
            cur=cur.next;
        }
        return dummy.next;
    }
	
	public static void main(String[] args) {
		ListNode l = new ListNode(1);
		l.next = new ListNode(2);
		l.next.next= new ListNode(2);
		l.next.next.next=new ListNode(3);
		l.next.next.next.next=new ListNode(3);
		l.next.next.next.next.next=new ListNode(4);
		ListNode t = new Solution3().deleteDuplicates(l);
		System.out.println(t);
	}
}
