package LeetcodePatterns.combination_sum_39;

// https://leetcode.com/problems/subsets/solutions/27281/a-general-approach-to-backtracking-questions-in-java-subsets-permutations-combination-sum-palindrome-partitioning/

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import util.PrintJavaFunction;

public class Solution {
  
  public static void main(String[] args) {
    int[] candidates = {2,3,5};
    int target = 8;
    List<List<Integer>> lists = new Solution().combinationSum(candidates, target);

    for (@SuppressWarnings("rawtypes") List intList : lists) {
      System.out.print("[");
      PrintJavaFunction.printList(intList);
      System.out.print("],");
    }
  }

  public List<List<Integer>> combinationSum(int[] candidates, int target) {
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
      compute(nums, target-nums[i], lists, list, i);
      list.remove(list.size()-1);
    }
  }
}

