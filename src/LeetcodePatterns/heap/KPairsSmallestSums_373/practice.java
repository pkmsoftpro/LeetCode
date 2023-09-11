package LeetcodePatterns.heap.KPairsSmallestSums_373;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import util.PrintJavaFunction;

public class practice {
  
  public static void main(String[] args) {
    int[] nums1 = {1,7,11}, nums2 = {2,4,6};
    // nums1 = {1,7,11}, nums2 = {2,4,6};
    // nums1 = {1,7,11,16}, nums2 = {2,9,10,15};
    int k = 3;
    List list = new practice().kSmallestPairs(nums1, nums2, k);

    PrintJavaFunction.printList(list);
  }

  
  public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
    PriorityQueue<List<Integer>> pq = new PriorityQueue<List<Integer>>((a,b)->a.get(0)+a.get(1)-b.get(0)-b.get(1));
    List<List<Integer>> list = new ArrayList<List<Integer>>();
    
    for(int i=0; i<nums1.length; i++) {
      pq.add(Arrays.asList(nums1[i], nums2[0], 0));
    }
    while(k-->0 && !pq.isEmpty()) {
      List<Integer> nums = pq.poll();
      list.add(Arrays.asList(nums.get(0), nums.get(1)));
      if(nums.get(2)+1>=nums2.length) {
        continue;
      }
      pq.add(Arrays.asList( nums.get(0), nums2[nums.get(2)+1], nums.get(2)+1));
    }
    
    return list;
  }
  
}
