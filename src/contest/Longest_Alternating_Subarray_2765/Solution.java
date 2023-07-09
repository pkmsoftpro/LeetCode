package contest.Longest_Alternating_Subarray_2765;

public class Solution {

  public static void main(String[] args) {
    int[] nums = {14, 30, 29, 49, 3, 23, 44, 21, 26, 52};
    // {13,14,15,14}; //--3
    // {1,2,2,1,2,3,6,2};--2 [2873 / 2879]
    // {6,12,2,3,8,9,10,10,2,1}; --2
    // {14,30,29,49,3,23,44,21,26,52}; -- -1
    // {23,24,23,24,25,24,25,24,25}; --6
    // {21,9,5};
    // {21,9,5}; -- -1
    // {4,5,6}; --2
    // {2,3,4,3,4};--4
    // {31,32,31,32,33}; --4
    int num = new Solution().alternatingSubarray(nums);
    System.out.println(num);
  }

  public int alternatingSubarray1(int[] nums) {
    int ans = -1, val = 0;
    for (int i = 1; i < nums.length; ++i) {
      if (val > 0 && (nums[i] - nums[i - 1]) * (nums[i - 1] - nums[i - 2]) == -1)
        ++val;
      else if (i > 0 && nums[i] - nums[i - 1] == 1)
        val = 2;
      else
        val = 0;
      if (val > 0)
        ans = Math.max(ans, val);
    }
    return ans;
  }

  public int alternatingSubarray(int[] nums) {

    int preMinusOne = 0, currentMinusOne = 0, currentAltSeqLength = 0, max = -1;
    for (int i = nums.length - 2; i >= 0; i--)
      if (Math.abs(nums[i + 1] - nums[i]) == 1) {
        currentMinusOne = nums[i + 1] - nums[i];
        if (preMinusOne == -1 && currentMinusOne != preMinusOne && currentMinusOne == 1
            || (preMinusOne == 0 && currentMinusOne == 1)) {
          currentAltSeqLength += 2;
          max = Math.max(max, currentAltSeqLength);
        } 
        else if (preMinusOne == 0 && currentMinusOne == -1)
          currentAltSeqLength += 1;
        else if (preMinusOne == currentMinusOne)
          currentAltSeqLength = currentMinusOne == 1 ? 2 : 0;

        preMinusOne = currentMinusOne;
      } 
      else
        currentAltSeqLength = preMinusOne = 0;

    return max;
  }
}
