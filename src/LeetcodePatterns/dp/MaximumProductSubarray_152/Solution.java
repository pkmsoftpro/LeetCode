package LeetcodePatterns.dp.MaximumProductSubarray_152;

public class Solution {

  public static void main(String[] args) {
    int[] nums = {-1,-1,-3};
    // {-1,-1,-3};
    // {-2,0,-1};
    // {-2};
    // {2,3,-2,1,0,4,1,1,2};
    int num = new Solution().maxProduct(nums);
    System.out.println(num);
  }

  public int maxProduct(int[] nums) {
    
    int imax = nums[0], imin = nums[0];
    int best = nums[0];
    
    for(int i=1; i<nums.length; i++) {
      
      if(nums[i]<0) imax += (imin - (imin=imax));   // swap
      
      
      imax = Math.max(nums[i], nums[i]*imax);
      imin = Math.min(nums[i], nums[i]*imin);
        
      best = Math.max(imax, best);
    }
    return best;
  }
}
