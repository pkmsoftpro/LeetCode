package LeetcodePatterns.find_duplicate_287;

public class Visited {
  
  public static int findDuplicate(int[] nums) {
    int len = nums.length;
    for (int num : nums) {
        int idx = Math.abs(num);
        if (nums[idx] < 0) {
            return idx;
        }
        nums[idx] = -nums[idx];
    }

    return len;
}
  
  public static void main(String[] args) {
    int[] nums = {1,3,4,2,2};
    System.out.println(findDuplicate(nums));
  }
}