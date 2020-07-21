/*
https://leetcode.com/problems/number-of-operations-to-make-network-connected/discuss/477677/Java-Union-Find-(count-components-and-extra-edges)

@lee215 https://leetcode.com/problems/number-of-operations-to-make-network-connected/discuss/477679/Python-Count-the-Connected-Networks

Explanation
We need at least n - 1 cables to connect all nodes (like a tree).
If connections.size() < n - 1, we can directly return -1.

One trick is that, if we have enough cables,
we don't need to worry about where we can get the cable from.

We only need to count the number of connected networks.
To connect two unconneccted networks, we need to set one cable.

The number of operations we need = the number of connected networks - 1


Complexity
Time O(connections)
Space O(n)
*/

package makeconnected_1319;

public class Soln {
  int[] parent;
  int repetedEdges;
  int islands;
  
  public static void main(String[] args) {
    int[][] con = {{0,1},{0,2},{0,3},{1,2},{1,3}};
    int[][] con1 = {{0,1},{0,2},{0,3},{1,2}};
    int[][] con2 = {{0,1},{0,2},{3,4},{2,3},{1,2}};
    System.out.println(new Soln().makeConnected(6, con));
  }

  public int makeConnected(int n, int[][] con) {
    parent = new int[n];
    
    for(int i=0; i<n; i++) parent[i] = i;
    for(int i=0; i<con.length; i++) {
      int x = find(con[i][0]);
      int y = find(con[i][1]);
      if(x==y) repetedEdges++;
      else parent[x] = y;
    }
    for(int i=0; i<n; i++) if(parent[i]==i) islands++;
    
    return (repetedEdges>=islands-1)? islands-1 : -1;
  }
  
  public int find(int x) {
    return parent[x]==x?x:(parent[x]=find(parent[x]));
  }
}
