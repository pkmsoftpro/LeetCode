package LeetcodePatterns.dp.NumberLongestIncreasingSubsequence_673;

public class Solution2 {

  public static void main(String[] args) {
    int[] nums = {1,3,5,4,7};
    System.out.println(new Solution2().findNumberOfLIS(nums));
  }
  
  public int findNumberOfLIS(int[] nums) {
    int[] count = new int[nums.length + 1];
    recursion(nums, 0, Integer.MIN_VALUE, count, 0);
    // once we found counts for all the possible lengths, return the maximum length count
    for (int i = count.length - 1; i >= 0; i--) {
      if (count[i] > 0) return count[i];
    }
    return 0;
  }

  static void recursion(int[] nums, int i, int curMax, int[] count, int ans) {
  // exit condition also store the length count
    if (i >= nums.length) {
      count[ans] = count[ans] + 1;
      return;
    }
    // if your value is greater than prevoius value continue with ans++
    if (curMax < nums[i]) {
      recursion(nums, i + 1, nums[i], count, ans + 1);
    }
    //just continue with prevoius values
    recursion(nums, i + 1, curMax, count, ans);
  }
}
