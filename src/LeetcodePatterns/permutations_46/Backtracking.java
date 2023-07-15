package LeetcodePatterns.permutations_46;

import java.util.LinkedList;
import java.util.List;

import util.Print;

public class Backtracking {

  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4};
    List<List<Integer>> lists = new Backtracking().permute(nums);

    for (List intList : lists) {
      System.out.print("[");
      Print.printList(intList);
      System.out.print("],");
    }
  }

  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> lists = new LinkedList<List<Integer>>();
    compute(lists, nums, new LinkedList<Integer>());
    return lists;
  }
  
  public void compute(List<List<Integer>> lists, int[] nums, List<Integer> list) {
    
    if(list.size()==nums.length) {
      lists.add(new LinkedList<>(list));
    } else {
      for(int i=0; i<nums.length; i++) {
        if(list.contains(nums[i])) continue;
        list.add(nums[i]);
        compute(lists, nums, list);
        list.remove(list.size()-1);
      }
    }
    
  }
}
