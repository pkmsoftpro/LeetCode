package LeetcodePatterns.graph.CloneGraph_133;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Solution {
  private HashMap<Integer, Node> map = new HashMap<>();
  public static void main(String[] args) {
    Node root = new Node(1, new ArrayList<Node>());
    Node neighbour2 = new Node(2, new ArrayList<Node>());    //   1----2
    Node neighbour3 = new Node(3, new ArrayList<Node>());    //   |    |
    Node neighbour4 = new Node(4, new ArrayList<Node>());    //   4----3
    root.neighbors.add(neighbour2);
    root.neighbors.add(neighbour4);
    neighbour2.neighbors.add(root);
    neighbour2.neighbors.add(neighbour3);
    neighbour3.neighbors.add(neighbour2);
    neighbour3.neighbors.add(neighbour4);
    neighbour4.neighbors.add(root);
    neighbour4.neighbors.add(neighbour3);

    Node copy = new Solution().cloneGraph(root);
    System.out.println(copy);
}
  
  public Node cloneGraph(Node node) {
    Node clonednode = clone(node);
    return clonednode;
  }
  
  public Node clone(Node node) {
    if (node == null) return null;
    if(map.containsKey(node.val)) return map.get(node.val);
    Node copy = new Node(-1);
    copy.val = node.val;
    map.put(copy.val, copy);
    for(Node item : node.neighbors) {
      copy.neighbors.add(clone(item));
    }
    return copy;
  }
  
  
  
  public Node cloneGraphVariant(Node node) {
    Node clonednode = cloneVariant(node, new Node(-1), new HashMap<Node, Node>());
    return clonednode;
  }
  
  public Node cloneVariant(Node node, Node copy, Map<Node, Node> nodemap) {
    if(nodemap.containsKey(node)) return nodemap.get(node);
    copy.val = node.val;
    nodemap.put(node, copy);
    for(Node item : node.neighbors) {
      if(nodemap.containsKey(item)) {
        nodemap.get(node).neighbors.add(nodemap.get(item));
      } else {
        Node clonenode = cloneVariant(item, new Node(-1), nodemap);
        nodemap.get(node).neighbors.add(clonenode);
      }
    }
    return copy;
  }
}
