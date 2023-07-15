package LeetcodePatterns.combination_sum_3_216;

import java.util.LinkedList;
import java.util.List;

import util.Print;

public class Solution {
  
  public static void main(String[] args) {
    int k = 9;
    int n = 45;
    List<List<Integer>> lists = new Solution().combinationSum3(k, n);

    for (@SuppressWarnings("rawtypes") List intList : lists) {
      System.out.print("[");
      Print.printList(intList);
      System.out.print("],");
    }
  }

  public List<List<Integer>> combinationSum3(int k, int target) {
    List<List<Integer>> lists = new LinkedList<List<Integer>>();
    compute(k, target, lists, new LinkedList<Integer>(), 1);
    return lists;
  }
  
  public void compute(int k, int target, List<List<Integer>> lists, List<Integer> list, int start) {

    if(0==target && list.size()==k) {
      lists.add(new LinkedList<>(list));
      return;
    }
    for(int i=start; i<=9; ++i) {
      list.add(i);
      compute(k, target-i, lists, list, i+1);
      list.remove(list.size()-1);
    }
  }
}
