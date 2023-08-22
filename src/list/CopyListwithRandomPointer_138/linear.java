package list.CopyListwithRandomPointer_138;

import java.util.HashMap;
import java.util.Map;

import util.DLNode;

public class linear {

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
    
    DLNode copy = new linear().copyRandomList(node7);
    System.out.println(copy);
  }
  
  public DLNode copyRandomList(DLNode head) {
    
    Map<DLNode, DLNode> nodemap = new HashMap<DLNode, DLNode>();
    DLNode copy = head;
    
    while (head != null) {
      nodemap.computeIfAbsent(head, item -> new DLNode(item.val));
      head = head.next;
    }
    
    head = copy;
    
    while(head!=null) {
      nodemap.get(head).next = nodemap.get(head.next);
      nodemap.get(head).random = nodemap.get(head.random);
      head = head.next;
    }
    
    return nodemap.get(copy);
  }
}
