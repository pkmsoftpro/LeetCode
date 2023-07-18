package majority_elements_169;

public class Solution {
  
  public static void main(String[] args) {
    int[] nums = {1,2,3,4,5,6,7,8,9,10};
    int num = new Solution().majorityElement(nums);
    System.out.println(num);
  }
  
  
  public int majorityElement(int[] nums) {
    
    int major = nums[0], count = 1;
    
    for(int i=1; i<nums.length; i++) {
      if(count==0) {
        major = nums[i];
        count=1;
      } else if(major==nums[i]) {
        count++;
      } else {
        count--;
      }
    }
    return major;
  }
}
