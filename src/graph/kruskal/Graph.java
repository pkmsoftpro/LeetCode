//package graph.kruskal;
//
//public class Graph {
//
//  public int V, E;
//  
//  class Edge {
//    public int src;
//    public int dest;
//  }
//  
//  Edge[] edges;
//  
//  public Graph(int v, int e) {
//    V = v;
//    E = e;
//    edges = new Edge[e];
//    
//    for(int i=0; i<e; i++) {
//      edges[i] = new Edge();
//    }
//  }
//  
//  class Subset {
//    public int parent;
//    public int rank;
//  }
//  
//  public int find(Subset[] subsets, int i) {
//    
//    if(subsets[i].parent!=i) {
//      subsets[i].parent = find(subsets, subsets[i].parent);
//    }
//    return subsets[i].parent;
//  }
//  
//  public void union(Subset[] subsets, int x, int y) {
//    int xroot = find(subsets, x);
//    int yroot = find(subsets, y);
//    
//    if(subsets[xroot].rank < subsets[yroot].rank) {
//      subsets[xroot].parent = subsets[yroot].parent;
//    } 
//    else if(subsets[xroot].rank > subsets[yroot].rank) {
//      subsets[yroot].parent = subsets[xroot].parent;
//    } else {
//      subsets[yroot].parent = subsets[xroot].parent;
//      subsets[xroot].rank = subsets[xroot].rank+1;
//    }
//  }
//  
//  public boolean detectCycle (Graph graph) {
//    
//    Subset[] subsets = new Subset[graph.V];
//    
//    for(int i=0; i<graph.V; i++) {
//      subsets[i] = new Subset();
//      subsets[i].parent = i;
//      subsets[i].rank=0;
//    }
//    
//    for(int i=0; i<graph.E; i++) {
//      int x = find(subsets, graph.edges[i].src);
//      int y = find(subsets, graph.edges[i].dest);
//      
//      if(x==y) return true;
//      graph.union(subsets, x, y);
//    }
//    return false;
//  }
//  
//  public static void main(String[] args) {
//    Graph graph = new Graph(3, 2);
//    
//    graph.edges[0].src = 0;
//    graph.edges[0].dest = 1;
//    
//    graph.edges[1].src = 1;
//    graph.edges[1].dest = 2;
//    
//
//    
//    System.out.println(graph.detectCycle(graph));
//  }
//}
