package LeetcodePatterns.inplacereversal.RotateList_61;

import util.ListNode;

public class Solution {
  
  public static void main(String[] args) {
    ListNode node = new ListNode(1);
    node.next = new ListNode(2);
    node.next.next = new ListNode(3);
    node.next.next.next = new ListNode(4);
    node.next.next.next.next = new ListNode(5);
    node.next.next.next.next.next = new ListNode(6);
    node.next.next.next.next.next.next = new ListNode(7);
//    node.next.next.next.next.next.next.next = new ListNode(8);
//    node.next.next.next.next.next.next.next.next = new ListNode(9);
//    node.next.next.next.next.next.next.next.next.next = new ListNode(10);
//    node.next.next.next.next.next.next.next.next.next.next = new ListNode(11);
    
    
    int k = 5;
    
    node = new Solution().rotateRight(node, k);
    System.out.println(node);
  }

  public ListNode rotateRight(ListNode head, int k) {
    
    if(head==null) return null;
    
    ListNode dummy = head;
    ListNode slow = head;
    ListNode fast = head;
    ListNode prevWhenEqual = head;
    
    int count = 0;
    while(fast!=null && fast.next!=null) {
      count++;
      prevWhenEqual = slow;
      slow = slow.next;
      fast = fast.next.next;
    }
    int mid = 0;
    if(fast==null) {
      mid = count;
      count = count*2;
    }
    else {
      mid = count+1;
      count = count*2+1;
    }
    
    if(k>count) {
      k = k%count;
    }
    
    if(k==count || count==1 || k==0)
      return head;
    
    if(mid>count-k) {
            int move = count-k;
            
            ListNode prev = head;
            while(move>0) {
              prev = head;
              head = head.next;
              move--;
            }
            prevWhenEqual = head;
            prev.next = null;
            prev = dummy;
            dummy = prevWhenEqual;
            
            head = null;
            while(prevWhenEqual!=null) {
              head = prevWhenEqual;
              prevWhenEqual = prevWhenEqual.next;
            }
            
            head.next = prev;
    }
    else if(mid<count-k) {
            ListNode prev = slow;
            int rotation = 0;
            if(fast==null)
              rotation = count-k;
            else rotation = count-k+1;
            while(mid<rotation) {
              prev = slow;
              slow = slow.next;
              mid++;
            }
            
            prev.next = null;
            
            dummy = slow;
            
            while(slow!=null) {
              prev = slow;
              slow = slow.next;
            }
            
            prev.next = head;
    } else {
            if(fast!=null) {
              prevWhenEqual = slow;
              slow = slow.next;
            }
            prevWhenEqual.next = null;
            ListNode prev = slow;
            dummy = slow;
            while(slow!=null) {
              prev = slow;
              slow = slow.next;
            }
            
            prev.next = head;
    }
    
    return dummy;
  }
}
