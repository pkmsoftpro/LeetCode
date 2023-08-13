package LeetcodePatterns.dp.UniquePaths_62;

public class recursive {
  
  static int total = 0;
  public static void main(String[] args) {
    int m=3, n=7;
    new recursive().uniquePaths(0, 0, m, n);
    System.out.println(total);
  }

  public void uniquePaths(int i, int j, int m, int n) {
    if(i>=m || j>=n) return;
    if(i==m-1 && j==n-1) {
      total++;
    }
    uniquePaths(i+1, j, m, n);
    uniquePaths(i, j+1, m, n);
  }
}
