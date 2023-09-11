package LeetcodePatterns.fspointer.SortList_148;

import util.PrintJavaFunction;

public class Quicksort {

  public static void main(String[] args) {
    int[] nums = {10,9,8,7,0,6,5,4,3,2,1};
      //{5,4,1,2,3,10,9,8,7,0};
    new Quicksort().sort(nums);
    PrintJavaFunction.printArray(nums);
  }

  private void sort(int[] nums) {
    quicksort(nums, 0, nums.length-1);
  }

  private void quicksort(int[] nums, int lo, int hi) {
    if(lo<hi) {
      int pivot = partition(nums, lo, hi);
      quicksort(nums, lo, pivot-1);
      quicksort(nums, pivot+1, hi);
    }
  }

  private int partition(int[] nums, int lo, int hi) {
    int num = nums[hi];
    
    int i = lo-1;
    
    for(int j=lo; j<=hi; j++) {
      if(nums[j]<num) {
        i++;
        exchange(nums, i, j);
      }
    }
    exchange(nums, i+1, hi);
    
    return i+1;
  }
  
  private void exchange(int[] nums, int i, int j) {
    int x = nums[i];
    nums[i] = nums[j];
    nums[j] = x;
  }
}
