package LeetcodePatterns.find_duplicate_287;

public class Solution {
  
  public static int findDuplicate(int[] nums) {
    int len = nums.length;
    for (int i = 0; i < len; ) {
        int n = nums[i];
        if (n == i + 1) {
            i++;
        } else if (n == nums[n - 1]) {
            return n;
        } else {
            nums[i] = nums[n - 1];
            nums[n - 1] = n;
        }
    }

    return 0;
}
  public static void main(String[] args) {
    int[] nums = {1,3,4,2,2};
    System.out.println(findDuplicate(nums));
  }
}
