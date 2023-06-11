package graph.shortest_path_1091;

import java.util.LinkedList;
import java.util.Queue;

public class Solution2 {
  
  int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0},{1,1},{1,-1},{-1,1},{-1,-1}};
  int dist = Integer.MAX_VALUE;

  boolean[][] visited;
  
  public int shortestPathBinaryMatrix(int[][] grid) {
    if(grid[0][0]==1) return -1;
    visited = new boolean[grid.length][grid[0].length];
    
    Queue<int[]> queue = new LinkedList<int[]>();
    queue.add(new int[] {0,0});
    int retVal = shortestPath(grid, queue, 0);
    return retVal;
  }
  
  public int shortestPath(int[][] grid, Queue<int[]> queue, int sum) {
    
    while(!queue.isEmpty()) {
      int size = queue.size();
      
      for(int m=0; m<size; m++) {
        int[] curr = queue.poll();
        for(int[] rc : dirs) {
          int r = rc[0] + curr[0];
          int c = rc[1] + curr[1];
          
          if (r >= 0 && c >= 0 && r < grid.length && c < grid[0].length && grid[r][c] == 0 && !visited[r][c]) {
            sum = sum+1;
            if(r==grid.length-1 && c==grid[0].length-1) 
              dist = Math.min(dist, sum);
            queue.add(new int[] {r,c});
          }
          
        }
        visited[curr[0]][curr[1]] = true;
      }
    }
    
    return dist;
  }
  
  public static void main(String[] args) {
    int[][] grid = {{0,0,0},{1,1,0},{1,1,0}};
    int retVal = new Solution2().shortestPathBinaryMatrix(grid);
    System.out.println(retVal);
  }
}