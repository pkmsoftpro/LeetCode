package LeetcodePatterns.dp.HouseRobber_198;

// https://leetcode.com/problems/house-robber/solutions/156523/from-good-to-great-how-to-approach-most-of-dp-problems/
// https://leetcode.com/problems/house-robber-ii/solutions/59921/9-lines-0ms-o-1-space-c-solution/

public class Dp {

  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4, 1, 1, 5};
    int num = new Dp().rob(nums);
    System.out.println(num);
  }

  public int rob1(int[] nums) {
    int[] memo = new int[nums.length + 1];
    memo[0] = 0;
    memo[1] = nums[0];
    for (int i = 2; i <= nums.length; i++) {
      memo[i] = Math.max(memo[i-1], memo[i-2] + nums[i-1]);   
    }
    return memo[nums.length];
  }
  
  public int rob(int[] nums) {
    int var1 = 0;
    int var2 = nums[0];
    for (int i = 2; i <= nums.length; i++) { 
      int temp = Math.max(var2, var1 + nums[i-1]); 
      var1 = var2;
      var2 = temp;
    }
    return var2;
  }
}
