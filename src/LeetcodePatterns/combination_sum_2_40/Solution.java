package LeetcodePatterns.combination_sum_2_40;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import util.Print;

public class Solution {
  
  public static void main(String[] args) {
    int[] candidates = {2,5,2,1,2};
    int target = 5;
    List<List<Integer>> lists = new Solution().combinationSum2(candidates, target);

    for (@SuppressWarnings("rawtypes") List intList : lists) {
      System.out.print("[");
      Print.printList(intList);
      System.out.print("],");
    }
  }

  public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    Arrays.sort(candidates);
    List<List<Integer>> lists = new LinkedList<List<Integer>>();
    compute(candidates, target, lists, new LinkedList<Integer>(), 0);
    return lists;
  }
  
  public void compute(int[] nums, int target, List<List<Integer>> lists, List<Integer> list, int start) {

    if(0==target) {
      lists.add(new LinkedList<>(list));
      return;
    } 
    for(int i=start; i<nums.length; ++i) {
      if (nums[i] > target) break;
      list.add(nums[i]);
      compute(nums, target-nums[i], lists, list, i+1);
      list.remove(list.size()-1);
      while(i+1<nums.length && nums[i]==nums[i+1])
        ++i;
    }
  }
}
