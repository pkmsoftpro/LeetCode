package linkedlist.mergesortedlist;

import linkedlist.ListNode;

import java.util.Arrays;

public class Solution {
  public static void main(String[] args) {
    ListNode l1 = ListNode.createListNode(Arrays.asList(new Integer[] {}));
    ListNode l2 = ListNode.createListNode(Arrays.asList(new Integer[] {}));
    System.out.println(new Solution().mergeTwoLists(l1, l2));
  }

  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode ret=null;
    if(l1!=null && l2!=null){
      if(l1.val<l2.val){
        ret = new ListNode(l1.val);
        l1 = l1.next;
      } else {
        ret = new ListNode(l2.val);
        l2 = l2.next;
      }
    } else if(l1!=null){
      ret = new ListNode(l1.val);
      l1 = l1.next;
    } else if(l2!=null){
      ret = new ListNode(l2.val);
      l2 = l2.next;
    }
    ListNode p1 = l1, p2 = l2, p3 = ret;
    while(p1!=null || p2!=null){
      if(p1==null){
        while(p2!=null){
          p3.next = new ListNode(p2.val);
          p3 = p3.next;
          p2 = p2.next;
        } return ret;
      }
      if(p2==null){
        while(p1!=null){
          p3.next = new ListNode(p1.val);
          p3 = p3.next;
          p1 = p1.next;
        } return ret;
      }
      if(p1.val<p2.val){
        p3.next = new ListNode(p1.val);
        p1 = p1.next;
        p3 = p3.next;
      } else if(p2.val<p1.val){
        p3.next = new ListNode(p2.val);
        p3 = p3.next;
        p2 = p2.next;
      } else if(p1.val==p2.val){
        p3.next = new ListNode(p1.val);
        p3 = p3.next;
        p3.next = new ListNode(p2.val);
        p3 = p3.next;
        p1 = p1.next;
        p2 = p2.next;
      }
    }
    return ret;
  }
}
