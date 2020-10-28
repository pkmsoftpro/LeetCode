package shortestpathinbinmatrix_1091;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
  
  int[][] dirs = {{0,1}, {1,1}, {1,0}, {-1,-1}, {-1,0}, {-1,1}, {0,-1}, {1,-1}};

  public static void main(String[] args) {
    //int[][] grid = {{0,0,0},{1,1,0},{1,1,1}};
    //int[][] grid = {{0,1},{1,0}};
    //int[][] grid = {{0,1,0,0,1,1,0},{1,0,0,0,0,0,0},{1,0,0,1,1,1,1},{0,1,0,0,0,0,0},{1,0,0,0,0,0,1},{1,0,0,1,0,0,0},{1,0,1,0,0,1,0}};
    //int[][] grid = {{0,0,0,0,1,1},{0,1,0,0,1,0},{1,1,0,1,0,0},{0,1,0,0,1,1},{0,1,0,0,0,1},{0,0,1,0,0,0}};
    int[][] grid = {{0,0,1,0,0,0,0},{0,1,0,0,0,0,1},{0,0,1,0,1,0,0},{0,0,0,1,1,1,0},{1,0,0,1,1,0,0},
                    {1,1,1,1,1,0,1},{0,0,1,0,0,0,0}};
    System.out.println(new Solution().shortestPathBinaryMatrix(grid));
  }
  
  
  public int shortestPathBinaryMatrix(int[][] grid) {
    boolean[][] visited = new boolean[grid.length][grid[0].length];
    if(grid[0][0]==0) grid[0][0]=1;
    else return -1;
    Queue<int[]> q= new LinkedList<>();
    q.add(new int[]{0,0});
    while(!q.isEmpty()) {
      int[] temp = q.poll();
      for(int[] dir : dirs) {
        int x = temp[0]+dir[0];
        int y = temp[1]+dir[1];
        if(valid(grid, x, y) && !visited[x][y]) {
          if(grid[x][y]==0) grid[x][y] = grid[temp[0]][temp[1]] + 1;
          else {
            grid[x][y] = Math.min(grid[x][y], grid[temp[0]][temp[1]]+1);
          }
          if(!visited[x][y])q.add(new int[]{x,y});
          visited[x][y] = true;
        }
      }
      visited[temp[0]][temp[1]] = true;
    }
    if(!visited[grid.length-1][grid[0].length-1]) return -1;
    return grid[grid.length-1][grid[0].length-1];
  }
  
  public boolean valid(int[][] grid, int x, int y) {
    if(x<0 || x>=grid.length || y<0 || y>=grid[0].length || grid[x][y]==1) return false;
    return true;
  }
}
