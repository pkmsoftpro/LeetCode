package graph.clonegraph_133;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

class Node1 {
  public int val;
  public List<Node1> neighbors;

  public Node1() {
    val = 0;
    neighbors = new ArrayList<Node1>();
  }

  public Node1(int _val, List<Node1> _neighbors) {
      val = _val;
      neighbors = _neighbors;
  }

  public String toString() {
      return this.val + " ";
  }
}

public class Solution {
  
  public Node1 cloneGraph2(Node1 root) {
    Stack<Node1> stack = new Stack<Node1>();
    stack.push(root);
    Node1 make = new Node1(root.val, new ArrayList<Node1>());
    Map<Node1, Node1> adj = new HashMap<Node1, Node1>();
    adj.put(root, make);
    while(!stack.isEmpty()) {
      Node1 tempNode = stack.pop();
      for(Node1 node : tempNode.neighbors) {
        if(!adj.containsKey(node)) {
          stack.push(node);
          adj.put(node, new Node1(node.val, new ArrayList<Node1>()));
        }
        adj.get(node).neighbors.add(adj.get(tempNode));
      }
    }
    return make;
  }

  public static void main(String[] args) {
    Node1 root = new Node1(1, new ArrayList<Node1>());
    Node1 neighbour2 = new Node1(2, new ArrayList<Node1>());
    Node1 neighbour4 = new Node1(4, new ArrayList<Node1>());
    Node1 neighbour3 = new Node1(3, new ArrayList<Node1>());
    root.neighbors.add(neighbour2);
    root.neighbors.add(neighbour4);
    neighbour2.neighbors.add(root);
    neighbour2.neighbors.add(neighbour3);
    neighbour3.neighbors.add(neighbour2);
    neighbour3.neighbors.add(neighbour4);
    neighbour4.neighbors.add(root);
    neighbour4.neighbors.add(neighbour3);

    neighbour2 = new Solution().cloneGraph2(root);
    
}

  
}
