package graph.dijkstra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Node {
  
  public String name;
  public List<Node> shortestPath = new ArrayList<Node>();
  public Map<Node, Integer> adjMap = new HashMap<Node, Integer>();
  public Integer weight = Integer.MAX_VALUE;
  
  public Node(String name) {
    this.name = name;
  }
  
  public void addDest(Node node, Integer weight) {
    adjMap.put(node, weight);
  }
  
  @Override
  public String toString() {
    return this.name + ":" + weight;
  }
}
