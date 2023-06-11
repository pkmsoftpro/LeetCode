package graph.kruskal;

public class Edge {
  public int src, dest, weight;
  public Edge(int src, int dest, int weight) {this.src=src;this.dest=dest;this.weight=weight;}
  
  @Override
  public String toString() {
    return "src:" + src + " dest:" + dest + " wt:" + weight;
  }
}
