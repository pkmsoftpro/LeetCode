package linkedlist.addtwonumbers;

import linkedlist.ListNode;

import java.util.Arrays;

public class Solution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode node = new ListNode();
    ListNode m = l1;
    ListNode n = l2;
    int carry=0;

    ListNode curr = node;

    while(m!=null || n!=null){
      int val = (m!=null?m.val: 0) + (n!=null?n.val:0) + carry;
      carry = val/10;
      curr.next = new ListNode(val%10);
      if(m!=null) m = m.next;
      if(n!=null) n = n.next;
      curr = curr.next;
    }
    if(carry>0) curr.next = new ListNode(carry);
    return node.next;
  }

  public static void main(String[] args) {
    ListNode l1 = ListNode.createListNode(Arrays.asList(new Integer[]{9,9,9,9,9,9,9}));
    ListNode l2 = ListNode.createListNode(Arrays.asList(new Integer[]{9,9,9,9}));
    System.out.println(new Solution().addTwoNumbers(l1,l2));
  }
}
