package graph.kahn_topological;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Graph {
  int vertices;
  List<List<Integer>> adj;
  int[] indegree;
  List<Integer> results;
  
  public Graph(int v) {
    vertices = v;
    adj = new ArrayList<List<Integer>>();
    indegree = new int[v];
    results = new ArrayList<Integer>();
    
    for(int i=0; i<v; i++) {
      adj.add(new ArrayList<Integer>());
    }
  }
  
  public void addEdge(int src, int dest) {
    adj.get(src).add(dest);
    indegree[dest]++;
  }
  
  public void topologicalSort(Graph g) {
    Deque<Integer> queue = new LinkedList<Integer>();
    for(int i=0; i<vertices; i++) {
      if(indegree[i]==0) queue.add(i);
    }
    int loopCounter = 0;
    while(!queue.isEmpty()) {
      int node = queue.poll();
      results.add(node);
      for(Integer i : adj.get(node)) {
        int m = --indegree[i];
        if(m==0) queue.addLast(i);
      }
      loopCounter++;
    }
    
    if (loopCounter != vertices)
      System.out.println("contains loop");
    else {
      System.out.println("Topological Kahn sort:");
      results.stream().forEach(System.out::println);
    }
  }
  
  public static void main(String args[])
  {
      // Create a graph given in the above diagram
      Graph g = new Graph(8);
      g.addEdge(5, 2);
      g.addEdge(0, 5);
      g.addEdge(4, 0);
      g.addEdge(4, 1);
      g.addEdge(2, 3);
      g.addEdge(3, 1);

      g.topologicalSort(g);
      
  }
}
