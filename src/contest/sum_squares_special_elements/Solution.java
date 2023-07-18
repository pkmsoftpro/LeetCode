package contest.sum_squares_special_elements;

public class Solution {

  public static void main(String[] args) {
    int[] nums = {2,7,1,19,18,3};
    int num = new Solution().sumOfSquares(nums);
    System.out.println(num);
  }
  
  public int sumOfSquares(int[] nums) {
    int size = nums.length;
    int sum =0;
    for(int i=0; i<nums.length; i++) {
      if(size%(i+1)==0)
        sum = sum + nums[i]*nums[i];
    }
    return sum;
  }
}
