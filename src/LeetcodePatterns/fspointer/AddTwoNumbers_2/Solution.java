package LeetcodePatterns.fspointer.AddTwoNumbers_2;

import util.ListNode;

public class Solution {
  
  public static void main(String[] args) {
    
    ListNode l1 = new ListNode(9);
    l1.next = new ListNode(9);
    l1.next.next = new ListNode(9);
    
    ListNode l2 = new ListNode(9);
    l2.next = new ListNode(9);
    //l2.next.next = new ListNode(4);
    
    System.out.println(new Solution().addTwoNumbers(l1, l2));
  }

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode curr = new ListNode(0);
    ListNode dummy = curr;
    int carry = 0;
    while(l1!=null || l2!=null) {
      dummy.next= new ListNode(1);
      int num = carry;
      carry = 0;    // after using carry, reinitilize it to 0, to handle the bottom if condition
      if(l1!=null) {
        num += l1.val;
        l1 = l1.next;
      }
      if(l2!=null) {
        num += l2.val;
        l2 = l2.next;
      }
      if(num>9) {
        dummy.next.val = num%10; 
        carry = num/10;
      } else {
        dummy.next.val = num;
      }
      dummy = dummy.next;
    }
    if(carry!=0)
      dummy.next = new ListNode(carry);
    return curr.next;
  }
}
