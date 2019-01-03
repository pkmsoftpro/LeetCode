package mergetwolist;

public class Solution2 {

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
		ListNode dummyHead = new ListNode(0);
        ListNode prev = dummyHead;
        
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        
        if(l1 == null && l2 != null){
            prev.next = l2;
        } 
        else if(l2 == null && l1 != null){
            prev.next = l1;
        }
        
        return dummyHead.next;
	}
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(6);
		l1.next.next = new ListNode(8);
		
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(7);
		l2.next.next = new ListNode(9);
		System.out.println(mergeTwoLists(l1, l2));
	}
}
