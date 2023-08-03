package LeetcodePatterns.dp.LongestIncreasingSubsequence_300;

// https://leetcode.com/problems/longest-increasing-subsequence/discuss/1326552/optimization-from-brute-force-to-dynamic-programming-explained/

public class One_Recursive {

  public static void main(String[] args) {
    int[] arr = {10, 22, 9, 33, 21, 50, 41, 60};
    System.out.println(new One_Recursive().lengthOfLIS(arr));
  }

  public int lengthOfLIS(int[] nums) {
    return solve(nums, 0, Integer.MIN_VALUE);
  }

  public int solve(int[] nums, int i, int prev) {
    if (i >= nums.length)
      return 0; // cant pick any more elements
    int take = 0, dontTake = 0;
    dontTake = solve(nums, i + 1, prev); // try skipping the current element
    if (nums[i] > prev)
      take = 1 + solve(nums, i + 1, nums[i]); // or pick it if it is greater than previous picked
                                              // element
    return Math.max(take, dontTake); // return whichever choice gives max LIS_gfg
  }
}
