package farland_1162;

import java.util.LinkedList;
import java.util.Queue;

public class Sol2 {
  public int maxDistance(int[][] grid) {
    int retVal = 0;
    Queue<Integer> q = new LinkedList<Integer>();
    int[][] dir = {{0,1}, {1,0}, {-1,0}, {0,-1}};
    int N = grid.length;
    for (int i = 0; i < N; i++)
      for (int j = 0; j < N; j++) 
        if (grid[i][j] == 1) q.offer(i * N + j);
    if(q.isEmpty() || q.size()==N*N) return -1;
    while(!q.isEmpty()) {
      int m = q.size();
      for(int t=0; t<m; t++) {
        int num = q.poll();
        for(int i=0; i<4; i++) {
          int x = dir[i][0]+num/N, y= dir[i][1]+num%N;
          if(x<0 || x>=N || y<0 || y>=N || grid[x][y]==1) continue;
          q.add(x*N+y);
          grid[x][y]=1;
        }
      }
      retVal++;
    }
    return retVal-1;
  }

  public static void main(String[] args) {
    int[][] grid0 = {{1, 0, 1}, {0, 0, 0}, {1, 0, 1}};
    int[][] grid1 = {{1,0,0},{0,0,0},{0,0,0}};
    int[][] grid = {{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1}};
    System.out.println(new Sol2().maxDistance(grid));
  }
}
