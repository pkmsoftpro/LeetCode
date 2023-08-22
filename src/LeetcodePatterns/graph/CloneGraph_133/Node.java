package LeetcodePatterns.graph.CloneGraph_133;

import java.util.ArrayList;
import java.util.List;

public class Node {
  public int val;
  public List<Node> neighbors;
  public Node() {
      val = 0;
      neighbors = new ArrayList<Node>();
  }
  public Node(int _val) {
      val = _val;
      neighbors = new ArrayList<Node>();
  }
  public Node(int _val, List<Node> _neighbors) {
      val = _val;
      neighbors = _neighbors;
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(this.val + ",");
    for(Node nod : this.neighbors) {
      sb.append(nod.val + ",");
    }
    sb.deleteCharAt(sb.length() - 1);
    return sb.toString();
  }
}
