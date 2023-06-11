package graph.Redundant_Connection_684;

public class Solution {
  public static void main(String[] args) {
    int[][] isConnected = {{1,2},{1,3},{2,3}};
    Solution sol = new Solution();
    int[] m = sol.findRedundantConnection(isConnected);
    System.out.println(m);
  }
  
  public int[] findRedundantConnection(int[][] edges) {
    int[] parent = new int[edges.length];
    for(int i=0; i<edges.length; i++)
      parent[i] = i;
    
    for(int[] edge : edges) 
      if(!union(edge[0]-1, edge[1]-1, parent)) 
        return edge;
    
    return null;
  }
  
  public int find(int x, int[] parent) {
    if(parent[x]==x) return x;
    else return parent[x] = find(parent[x], parent);
  }

  public boolean union(int i, int j, int[] parent) {
    int rooti = find(i, parent);
    int rootj = find(j, parent);
    
    if(rooti==rootj) return false;
    if(rooti<rootj) parent[rooti] = rootj;
    else parent[rootj] = rooti;
    return true;
  }
}
