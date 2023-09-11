package LeetcodePatterns.permutations_46;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import util.PrintJavaFunction;

/*
 * take the element one by one from the array nums = [ ,2,3]
 * 
 * create a Queue and load the first element Q=[nums[0]] -> [1]
 * 
 * loop on the remaining part of the array: for( i=1 to length-1) -> int curr = nums[i] -> [2]
 * 
 * loop until the size of queue, take the element from queue, numQ = poll(q) [1]
 * 
 * put curr in all the positions of numQ, front->[2,1], back->[1,2]. Add all these combinations to queue.
 * 
 *              [1]
 *              /   \
 *             /     \
 *           [2,1]   [1,2]            ==> curr:2
 *             /       \
 *            /         \
 *     [3,2,1]         [3,1,2]        ==> curr:3
 *       [2,3,1]         [1,3,2]
 *         [2,1,3]         [1,2,3]
 */

public class BFS {

  public static void main(String[] args) {
    int[] nums = {1,2,3,4};
    List<List<Integer>> lists = new BFS().permute(nums);
    
    for(List intList : lists) {
      System.out.print("[");
      PrintJavaFunction.printList(intList); 
      System.out.print("],");
    }
  }
  
  public List<List<Integer>> permute(int[] nums) {
    Queue<List<Integer>> queue = new LinkedList<List<Integer>>();
    queue.add(Arrays.asList(nums[0]));
    
    for(int i=1; i<nums.length; i++) {
      int curr = nums[i]; //move curr in all positions of currentNumQ
      
      int size = queue.size();
      
      for(int j=0; j<size; j++) {
        List<Integer> currentNumQ = queue.poll();
        int numqsize = currentNumQ.size();
        int currPointer = 0; // increment this to put curr in all indexes of currentNumQ
        int currentnumqPointer = 0;  // increment this otherwise
        for(int n=0; n<=numqsize; n++) {
          currentnumqPointer = 0;
          LinkedList<Integer> load = new LinkedList<Integer>();
          for(int m=0; m<=numqsize; m++) {
            // insert curr at currPointer index, otherwise insert the mth element of  currentNumQ
            if(currPointer==m) {
              load.add(curr);
            }
            else {
              load.add(currentNumQ.get(currentnumqPointer));
              currentnumqPointer++;
            }
          }
          currPointer++; // put curr in all locations
                         // put [1] in all indexs of [2,3]
                         // will generate -> front:[1,2,3], middle:[2,1,3], back:[2,3,1]
          queue.add(load);
        }
      }
    }
    return (List)queue;
  }
}
