package removeduplisortlistII_82;


public class MySolution {
	
	public ListNode deleteDuplicates(ListNode head) {
		int count=0;
		if(head==null || head.next==null) return head;
		ListNode current = head;
		ListNode nn = current.next;
		while(nn!=null && current!=null && nn.val==current.val){
			while(head.val==head.next.val){
				count++;
				head = head.next;
			}
			if(count>1) head = head.next;
			if(head!=null){
				current = head;
				nn = current.next;
			} else return null;
		}
		ListNode prev = head;
		while(nn!=null && current!=null){
			if(nn.val==current.val){
				prev.next= current.next.next;
				current = current.next.next;
				if(current!=null)nn=current.next;
				//current = current.next;
			} else {
				current = current.next;
				nn=current.next;
			}
			if(current!=null && current.next!=null && current.val!=current.next.val)prev = current;
		}
		//current=current.next;
		return head;
	}
	
	public static void main(String[] args) {
		ListNode l = new ListNode(1);
		l.next = new ListNode(1);
		l.next.next= new ListNode(1);
		l.next.next.next=new ListNode(2);
		l.next.next.next.next=new ListNode(3);
		/*l.next.next.next.next.next=new ListNode(4);
		l.next.next.next.next.next.next=new ListNode(5);*/
		ListNode t = new MySolution().deleteDuplicates(l);
		System.out.println(t);
	}
}
