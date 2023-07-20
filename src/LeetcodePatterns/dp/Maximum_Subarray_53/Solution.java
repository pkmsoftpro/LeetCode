package LeetcodePatterns.dp.Maximum_Subarray_53;

public class Solution {

  
  public static void main(String[] args) {
    int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
    int num = new Solution().maxSubArray(nums);
    System.out.println(num);
  }
  
  public int maxSubArray(int[] nums) {
    
    for(int i=1; i<nums.length; i++) {
      nums[i] = Math.max(nums[i], nums[i-1]+nums[i]);
      nums[0] = Math.max(nums[i], nums[0]);
    }
    
    return nums[0];
  }
}
