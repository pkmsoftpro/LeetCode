package list.CopyListwithRandomPointer_138;


// https://leetcode.com/problems/copy-list-with-random-pointer/solutions/2696523/java-iterative-and-recursive-dfs-solutions-clean-and-simple/

import java.util.HashMap;
import java.util.Map;

import util.DLNode;

public class recursive {

  public static void main(String[] args) {
    DLNode node7 = new DLNode(7);
    DLNode node3 = new DLNode(3);
    DLNode node11 = new DLNode(11);
    DLNode node10 = new DLNode(10);
    DLNode node1 = new DLNode(1);
    
    node7.next = node3;
    node3.next = node11;
    node11.next = node10;
    node10.next = node1;
    
    node3.random = node7;
    node11.random = node1;
    node10.random = node11;
    node1.random = node7;
    
    DLNode copy = new recursive().copyRandomList(node7);
    System.out.println(copy);
  }
  
  public DLNode copyRandomList(DLNode head) {
    
    return compute(head, new DLNode(-1), new HashMap<DLNode, DLNode>());
  }
  
  public DLNode compute(DLNode head, DLNode copy, Map<DLNode, DLNode> nodemap) {
    if(head==null) return null;
    if(nodemap.containsKey(copy)) return nodemap.get(copy);
    
    DLNode newnode = new DLNode(-1);
    copy.val = head.val;
    nodemap.put(head, copy);
    if(head.next!=null) copy.next = newnode;
    
    compute(head.next, copy.next, nodemap);
    nodemap.get(head).random = nodemap.get(head.random);
    
    return copy;
  }
  
  public DLNode computeVariant(DLNode head, DLNode copy, Map<DLNode, DLNode> nodemap) {
    if(head==null) return null;
    if(nodemap.containsKey(copy)) return nodemap.get(copy);
    
    copy = new DLNode(head.val);
    nodemap.put(head, copy);
    
    compute(head.next, copy.next, nodemap);
    nodemap.get(head).random = nodemap.get(head.random);
    nodemap.get(head).next = nodemap.get(head.next);
    
    return nodemap.get(head);
  }
}
