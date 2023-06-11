package graph.kruskal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

//https://www.geeksforgeeks.org/kruskals-minimum-spanning-tree-algorithm-greedy-algo-2/

public class Kruskal {
  
  class Graph {
    int V;
    List<Edge> edges;
    List<Edge> mstEdges;
    
    public Graph(int v, List<Edge> edges) {
      this.V = v;
      this.edges = edges;
    }
    
    public int find(subset[] subsets, int i) {
      if(subsets[i].parent!=i)
        subsets[i].parent = find(subsets, subsets[i].parent);
      return subsets[i].parent;
    }
    
    public void union(subset[] subsets, int x, int y) {
      int xroot = find(subsets, x);
      int yroot = find(subsets, y);
      
      if(subsets[xroot].rank<subsets[yroot].rank)
        subsets[xroot].parent = subsets[yroot].parent;
      if(subsets[xroot].rank>subsets[yroot].rank)
        subsets[yroot].parent = subsets[xroot].parent;
      else {
        subsets[xroot].parent = subsets[yroot].parent;
        subsets[yroot].rank++;
      }
    }
    
    public List<Edge> generateMst(Graph graph) {
      int E = graph.edges.size();
      mstEdges = new ArrayList<Edge>(E);
      PriorityQueue<Edge> edgePQ = new PriorityQueue<Edge>(Comparator.comparingInt(o->o.weight));
      edgePQ.addAll(graph.edges);
      graph.mstEdges = new ArrayList<Edge>();
      
      subset[] subsets = new subset[V];
      for(int i=0; i<V; i++) {
        subsets[i] = new subset(i, 0);
      }
      
      while(graph.mstEdges.size() < V-1) {
        Edge edge = edgePQ.poll();
        int src = find(subsets, edge.src);
        int dest = find(subsets, edge.dest);
        
        if(src==dest) continue;
        graph.mstEdges.add(edge);
        union(subsets, edge.src, edge.dest); 
      }
     
      return graph.mstEdges;
    }
  }

  public static void main(String[] args) {
    
    Kruskal k = new Kruskal();
    
    int v = 4;
    List<Edge> graphEdges = new ArrayList<Edge>(
        Arrays.asList(new Edge(0, 1, 10), new Edge(0, 2, 6),
            new Edge(0, 3, 5), new Edge(1, 3, 15), new Edge(1, 2, 4),
            new Edge(2, 3, 4) )) ;
    
    Graph graph = k.new Graph(v, graphEdges);
    
    List<Edge> mstEdges = graph.generateMst(graph);
    
    k.printMSTEdges(mstEdges);
  } 

  public void printMSTEdges(List<Edge> mstEdges) {
    for(Edge edge : mstEdges) {
      System.out.println(edge.src + " " + edge.dest + " " + edge.weight);
    }
  }
}
