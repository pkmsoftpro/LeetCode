package LeetcodePatterns.bfsdfs.PacificAtlanticWaterFlow_417;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class pair {
  public boolean pac= false, atl=false;
  
  @Override
  public String toString() {
    return this.pac+ ":"+this.atl;
  }
}

public class Solution {

  int[] dirs = {0,1,0,-1,0};
  public static void main(String[] args) {
    int[][] heights = {{1,2,3,4},{12,13,14,5},{11,16,15,6},{10,9,8,7}};
      //{{1,2,3,4},{12,13,14,5},{11,16,15,6},{10,9,8,7}};
      //{{1,2,2,3,5},{3,2,3,4,4},{2,4,5,3,1},{6,7,1,4,5},{5,1,1,2,4}};
    System.out.println(new Solution().pacificAtlantic(heights));
  }
  
  public List<List<Integer>> pacificAtlantic(int[][] heights) {
    int x = heights.length;
    int y = heights[0].length;
    pair[][] pary = new pair[x][y];
    for(int i=0; i<x; i++) {
      for(int j=0; j<y; j++) {
        pary[i][j] = new pair();
        if(i==0 || j==0) {
          pary[i][j].pac = true;
        }
        if(i==x-1 || j==y-1) {
          pary[i][j].atl = true;
        }
      }
    }
    boolean[][] tracker = new boolean[x][y];
    List<List<Integer>> list = new ArrayList<List<Integer>>();
    
    for(int i=0; i<x; i++) 
      for(int j=0; j<y; j++) 
        if((pary[i][j].atl && pary[i][j].pac) || compute(heights, pary, tracker, i, j, i, j)) 
          list.add(Arrays.asList(i, j));
    
    return list;
  }
  
  public boolean compute(int[][] heights, pair[][] pary, boolean[][] tracker, int m, int n,
      int imove, int jmove) {
    if(imove==0 || jmove==0) {
      pary[m][n].pac = true;
    }
    if(imove==heights.length-1 || jmove==heights[0].length-1) {
      pary[m][n].atl = true;
    }
    if ((imove != m || jmove != n) && heights[imove][jmove] > heights[m][n])
      return false;
    for(int k=0; k<4; k++) {
      int x = dirs[k]+imove;
      int y = dirs[k+1]+jmove;
      if(x==m && y==n) continue;
      if(isvalid(heights, x, y) && !tracker[x][y] && heights[imove][jmove]>=heights[x][y]) {
        tracker[x][y] = true;
        compute(heights, pary, tracker, m, n, x, y);
        tracker[x][y] = false;
        if(pary[m][n].atl && pary[m][n].pac)
          return true;
      }
    }
    return false;
  }
  
  public boolean isvalid(int[][] heights, int i, int j) {
    if(i>=0 && j>=0 && i<heights.length && j<heights[0].length) {
      return true;
    }
    return false;
  }
}
