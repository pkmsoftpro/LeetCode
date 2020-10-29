/*
michaelz
https://leetcode.com/problems/shortest-path-in-binary-matrix/discuss/312706/JAVA-BFS
*/

package shortestpathinbinmatrix_1091;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
  

  public static void main(String[] args) {
    int[][] grid = {{0,0,0},{1,1,0},{1,1,0}};
    //int[][] grid = {{0,1},{1,0}};
    //int[][] grid = {{0,1,0,0,1,1,0},{1,0,0,0,0,0,0},{1,0,0,1,1,1,1},{0,1,0,0,0,0,0},{1,0,0,0,0,0,1},{1,0,0,1,0,0,0},{1,0,1,0,0,1,0}};
    //int[][] grid = {{0,0,0,0,1,1},{0,1,0,0,1,0},{1,1,0,1,0,0},{0,1,0,0,1,1},{0,1,0,0,0,1},{0,0,1,0,0,0}};
    //int[][] grid = {{0,0,1,0,0,0,0},{0,1,0,0,0,0,1},{0,0,1,0,1,0,0},{0,0,0,1,1,1,0},{1,0,0,1,1,0,0},
    //                {1,1,1,1,1,0,1},{0,0,1,0,0,0,0}};
    System.out.println(new Solution().shortestPathBinaryMatrix(grid));
  }

  public int shortestPathBinaryMatrix(int[][] grid) {
    int N = grid.length;
    int[][] dirs = {{1,0},{1,-1},{1,1},{0,1},{0,-1},{-1,0},{-1,1},{-1,-1}};
    if(grid[0][0]!=1) grid[0][0] = 2; else return -1;
    Queue<int[]> q = new LinkedList<>();
    q.add(new int[] {0,1});
    while(!q.isEmpty()) {
      int[] cur = q.poll();
      if(cur[0]==N*N-1) return cur[1];
      for(int i=0; i<8; i++) {
        int nx = cur[0]/N+dirs[i][0], ny = cur[0]%N+dirs[i][1];
        if(nx<0 || nx>=N || ny<0 || ny>=N || grid[nx][ny]!=0) continue;
        q.offer(new int[] {nx*N+ny, cur[1]+1});
        grid[nx][ny] = 2;
      }
    }
    return -1;
  }
}
