package LeetcodePatterns.permutations_46;

import java.util.ArrayList;
import java.util.List;

import util.Print;

public class BFS_BETTER {
  
  public static void main(String[] args) {
    int[] nums = {1,2,3,4,5,6,7,8,9,10,11,15,16,17,18,19,20};
    List<List<Integer>> lists = new BFS_BETTER().subsets(nums);
    
    for(List intList : lists) {
      System.out.print("[");
      Print.printList(intList); 
      System.out.print("],");
    }
  }
  
  
  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> output = new ArrayList();
    output.add(new ArrayList<Integer>());

    for (int num : nums) {
      List<List<Integer>> newSubsets = new ArrayList();
      for (List<Integer> curr : output) {
        newSubsets.add(new ArrayList<Integer>(curr) {{add(num);}});
      }
      for (List<Integer> curr : newSubsets) {
        output.add(curr);
      }
    }
    return output;
  }
}

