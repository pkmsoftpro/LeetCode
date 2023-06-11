package graph.shortest_path_1091;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
  public static void main(String[] args) {
    int[][] grid = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};

    /*{{0,0,1,0,0,0,0},
    {0,1,0,0,0,0,1},
    {0,0,1,0,1,0,0},
    {0,0,0,1,1,1,0},
    {1,0,0,1,1,0,0},
    {1,1,1,1,1,0,1},
    {0,0,1,0,0,0,0}};*/

    //{{0,0,0},{0,1,0},{0,0,0}};
    //{{0,0,0},{1,0,0},{1,1,0}};
    int retVal = new Solution().shortestPathBinaryMatrix(grid);
    System.out.println(retVal);
  }

  public int shortestPathBinaryMatrix(int[][] grid) {

    if (grid[0][0] == 1)
      return -1;
    if (grid.length == 1 && grid[0].length == 1)
      return grid[0][0] == 0 ? 1 : -1;
    int[][] dirs = {{1, 1}, {1, -1}, {-1, 1}, {-1, -1}, {1, 0}, {0, 1}, {0, -1}, {-1, 0}};
    int len = grid.length;
    int wid = grid[0].length;

    for (int i = 0; i < grid.length; i++)
      for (int j = 0; j < grid[0].length; j++)
        if (grid[i][j] == 0)
          grid[i][j] = Integer.MAX_VALUE;
        else
          grid[i][j] = -1;

    grid[0][0] = 0;

    Queue<int[]> queue = new LinkedList<int[]>();
    queue.add(new int[] {0, 0});

    while (!queue.isEmpty()) {
      int size = queue.size();

      while (size-- > 0) {
        int[] curr = queue.poll();

        for (int[] dir : dirs) {
          int r = curr[0] + dir[0];
          int c = curr[1] + dir[1];

          if (r >= 0 && c >= 0 && r < grid.length && c < grid[0].length && grid[r][c] != -1
              && grid[r][c] > grid[curr[0]][curr[1]] + 1) {
            grid[r][c] = grid[curr[0]][curr[1]] + 1;
            queue.add(new int[] {r, c});
          }
        }
      }
    }

    return (grid[len - 1][wid - 1] == Integer.MAX_VALUE || grid[len - 1][wid - 1] == -1) ? -1
        : grid[len - 1][wid - 1] + 1;
  }
}
