package zeroonematrix_542;
/*
  https://leetcode.com/problems/01-matrix/discuss/101021/Java-Solution-BFS
  */
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
  
  public static void main(String[] args) {
    int[][] matrix = 
      { {0,0,0},
        {0,1,0},
        {1,1,1} };
    matrix = new Solution().updateMatrix(matrix);
    System.out.println();
  }
  public int[][] updateMatrix(int[][] matrix) {
    Queue<int[]> q = new LinkedList<int[]>();
    for(int i=0; i<matrix.length; i++) {
      for(int j=0; j<matrix[0].length; j++) {
        if(matrix[i][j]==0) q.add(new int[]{i,j});
        else matrix[i][j] = Integer.MAX_VALUE;
      }
    }
    int[][] dirs = {{-1,0}, {0,-1}, {1,0}, {0,1}}; 
    while(!q.isEmpty()) {
      int[] ele = q.poll();
      for(int[] dir : dirs) {
        int x = dir[0]+ele[0];
        int y = dir[1]+ele[1];
        if(x<matrix.length && x>=0 && y<matrix[0].length && y>=0 
            && matrix[x][y]!=0 && matrix[x][y]>matrix[ele[0]][ele[1]]+1) {
          matrix[x][y] = matrix[ele[0]][ele[1]]+1;
          q.add(new int[] {x, y});
        }
      }
      
    }
    return matrix;
  }
}
