package linkedlistcycle_141;

import java.util.HashMap;
import java.util.Map;

public class MySol {

	public boolean hasCycle(ListNode head) {
		
		ListNode temp = head;
		ListNode curr = head;
		Map<ListNode,Integer> map = new HashMap<ListNode, Integer>();
		
		while(head!=null){
			
			temp = head.next;
			while(temp!=null && !((map.get(temp)==null?0:1)==1)){
				map.put(temp, 1);
				if(head==temp){
					return true;
				}
				temp=temp.next;
			}
			head = head.next;
			map.clear();
		}
		head = curr;
		return false;
	}
	
	public static void main(String[] args) {
		ListNode head = new ListNode(3);
		ListNode n1 = new ListNode(2);
		ListNode n2 = new ListNode(0);
		ListNode n4 = new ListNode(-4);
		head.next = n1;
		n1.next = n2;
		n2.next = n4;
		n4.next = n1;
		System.out.println(new MySol().hasCycle(head));
	}
}
