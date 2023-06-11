package graph.dijkstra.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Node {

  public String name;
  public Integer weight = Integer.MAX_VALUE;
  public List<Node> shortestPath = new ArrayList<Node>();
  public Map<Node, Integer> adjMap = new HashMap<Node, Integer>();
  
  public Node(String name) {
    this.name = name;
  }
  
  @Override
  public String toString() {
    
    return name + ":" + weight;
  }

  public void addDest(Node node, int weight) {
    this.adjMap.put(node, weight);
  }
}
