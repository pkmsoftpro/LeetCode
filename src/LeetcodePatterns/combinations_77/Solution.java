package LeetcodePatterns.combinations_77;

// https://leetcode.com/problems/subsets/solutions/27281/a-general-approach-to-backtracking-questions-in-java-subsets-permutations-combination-sum-palindrome-partitioning/

import java.util.LinkedList;
import java.util.List;

import util.PrintJavaFunction;

public class Solution {
  
  public static void main(String[] args) {
    int n =4;
    int k=2;
    List<List<Integer>> lists = new Solution().combine(n, k);

    for (List intList : lists) {
      System.out.print("[");
      PrintJavaFunction.printList(intList);
      System.out.print("],");
    }
  }

  public List<List<Integer>> combine(int n, int k) {
    List<List<Integer>> lists = new LinkedList<List<Integer>>();
    compute(n, k, lists, new LinkedList<Integer>(), 0);
    return lists;
  }
  
  public void compute(int n, int k, List<List<Integer>> lists, List<Integer> list, int start) {
    if(list.size()==k) {
      lists.add(new LinkedList<>(list));
    }
    for(int i=start; i<n; i++) {
      list.add(i+1);
      compute(n, k, lists, list, i+1);
      list.remove(list.size()-1);
    }
  }
}
