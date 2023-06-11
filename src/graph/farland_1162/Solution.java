package graph.farland_1162;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
  public int maxDistance(int[][] grid) {
    
    int len = grid.length;
    int width = grid[0].length;
    Queue<int[]> queue = new LinkedList<int[]>();
    
    int[] x = {0,1,0,-1};
    int[] y = {1,0,-1,0};
    
    for(int i=0; i<len; i++) 
      for(int j=0; j<width; j++) 
        if(grid[i][j]==1) 
          queue.add(new int[] {i, j});
    
    if(queue.size()==len*width) return -1;
    
    int dist = 0;
    
    while(!queue.isEmpty()) {
      int size = queue.size();
      
      for(int i=0; i<size; i++) {
        int[] curr = queue.poll();
        
        for(int m=0; m<4; m++) {
          int r = curr[0] + x[m];
          int c = curr[1] + y[m];
          if(r>=0 && c>=0 && r<len && c<width && grid[r][c]==0) {
            queue.add(new int[] {r,c});
            grid[r][c] = 1;
          }
        }
      }
      dist++;
    }
      
    return dist-1;
  }
  
  public static void main(String[] args) {
    int[][] mat = {{1,0,1},{0,0,0},{1,0,1}};
              
    int i = new Solution().maxDistance(mat);
    System.out.println(i);
  }
}