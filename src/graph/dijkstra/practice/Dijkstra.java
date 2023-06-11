package graph.dijkstra.practice;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Set;

public class Dijkstra {

  public static void main(String[] args) {
    Node nodeA = new Node("A");
    Node nodeB = new Node("B");
    Node nodeC = new Node("C");
    Node nodeD = new Node("D");
    Node nodeE = new Node("E");
    Node nodeF = new Node("F");
    
    nodeA.addDest(nodeB, 10);
    nodeA.addDest(nodeC, 15);
    nodeB.addDest(nodeD, 12);
    nodeB.addDest(nodeF, 15);
    nodeD.addDest(nodeF, 1);
    nodeD.addDest(nodeE, 2);
    nodeC.addDest(nodeE, 10);
    
    Graph graph = new Graph();
    graph.nodes.add(nodeA);
    graph.nodes.add(nodeB);
    graph.nodes.add(nodeC);
    graph.nodes.add(nodeD);
    graph.nodes.add(nodeE);
    graph.nodes.add(nodeF);
    
    graph = new Dijkstra().calculateShortestDistance(graph, nodeA);
    System.out.println(graph);
  }

  public Graph calculateShortestDistance(Graph graph, Node nodeA) {
    nodeA.weight=0;
    Set<Node> setteledNodes = new HashSet<Node>();
    PriorityQueue<Node> unsetteledNodes =
        new PriorityQueue<Node>(graph.nodes.size(), Comparator.comparingInt(o -> o.weight));
    unsetteledNodes.add(nodeA);
    while(!unsetteledNodes.isEmpty()) {
      Node leastWeightNode = unsetteledNodes.poll();
      unsetteledNodes.remove(leastWeightNode);
      for(Entry<Node, Integer> nodeMatrix : leastWeightNode.adjMap.entrySet()) {
        Node node = nodeMatrix.getKey();
        int weight = nodeMatrix.getValue();
        if(!setteledNodes.contains(node)) {
          unsetteledNodes.add(node);
          calculateShortestPath(node, weight, leastWeightNode);
        }
      }
      setteledNodes.add(leastWeightNode);
    }
    return graph;
  }

  public void calculateShortestPath(Node nodeEvaluation, int edgeWeight, Node sourceNode) {
    if(sourceNode.weight+edgeWeight<nodeEvaluation.weight) {
      nodeEvaluation.weight = sourceNode.weight+edgeWeight;
      nodeEvaluation.shortestPath.clear();
      nodeEvaluation.shortestPath.addAll(sourceNode.shortestPath);
      nodeEvaluation.shortestPath.add(nodeEvaluation);
    }
    
  }
}
