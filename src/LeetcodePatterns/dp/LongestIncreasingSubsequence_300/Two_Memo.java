package LeetcodePatterns.dp.LongestIncreasingSubsequence_300;

// https://leetcode.com/problems/longest-increasing-subsequence/solutions/1326552/optimization-from-brute-force-to-dynamic-programming-explained/

import java.util.Arrays;

public class Two_Memo {

  int[] dp;
  public static void main(String[] args) {
    int[] arr = {4,10,4,3,8,9};
    System.out.println(new Two_Memo().lengthOfLIS(arr));
  }

  public int lengthOfLIS(int[] nums) {
    dp = new int[nums.length+1];
    Arrays.fill(dp, -1);
    return solve(nums, 0, -1);
  }

  public int solve(int[] nums, int i, int prev) {
    if (i >= nums.length)
      return 0; // cant pick any more elements
    if(dp[prev+1] !=-1) return dp[prev+1];
    int take = 0, dontTake = 0;
    dontTake = solve(nums, i + 1, prev); // try skipping the current element
    if (prev==-1 || nums[i] > nums[prev])
      take = 1 + solve(nums, i + 1, i); // or pick it if it is greater than previous picked
                                              // element
    return dp[prev+1] = Math.max(take, dontTake); // return whichever choice gives max LIS_gfg
  }
}

