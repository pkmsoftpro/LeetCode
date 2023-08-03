package LeetcodePatterns.dp.LongestIncreasingSubsequence_300;


// https://www.geeksforgeeks.org/longest-increasing-subsequence-dp-3/

import java.util.Arrays;

public class LIS_gfg {

  int max_ref = 1;

  public static void main(String[] args) {
    int[] arr = {1,0,3};
    int n = arr.length;
    System.out.println(new LIS_gfg().lis(arr, n));
  }

  public int _lis(int[] arr, int n) {

    if (n == 1)
      return 1;

    int res, max_ending_here = 1;

    for (int i = 1; i < n; i++) {
      res = _lis(arr, i);
      if (arr[i - 1] < arr[n - 1] && res + 1 > max_ending_here)
        max_ending_here = res + 1;
    }


    if (max_ref < max_ending_here)
      max_ref = max_ending_here;

    return max_ending_here;
  }

  public int lis(int[] arr, int n) {
    int[][] dp = new int[n + 1][n + 1];
    for (int[] row : dp)
      Arrays.fill(row, -1);
    _lis(arr, n);
    return max_ref;
  }

}

