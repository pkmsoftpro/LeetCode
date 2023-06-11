package graph.shortest_path_1091;

public class Solution1 {
  
  int[][] dirs = {{1,1},{1,-1},{-1,1},{-1,-1},{1,0},{0,1},{0,-1},{-1,0}};
  int dist = Integer.MAX_VALUE;

  boolean[][] visited;
  
  public int shortestPathBinaryMatrix(int[][] grid) {
    if(grid[0][0]==1) return -1;
    if(grid.length==1 && grid[0].length==1) return grid[0][0]==0?1:-1;
    visited = new boolean[grid.length][grid[0].length];
    int retVal = shortestPath(grid, visited, new int[] {0,0}, 0);
    return retVal;
  }
  
  public int shortestPath(int[][] grid, boolean[][] visited, int[] curr, int sum) {
    
    for(int[] rc : dirs) {
      int r = rc[0] + curr[0];
      int c = rc[1] + curr[1];
      
      if (r >= 0 && c >= 0 && r < grid.length && c < grid[0].length && grid[r][c] == 0
          && !visited[r][c]) {
        sum = sum+1;
        if(r==grid.length-1 && c==grid[0].length-1) {
          dist = Math.min(dist, sum);
          visited[r][c] = false;
        }
        visited[r][c] = true;
        shortestPath(grid, visited, new int[] {r,c}, sum);
        sum = sum-1;
        visited[r][c] = false;
      }
    }
    return dist==Integer.MAX_VALUE?-1:dist+1;
  }
  
  public static void main(String[] args) {
    int[][] grid = {{0,0,1,0,0,0,0},
                    {0,1,0,0,0,0,1},
                    {0,0,1,0,1,0,0},
                    {0,0,0,1,1,1,0},
                    {1,0,0,1,1,0,0},
                    {1,1,1,1,1,0,1},
                    {0,0,1,0,0,0,0}};
    
      //{{0,0,0},{0,1,0},{0,0,0}};
      //{{0,0,0},{1,0,0},{1,1,0}};
    int retVal = new Solution1().shortestPathBinaryMatrix(grid);
    System.out.println(retVal);
  }
}
