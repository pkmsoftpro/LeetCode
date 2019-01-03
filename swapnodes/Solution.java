package swapnodes;

public class Solution {

	public static ListNode swapPairs(ListNode head) {
		ListNode dummy = new ListNode(0);
		ListNode temp = dummy;
		int i=0;
		ListNode prev = null;
		while(head!=null){
			
			if(i!=0 && i%2==1){
				temp.next=new ListNode(head.val);
				temp = temp.next;
				temp.next = new ListNode(prev.val);
				temp = temp.next;
			}
			prev = head;
			head = head.next;
			i++;
		}
		if(!(i%2==0)){
			temp.next = prev;
		}
		return dummy.next;
	}
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);   
        l1.next = new ListNode(4);  
        l1.next.next = new ListNode(7);  
        l1.next.next.next = new ListNode(10);
        //l1.next.next.next.next= new ListNode(11);
        System.out.println(swapPairs(l1));
	}
}
