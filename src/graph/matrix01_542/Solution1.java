package graph.matrix01_542;

import java.util.LinkedList;
import java.util.Queue;

public class Solution1 {
  
  public int[][] updateMatrix(int[][] mat) {
    
    Queue<int[]> queue = new LinkedList<int[]>();
    for(int i=0; i<mat.length; i++)
      for(int j=0; j<mat[i].length; j++) {
        if(mat[i][j]==0) 
          queue.add(new int[] {i, j});
        else
          mat[i][j] = Integer.MAX_VALUE;
      }
    nearestZero(queue, mat);
    return mat;
  }
  
  public void nearestZero(Queue<int[]> queue, int[][] mat) {
    
    while(!queue.isEmpty()) {
      int[] rc = queue.poll();
      int[] dir = {0,1,0,-1,0};
      
      for(int i=0; i<4; i++) {
        int r = rc[0] + dir[i];
        int c = rc[1] + dir[i+1];
        
        if(r<0 || c<0 || r>=mat.length || c>=mat[0].length
            || mat[r][c]<=mat[rc[0]][rc[1]]+1) 
          continue;
        mat[r][c] = mat[rc[0]][rc[1]]+1;
        queue.add(new int[] {r,c});
      }
    }
    
  }
  
  public static void main(String[] args) {
    int[][] mat = {{1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,1,1,1,1,1,0,1,1,1,1,1,1},
        {1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,1,1,1,1,1,1,1,1,1,1,1,1}};
    
    mat = new Solution1().updateMatrix(mat);
    System.out.println(mat);
  }
}  