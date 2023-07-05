package divideConquer.quicksort;


public class Solution {

  public static void main(String[] args) {
    int[] arr = {7,6,5,4,3,2,1}; //-- 2, 5
      //{3,4,8,4,5,6,1,2,3,9,6,5,7,0,4,3,1}; -- 7
    int k = 2;
    int i = new Solution().findKthLargest(arr, k);
    System.out.println(i);
  }

  
  public int findKthLargest(int[] nums, int k) {
    
    k = nums.length - k;
    int first = 0;
    int last = nums.length -1;
    
    while(true) {
      int pivot = partition(nums, first, last);
      
      if(pivot == k) {
        return nums[k];
      }
      
      if(pivot<k) {
        first = pivot+1;
      } 
      
      if(pivot>k) {
        last = pivot-1;
      }
    }
  }


  private int partition(int[] nums, int first, int last) {
    
    int pivot = first, fi = first+1, ls = last;
    
    while(fi<ls) {
      if(nums[pivot]<nums[fi] && nums[pivot]>=nums[ls]) {
        swap(nums, fi++, ls--);
      }
      while(fi<nums.length-1 && nums[pivot]>=nums[fi]) {
        fi++;
      }
      while(ls>=0 && nums[pivot]<nums[ls]) {
        ls--;
      }
    }
    
    if(nums[pivot]>nums[ls])
      swap(nums, pivot, ls);
    
    return ls;
  }
  
  public void swap(int[] arr, int i, int j) {
    int m = arr[i];
    arr[i] = arr[j];
    arr[j] = m;
  }
}
