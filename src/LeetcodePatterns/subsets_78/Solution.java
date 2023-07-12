package LeetcodePatterns.subsets_78;

import java.util.LinkedList;
import java.util.List;

import util.Print;

public class Solution {

  public static void main(String[] args) {
    int[] nums = {1,2,3,4};
    
    List<List<Integer>> list = new Solution().subsets(nums);
    
    for(@SuppressWarnings("rawtypes") List intList : list) {
      System.out.print("[");
      Print.printList(intList); 
      System.out.print("],");
    }
  }
  
  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> result = new LinkedList<List<Integer>>();
    backtrack(result, nums, 0, new LinkedList<>());
    return result;
  }
  
  public void backtrack(List<List<Integer>> result, int[] nums, int first, List<Integer> current) {
    result.add(new LinkedList<>(current));
    
    // we iterate over the indexes i from 'first' to the length
    //of the entire sequence 'nums'
    for (int i = first; i < nums.length; i++) {
        current.add(nums[i]);

        // generate all other subsets for the current subset.
        // increasing the position by one to avoid duplicates in 'result'
        backtrack(result, nums, i + 1, current);

        // BACKTRACK.
        current.remove(current.size()-1);
    }
  }
}
