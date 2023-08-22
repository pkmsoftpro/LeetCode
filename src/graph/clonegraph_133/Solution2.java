package graph.clonegraph_133;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution2 {
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

    neighbour2 = new Solution2().cloneGraph(root);
    System.out.println(neighbour2);

  }
  
  private Node1 cloneGraph(Node1 root) {
    if(root==null) return null;
    Map<Node1, Node1> map = new HashMap<Node1, Node1>();
    Node1 newNode = new Node1(root.val, new ArrayList<Node1>());
    Stack<Node1> stack = new Stack<Node1>();
    stack.push(root);
    map.put(root, newNode);
    while(!stack.isEmpty()) {
      Node1 oldNode = stack.pop();
      for(Node1 node : oldNode.neighbors) {
        //map.computeIfAbsent(node, k -> new Node1(node.val, new ArrayList<Node1>()));
        if(!map.containsKey(node)) {
          stack.push(node);
          map.put(node, new Node1(node.val, new ArrayList<Node1>()));
        }
        map.get(node).neighbors.add(map.get(oldNode));
      }
    }
    return newNode;
  }

  private Node1 cloneGraph2(Node1 root) {
    Node1[] visited = new Node1[101];
    return clone(root, visited);
  }

  public Node1 clone(Node1 root, Node1[] visited) {
    if (root == null)
      return null;
    if (visited[root.val] != null) {
      return visited[root.val];
    }
    Node1 newNode = new Node1(root.val, new ArrayList<Node1>());
    visited[root.val] = newNode;
    for (Node1 node : root.neighbors) {
      newNode.neighbors.add(clone(node, visited));
    }
    return newNode;
  }
}
