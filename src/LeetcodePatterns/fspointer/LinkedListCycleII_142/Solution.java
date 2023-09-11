package LeetcodePatterns.fspointer.LinkedListCycleII_142;


// https://leetcode.com/problems/linked-list-cycle-ii/solutions/44781/concise-o-n-saddlebackvariant-by-using-c-with-detailed-alogrithm-description/
// https://www.youtube.com/watch?v=zbozWoMgKW0&t=2s&ab_channel=VivekanandKhyade-AlgorithmEveryDay
// https://www.youtube.com/watch?v=LUm2ABqAs1w&ab_channel=VivekanandKhyade-AlgorithmEveryDay

import util.ListNode;

public class Solution {
  
  public static void main(String[] args) {
//    ListNode node = new ListNode(3);
//    ListNode root = new ListNode(2);
//    node.next = root;
//    root.next = new ListNode(0);
//    root.next.next = new ListNode(-4);
//    root.next.next.next = root;
    
    ListNode node = new ListNode(1);
    ListNode root = new ListNode(2);
    node.next = root;
    root.next = node;

    ListNode resutl = new Solution().detectCycle(node);
    System.out.println(resutl);
  }
  
//  public ListNode detectCycle(ListNode head) {
//    if(head==null) return null;
//    ListNode dummy = head;
//    
//    List<ListNode> list = new ArrayList<ListNode>();
//
//    
//    while(dummy.next!=null) {
//      if(list.contains(dummy)) return dummy;
//      list.add(dummy);
//      dummy = dummy.next;
//    }
//    return null;
//  }
  
  public ListNode detectCycle(ListNode head) {
    if (head == null || head.next == null)
        return null;
    
    ListNode slow  = head;
    ListNode fast  = head;
    ListNode entry = head;
    
    while (fast.next!=null &&  fast.next.next!=null) {
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fast) {                      // there is a cycle
            while(slow != entry) {               // found the entry location
                slow  = slow.next;
                entry = entry.next;
            }
            return entry;
        }
    }
    return null;                                 // there has no cycle
  }
}
