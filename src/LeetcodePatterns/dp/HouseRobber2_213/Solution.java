package LeetcodePatterns.dp.HouseRobber2_213;

public class Solution {

  public static void main(String[] args) {
    int[] nums = {1,2,3,1};
    int num = new Solution().rob(nums);
    System.out.println(num);
  }
  
  public int rob(int[] nums) {
    if(nums.length==1) return nums[0];
    
    return Math.max(rob2(nums,0, nums.length-2), rob2(nums, 1, nums.length-1));
  }
  
  private int rob3(int[] num, int lo, int hi) {
    int include = 0, exclude = 0;
    for (int j = lo; j <= hi; j++) {
        int i = include, e = exclude;
        include = e + num[j];
        exclude = Math.max(e, i);
    }
    return Math.max(include, exclude);
  }
  
  public int rob2(int[] nums, int lo, int hi) {
    int pre = 0;
    int curr = 0;
    for (int i = lo; i <= hi; i++) { 
      int temp = Math.max(curr, pre + nums[i]); 
      pre = curr;
      curr = temp;
    }
    return curr;
  }
  
  public int rob2(int[] nums) {
    return rob2(nums, 0, nums.length-1);
  }

  public int rob1(int[] nums) {
    if(nums.length<2) return nums[0];
    if(nums.length<3) 
      return nums[0]>=nums[1]?nums[0]:nums[1];
    int max = 0;
    if (nums.length == 0)
      return 0;
    int[] memo = new int[nums.length + 1];
    memo[0] = 0;
    memo[1] = nums[0];
    for (int i = 2; i < nums.length; i++) {
      memo[i] = Math.max(memo[i-1], memo[i-2] + nums[i-1]);  
      max = Math.max(max, memo[i]);
    }
    memo[nums.length-1] = 0;
    memo[nums.length-2] = nums[nums.length-1];
    
    for(int i=nums.length-3; i>=0; i--) {
      memo[i] = Math.max(memo[i+1], nums[i+1]+memo[i+2]);
      max = Math.max(max, memo[i]);
    }
    
    return max;
  }
}
