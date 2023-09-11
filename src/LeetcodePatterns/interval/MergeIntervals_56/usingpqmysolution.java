package LeetcodePatterns.interval.MergeIntervals_56;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

import util.PrintJavaFunction;

public class usingpqmysolution {

  public static void main(String[] args) {
    int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
    
    intervals = new usingpqmysolution().merge(intervals);
    
    for(int[] interval : intervals) {
      System.out.print("[");
      PrintJavaFunction.printArray(interval);
      System.out.print("]");
    }
  }
  
  public int[][] merge(int[][] intervals) {
    PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a,b)->Integer.compare(a[0], b[0]));
    for(int[] interval : intervals) {
      pq.add(interval);
    }
    List<int[]> result = new ArrayList<>();
    int[][] resArr = null;
    int i = 0;
    
    while(!pq.isEmpty()) {
      int[] nums1 = pq.poll();
      int[] nums2 = pq.poll();      
      if(nums2==null) {
        result.add(nums1);
        resArr = new int[result.size()][];
        for(int[] arr : result) {
          resArr[i++] = arr;
        }
        return resArr;
      }
      List<int[]> list = compute(nums1, nums2);

      if(list.size()==2) {
        result.add(list.get(0));
        pq.add(nums2);
      } else {
        //result.addAll(list);
        pq.add(list.get(0));
      }
    }
    return resArr;
  }
  
  public List<int[]> compute(int[] nums1, int[] nums2){
    List<int[]> list = new ArrayList<>();
    if(nums1[0]==nums2[0]) {
      int bigger = nums1[1]>nums2[1]?nums1[1]:nums2[1];
      list.add(new int[] {nums1[0], bigger});
    } else if(nums2[0]>nums1[0] && nums2[0]<=nums1[1]) {
      int bigger = nums1[1]>nums2[1]?nums1[1]:nums2[1];
      list.add(new int[] {nums1[0], bigger});
    } else {
      list.add(nums1);
      list.add(nums2);
    }
    return list;
  }
}
