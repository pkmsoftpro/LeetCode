package samerowstones_947;

public class Solution {
  
  int[] parent;
  int count = 0;
  
  public static void main(String[] args) {
    int[][] stones = {{0,0},{0,1},{1,0},{1,2},{2,1},{2,2}};
    int[][] stones1 = {{0,0},{0,2},{1,1},{2,0},{2,2}};
    int[][] stones2 = {{0,1},{1,2},{1,3},{3,3},{2,3},{0,2}};
    int[][] stones3 = {{0,0},{3,0},{0,2},{3,2},{1,1},{2,1},{4,4}};
    System.out.println(new Solution().removeStones(stones));
  }

  public int removeStones(int[][] stones) {
    int len = stones.length;
    count = stones.length;
    parent = new int[len];
    for(int i=0; i<len; i++) {
      parent[i] = i;
    }
    for(int i=0; i<len; i++) {
      for(int j=i+1; j<len; j++) {
        if(stones[i][0]==stones[j][0] || stones[i][1]==stones[j][1]) {
          union(i,j);
        }
      }
    }
    return len-count;
  }

  public void union(int x, int y) {
    int rootx = find(x);
    int rooty = find(y);
    
    if(rootx==rooty) return;
    else {
      parent[rooty] = rootx;
      count--;
    } 
  }

  public int find(int x) {
    if(parent[x]==x)
      return x;
    return parent[x]=find(parent[x]);
  }
}
