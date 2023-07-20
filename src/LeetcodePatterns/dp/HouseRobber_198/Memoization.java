package LeetcodePatterns.dp.HouseRobber_198;

//https://www.geeksforgeeks.org/find-maximum-possible-stolen-value-houses/
//https://leetcode.com/problems/house-robber/solutions/156523/from-good-to-great-how-to-approach-most-of-dp-problems/

import java.util.Arrays;

public class Memoization {
  
  public static void main(String[] args) {
    int[] nums = {114,117,207,117,235,82,90,67,143,146,53,108,200,91,80,223,58,170,110,236,81,90,222,160,165,195,187,199,114,235,197,187,69,129,64,214,228,78,188,67,205,94,205,169,241,202,144,240};
    int num = new Memoization().rob(nums);
    System.out.println(num);
  }

  public int rob(int[] nums) {
    int[] memo = new int[nums.length+1];
    Arrays.fill(memo, -1);
    int num = compute(nums, nums.length-1, memo);
    return num;
  }
  
  public int compute(int[] nums, int n, int[] memo) {
    
    if(n<0) return 0;
    
    if(memo[n]>=0) return memo[n];
    
    int pick = nums[n] + compute(nums, n-2, memo);
    int nopick = compute(nums, n-1, memo);
    
    return memo[n] = Math.max(pick, nopick);
    
  }
}
