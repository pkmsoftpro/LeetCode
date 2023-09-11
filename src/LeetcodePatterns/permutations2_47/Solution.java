package LeetcodePatterns.permutations2_47;

// https://leetcode.com/problems/subsets/solutions/27281/a-general-approach-to-backtracking-questions-in-java-subsets-permutations-combination-sum-palindrome-partitioning/

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import util.PrintJavaFunction;

public class Solution {

  public static void main(String[] args) {
    int[] nums = {1, 1, 2};
    List<List<Integer>> lists = new Solution().permuteUnique(nums);

    for (List intList : lists) {
      System.out.print("[");
      PrintJavaFunction.printList(intList);
      System.out.print("],");
    }
  }

  public List<List<Integer>> permuteUnique(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> lists = new LinkedList<List<Integer>>();
    compute(lists, nums, new LinkedList<Integer>(), new boolean[nums.length]);
    return lists;
  }
  
  public void compute(List<List<Integer>> lists, int[] nums, List<Integer> list, boolean[] used) {
    
    if(list.size()==nums.length) {
      lists.add(new LinkedList<>(list));
    } else {
      for(int i=0; i<nums.length; i++) {
        if(used[i] || i>0 && (nums[i]==nums[i-1] && !used[i-1])) continue;
        used[i] = true;
        list.add(nums[i]);
        compute(lists, nums, list, used);
        used[i] = false;
        list.remove(list.size()-1);
      }
    }
    
  }
}
