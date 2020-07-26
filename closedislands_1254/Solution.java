
/*
 *  https://leetcode.com/problems/number-of-closed-islands/discuss/425150/JavaC%2B%2B-with-picture-Number-of-Enclaves
 */
class Solution {
 int max = 0;
 public int closedIsland(int[][] grid) {
    int islands = 0;
    for (int i = 0; i < grid.length; i++)
      for (int j = 0; j < grid[0].length; j++)
        if (i == 0 || j == 0 || i == grid.length - 1 || j == grid[0].length - 1)
          if (grid[i][j] == 0)
            floodFill(grid, i, j);
    for (int i = 1; i < grid.length - 1; i++)
      for (int j = 1; j < grid[0].length - 1; j++)
        if (grid[i][j] == 0) {
          floodFill(grid, i, j);
          islands++;
        }
    return islands;
  }

  public int floodFill(int[][] grid, int i, int j) {
    if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != 0)
      return 0;
    max = (grid[i][j] = 1) + floodFill(grid, i + 1, j) + floodFill(grid, i, j + 1)
        + floodFill(grid, i - 1, j) + floodFill(grid, i, j - 1);
    return max;
  }
}
