package linkedlistcycle_II_142;

/*
 * https://leetcode.com/problems/linked-list-cycle-ii/discuss/44904/Clean-Java-solution-with-explanation
 * 
 * honorable mentions:
 * https://leetcode.com/problems/linked-list-cycle-ii/discuss/44774/Java-O(1)-space-solution-with-detailed-explanation.
 */

import linkedlistcycle_141.ListNode;

public class sol_jeantimex {

	public ListNode detectCycle(ListNode head) {
		  ListNode slow = head, fast = head;
		  
		  while (fast != null && fast.next != null) {
		    slow = slow.next;
		    fast = fast.next.next;
		    
		    if (slow == fast)
		        // found the cycle
		        break;
		  }
		  
		  if (fast == null || fast.next == null)
		    // in case there is no cycle
		    return null;
		  
		  // let the slow pointer go from the head 
		  // and meet the fast pointer
		  // the meeting point is our answer
		  slow = head;
		  
		  while (slow != fast) {
		    slow = slow.next;
		    fast = fast.next;
		  }
		  
		  return slow;
		}
	
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode n1 = new ListNode(2);
		head.next = n1;
		/*ListNode n2 = new ListNode(0);
		ListNode n4 = new ListNode(-4);
		
		n1.next = n2;
		n2.next = n4;
		n4.next = n1;*/
		System.out.println(new sol_jeantimex().detectCycle(head));
	}
}
