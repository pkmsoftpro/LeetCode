package LeetcodePatterns.dp.LongestIncreasingSubsequence_300;
// https://www.geeksforgeeks.org/longest-monotonically-increasing-subsequence-size-n-log-n/
// https://leetcode.com/problems/longest-increasing-subsequence/solutions/74825/short-java-solution-using-dp-o-n-log-n/

import java.util.Arrays;


public class UsingBinSearch {
  
  public static void main(String[] args) {
    int[] arr = {10, 22, 9, 33, 21, 50, 41, 60};
    System.out.println(new UsingBinSearch().lengthOfLIS(arr));
  }
  
  public int lengthOfLIS(int[] nums) {
    int[] dp = new int[nums.length];
    int len = 0;

    for (int x : nums) {
      int i = Arrays.binarySearch(dp, 0, len, x);
      if (i < 0)
        i = -(i + 1);
      dp[i] = x;
      if (i == len)
        len++;
    }

    return len;
  }
}
