package arraysandstrings.rotateimage;

//https://leetcode.com/problems/rotate-image/discuss/1176068/Easy-Java-Solution-with-explanation

public class Solution {
  public void rotate(int[][] matrix) {
    int len = matrix.length;
    for (int i = 0; i < len / 2; i++) {
      for (int j = i; j < len/2; j++) {
        int x = j;
        int y = len - i-1;
        int temp = matrix[i][j];

        while (!(x == i && y == j)) {
          int ttemp = matrix[x][y];
          matrix[x][y] = temp;
          temp = ttemp;
          int x1 = x;
          x = y;
          y = len - x1-1;
        }
        matrix[x][y] = temp;
      }
    }
  }

  public static void main(String[] args) {
    int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    new Solution().rotate(matrix);
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}
