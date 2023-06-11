package graph.rotting_oranges_994;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
  
  public int orangesRotting(int[][] grid) {
    
    Queue<int[]> queue = new LinkedList<int[]>();
    int goodOranges = 0;
    int cycle = -1;
    int len = grid.length;
    int wid = grid[0].length;
    int emptyCells = 0;
    
    int[] x = {0,1,0,-1};
    int[] y = {1,0,-1,0};
    
    for(int i=0; i<len; i++)
      for(int j=0; j<wid; j++)
        if(grid[i][j]==2)
          queue.add(new int[] {i,j});
        else if(grid[i][j]==1)
            goodOranges++;
        else emptyCells++;
    
    if(emptyCells==len*wid) return 0;
    
    while(!queue.isEmpty()) {
      int size = queue.size();
      
      for(int m=0; m<size; m++) {
        int[] rc = queue.poll();
        for(int i=0; i<4; i++) {
          int r = rc[0] + x[i];
          int c = rc[1] + y[i];
          
          if(r>=0 && c>=0 && r<len && c<wid && grid[r][c]==1) {
            goodOranges--;
            grid[r][c]=2;
            queue.add(new int[] {r,c});
          }
        }
      }
      cycle++;
    }
    
    return goodOranges==0 ? cycle : -1;
  }
  
  public static void main(String[] args) {
    int[][] grid = {{2,1,1},{0,1,1},{1,0,1}};
      //{{2,1,1},{1,1,0},{0,1,1}};
    int val = new Solution().orangesRotting(grid);
    System.out.println(val);
  }
}

