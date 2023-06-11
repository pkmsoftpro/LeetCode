package graph.num_province_547;

class Solution1 {
  public int findCircleNum(int[][] M) {
      UF uf = new UF(M.length);
      
      for (int i = 0; i < M.length; i++) {
          for (int j = 0; j < M[0].length; j++) {
              if (M[i][j] == 1) {
                  uf.union(i, j);
              }
          }
      }
      
      return uf.count();
  }
  
  class UF{
      int[] parent;
      public UF(int n) {
          parent = new int[n];
          for (int i = 0; i < n; i++)
              parent[i] = i;
      }
      void union(int x, int y) {
          int rx = find(x);
          int ry = find(y);
          if (rx != ry) {
              parent[rx] = ry;
          }
      }
      int find(int x) {
          if (parent[x] == x) {
              return x;
          }
          return parent[x] = find(parent[x]); // path compression
      }
      int count() {
          // Count parent[x] = x
          int cnt = 0;
          for (int i = 0; i < parent.length; i++)
              if (parent[i] == i) {
                  cnt++;
              }
          return cnt;
      }
  }
  
  public static void main(String[] args) {
    int[][] isConnected = {{1,1,0,0,0,0,0,1,0,0,0,0,0,0,0},{1,1,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,1,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,1,0,1,1,0,0,0,0,0,0,0,0},{0,0,0,0,1,0,0,0,0,1,1,0,0,0,0},{0,0,0,1,0,1,0,0,0,0,1,0,0,0,0},{0,0,0,1,0,0,1,0,1,0,0,0,0,1,0},{1,0,0,0,0,0,0,1,1,0,0,0,0,0,0},{0,0,0,0,0,0,1,1,1,0,0,0,0,1,0},{0,0,0,0,1,0,0,0,0,1,0,1,0,0,1},{0,0,0,0,1,1,0,0,0,0,1,1,0,0,0},{0,0,0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,1,0,0},{0,0,0,0,0,0,1,0,1,0,0,0,0,1,0},{0,0,0,0,0,0,0,0,0,1,0,0,0,0,1}};
    Solution1 sol = new Solution1();
    System.out.println(sol.findCircleNum(isConnected));
  }
}
