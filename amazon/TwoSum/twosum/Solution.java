package twosum;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();
        for(int i=0; i<nums.length; i++){
            int rem = target-nums[i];
            if(map.containsKey(rem))
                return new int[]{map.get(rem), i};
            else map.put(nums[i], i);
        }
        return null;
    }

  public static void main(String[] args) {
        int[] nums = {3,2,4};
        nums = new Solution().twoSum(nums, 6);
    System.out.println(nums[0] + "--" + nums[1]);
  }
}
