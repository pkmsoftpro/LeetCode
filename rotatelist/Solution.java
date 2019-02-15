package rotatelist;

/*
 * https://leetcode.com/problems/rotate-list/discuss/213152/Java-Solution2%3A-O(n)-time-and-O(1)-space
 */
public class Solution
{
    public ListNode rotateRight(ListNode head, int k) 
    {
        if(head == null)
            return null;

        ListNode tail = head;       // tail => Last node of list
        int n = 1;                  // n => Length of list

        while(tail.next != null)    // Find last node and length of list
        {
            tail = tail.next; 
            n++;
        }

        k = k % n;                  // Make k in the range 0 <= k < n
        if(k == 0)                  // No need of Rotation if k is in multiples of n
            return head;
        
        tail.next = head;           // Make a cycle by connecting the tail to head
        int stepsToNewHead = n - k; // newHead is n - k steps ahead from the tail

        while(stepsToNewHead-- > 0) 
            tail = tail.next;

        ListNode newHead = tail.next;
        tail.next = null;
        return newHead;
    }
    
    public static void main(String[] args) {
		ListNode l1 = new ListNode(1);   
        l1.next = new ListNode(4);  
        l1.next.next = new ListNode(7);  
        l1.next.next.next = new ListNode(10);
        l1.next.next.next.next= new ListNode(11);
        System.out.println(new Solution().rotateRight(l1,2));
    }
}
