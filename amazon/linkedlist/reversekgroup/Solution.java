package linkedlist.reversekgroup;

import linkedlist.ListNode;

import java.util.Arrays;

public class Solution {

  public ListNode reverseKGroup(ListNode root, int k) {
    if(k==1) return root;
    if(root==null) return null;
    ListNode dummy = new ListNode(0);
    ListNode ret= dummy;

    ListNode temp = root;
    ListNode mno = null;
    ListNode remain = null;
    ListNode cut = null;

    while (temp != null) {
      int i = 1;
      mno = temp;
      while (temp != null) {
        if (i == k) break;
        if (i == k - 1) cut = temp.next;
        i++;
        temp = temp.next;
      }
      if(i<k || (i==k && temp==null)) {
        ret.next = mno;
        return dummy.next;
      }
      remain = temp.next;
      cut.next = null;
      temp = remain;
      if (i == k) {
        // use mno
        ret.next = recuriveCalls(mno);
        while(ret.next!=null) ret = ret.next;
      } else {
        ret.next = remain;
        return  dummy.next;
      }
    }
    return dummy.next;
  }

  public ListNode recuriveCalls(ListNode root) {
    ListNode m = root.next, i = root;
    i.next = null;
    while (m != null) {
      ListNode j = m;
      m = m.next;
      j.next = i;
      i = j;
    }

    return i;
  }

  public static void main(String[] args) {
    int k = 1;
    ListNode root = ListNode
            .createListNode(Arrays
                    .asList(new Integer[] {1,2,3,4,5,6}));
    System.out.println(new Solution().reverseKGroup(root, k));
  }
}
