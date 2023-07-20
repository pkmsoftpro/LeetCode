package LeetcodePatterns.target_sum_494;

import java.util.HashMap;
import java.util.Map;

public class Solution {

  char[] ch = {'+', '-'};

  public static void main(String[] args) {
    int[] nums = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
    int target = 1;
    int list = new Solution().findTargetSumWays(nums, target);

    System.out.println(list);
  }

  public int findTargetSumWays(int[] nums, int target) {

    return compute(nums, target, new HashMap<>(), 0, 0);
  }

  private int compute(int[] nums, int target, Map<String, Integer> map, int sum, int index) {

    String encoding = index + ":" + sum;

    if (map.containsKey(encoding)) {
      return map.get(encoding);
    }

    if (index == nums.length) {
      if (sum == target) {
        return 1;
      } else {
        return 0;
      }
    }

    if (index >= nums.length)
      return 0;

    int curr = nums[index];
    int add = compute(nums, target, map, sum + curr, index + 1);
    int diff = compute(nums, target, map, sum - curr, index + 1);


    map.put(index + ":" + sum, add + diff);
    return add + diff;

  }
}
