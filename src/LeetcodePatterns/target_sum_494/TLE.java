package LeetcodePatterns.target_sum_494;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import util.Print;

/*
 * Memoization
 * 
 * Trhwoing time limit exception
 * int[] nums = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};
   int target = 1;
 */


public class TLE {
  
  char[] ch = {'+', '-'};
  
  public static void main(String[] args) {
    int[] nums = {1,1,3,4,5,6,7,8};
    int target = 36;
    int list = new TLE().findTargetSumWays(nums, target);
    
    System.out.println(list);
  }
  
  public int findTargetSumWays(int[] nums, int target) {
    List<String> list = new LinkedList<String>();
    compute(nums, target, list, "", 0, 0, new HashSet<>(), 0);
    Print.printList(list);
    return list.size();
  }
  
  public void compute(int[] nums, int target, List<String> list, String num, int sum, int count, Set<String> cache, int start) {
    
    if(sum==target && count==nums.length && !list.contains(num)) {
      list.add(num);
      return;
    }
    
    if(count>nums.length-1) 
      return;
    
    for(int i=start; i<nums.length; i++) {
      for(char ca : ch) {
        num += String.valueOf(ca);
        if(ca=='+')
          sum += nums[i];
        else sum -= nums[i];
        num += nums[i];
        count++;
        if(cache.contains(num))
          return;
        compute(nums, target, list, num, sum, count, cache, i+1);
        count--;
        if(ca=='+')
          sum-= nums[i];
        else sum += nums[i];
        num = num.substring(0, num.length()-2);
        if(cache.contains(num))
          return;
        cache.add(num);
      }
    }
  }
}
