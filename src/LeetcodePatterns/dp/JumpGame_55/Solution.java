package LeetcodePatterns.dp.JumpGame_55;

//https://leetcode.com/problems/jump-game/solutions/20917/linear-and-simple-saddlebackvariant-in-c/

public class Solution {
  
  public static void main(String[] args) {
    int[] nums = {2,3,1,1,4};
    //  1,0,1,0
    boolean can = new Solution().canJump(nums, nums.length);
    System.out.println(can);
  }

  
  
  private boolean canJump(int[] nums, int n) {
    int i=0; 
    for(int reach=0; i<n && i<=reach; i++) {
      reach = Math.max(i+nums[i], reach);
      if(reach>=n) return true;
    }
    return i==n;
  }

  
  /*public boolean canJump(int[] nums, boolean[] dp) {
    if(nums[0]==0 && nums.length>1) return false;
    else if(nums[0]==0) return true;
    if(nums.length==1 && nums[0]>0) return true;
    
    dp[0] = true;
    for(int i=0; i<nums.length; i++) {
      if(!dp[i]) continue;
      int num = nums[i];
      for(int j=1; j<=num && i+j<nums.length; j++) {
        dp[i+j] = true;
        if(dp[nums.length-1]) return true;
      }
    }
    return dp[nums.length-1];
  }*/
}
