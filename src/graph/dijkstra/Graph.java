package graph.dijkstra;

import java.util.HashSet;
import java.util.Set;

public class Graph {
  public Set<Node> nodes = new HashSet<Node>();
  
  @Override
  public String toString() {
    
    StringBuilder value = new StringBuilder();
    
    for(Node node : nodes) {
      value.append(node.toString() + "--");
    }
    
    value.setLength(value.length()-2);
    return value.toString();
  }
}
