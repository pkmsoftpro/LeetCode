package graph.kruskal;

public class subset {
  public int parent, rank;
  public subset(int parent, int rank) {this.parent = parent; this.rank=rank;}
  
  @Override
  public String toString() {
    return "parent:" + parent + " rank:" + rank;
  }
}
