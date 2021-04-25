package arraysandstrings.missingnumber;

import java.util.HashSet;
import java.util.Set;

public class Solution {

  public static void main(String[] args) {
      int[] nums = {75,67,74,0,69,73,72,71,71};
    System.out.println(new Solution().missingNumber(nums));
  }

    public int missingNumber(int[] nums) {
        Set<Integer> numSet = new HashSet<Integer>();
        for (int num : nums) numSet.add(num);

        int expectedNumCount = nums.length + 1;
        for (int number = 0; number < expectedNumCount; number++) {
            if (!numSet.contains(number)) {
                return number;
            }
        }
        return -1;
    }
}
