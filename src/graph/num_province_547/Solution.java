package graph.num_province_547;

class Solution {
  
  public int findCircleNum(int[][] isConnected) {
    int length = isConnected.length;
    int[] parent = new int[length];
    
    int[] rank = new int[length];
    
    for(int i=0; i<length; i++) {
      parent[i]= i;
    }
    
    for(int i=0; i<length; i++) 
      for(int j=i+1; j<isConnected[i].length; j++) 
        if(isConnected[i][j]==1) 
          union(i, j, parent, rank);
    
    int cnt = 0;
    for (int i = 0; i < parent.length; i++)
      if (parent[i] == i) 
          cnt++;
    
    return cnt;
  }
  
  public int findParent(int[] parent, int x) {
    if (parent[x] != x)
      parent[x] = findParent(parent, parent[x]);
    return parent[x];
  }
  
  public void union(int x, int y, int[] parent, int[] rank) {
    int rootx = findParent(parent, x);
    int rooty = findParent(parent, y);
    
    if(rank[rootx]>rank[rooty])
      parent[rooty] = rootx;
    else if(rank[rooty]>rank[rootx])
      parent[rootx] = rooty;
    else {
     parent[rootx] = rooty;
     rank[rootx]++;
    }
  }
  
  public static void main(String[] args) {
    int[][] isConnected = {{1,1,0,0,0,0,0,1,0,0,0,0,0,0,0},{1,1,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,1,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,1,0,1,1,0,0,0,0,0,0,0,0},{0,0,0,0,1,0,0,0,0,1,1,0,0,0,0},{0,0,0,1,0,1,0,0,0,0,1,0,0,0,0},{0,0,0,1,0,0,1,0,1,0,0,0,0,1,0},{1,0,0,0,0,0,0,1,1,0,0,0,0,0,0},{0,0,0,0,0,0,1,1,1,0,0,0,0,1,0},{0,0,0,0,1,0,0,0,0,1,0,1,0,0,1},{0,0,0,0,1,1,0,0,0,0,1,1,0,0,0},{0,0,0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,1,0,0},{0,0,0,0,0,0,1,0,1,0,0,0,0,1,0},{0,0,0,0,0,0,0,0,0,1,0,0,0,0,1}};
    //{{1,0,0,1},{0,1,1,0},{0,1,1,1},{1,0,1,1}}
    Solution sol = new Solution();
    System.out.println(sol.findCircleNum(isConnected));
  }
}
