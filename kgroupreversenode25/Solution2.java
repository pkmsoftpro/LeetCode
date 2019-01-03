package kgroupreversenode25;

public class Solution2 {
    public static ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null)
            return head;
        
        int n = 0;
        ListNode d = new ListNode(0); //dummy node
        ListNode h = d;
        d.next = head;
        
        d=head;
        while(d!=null){//get the count of nodes
            n++;
            d=d.next;
        }
        d=h;
        ListNode p = head;
        ListNode q = head;
        for(int i=0;i+k<=n;i=i+k){//i is the begin index of each k-length parts
            for(int j=1;j<k;j++){ //reverse each part by putting each node on the head of the part
                q = p.next;
                p.next = q.next;
                q.next = d.next;
                d.next = q;
            }
            d=p; //d now is on the last node and one node ahead of the head of next part
            p=p.next;//p is on the head of next part           
        }
        return h.next;
        
        
    }
    
    public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(3);
		l1.next.next.next = new ListNode(4);
		l1.next.next.next.next = new ListNode(5);

		System.out.println(reverseKGroup(l1, 3));
	}
}
