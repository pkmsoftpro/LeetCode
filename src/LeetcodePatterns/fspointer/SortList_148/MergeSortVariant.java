package LeetcodePatterns.fspointer.SortList_148;

import util.PrintJavaFunction;

public class MergeSortVariant {

  public static void main(String[] args) {
    int[] nums = {10,9,8,7,0,6,5,4,3,2,1};
      //{5,4,1,2,3,10,9,8,7,0};
    new MergeSortVariant().sort(nums);
    PrintJavaFunction.printArray(nums);
  }

  private void sort(int[] nums) {
    sortmerge(nums, 0, nums.length-1);
  }

  private void sortmerge(int[] nums, int lo, int hi) {
    if(lo<hi) {
      int mid = lo + (hi-lo)/2;
      sortmerge(nums, lo, mid);
      sortmerge(nums, mid+1, hi);
      merge(nums, lo, mid, hi);
    }
  }
  
  private void merge(int[] nums, int lo, int mid, int hi) {
    
    int acount = mid-lo+1;
    int bcount = hi - mid;
    
    int[] numsA = new int[acount];
    int[] numsB = new int[bcount];
    
    for(int i=0; i<acount; i++) {
      numsA[i] = nums[lo+i];
    }
    
    for(int j=0; j<bcount; j++) {
      numsB[j] = nums[mid+j+1];
    }
    
    int aCounter = 0;
    int bCounter = 0;
    
    while(aCounter<numsA.length || bCounter<numsB.length) {
      if(numsA.length==0 || aCounter>=numsA.length)
        nums[lo++] = numsB[bCounter++];
      else if(numsB.length==0 || bCounter>=numsB.length)
        nums[lo++] = numsA[aCounter++];
      else if (numsA[aCounter] <= numsB[bCounter])
        nums[lo++] = numsA[aCounter++];
      else 
        nums[lo++] = numsB[bCounter++];
    }
  }
}
