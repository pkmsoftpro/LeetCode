package LeetcodePatterns.binary_search.FindMinimuminRotatedSortedArray_153;


// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/solutions/48493/compact-and-clean-c-useless/

public class solution {

  public static void main(String[] args) {
    int[] nums = {4,5,6,7,8, 9, 10};
    // {11,13,15,17};
    // {4,5,6,7,8, 9, 10, 0,1,2};
    System.out.println(new solution().findMin(nums));
  }

  public int findMin(int[] nums) {
    int lo = 0;
    int hi = nums.length - 1;
    
    while (lo < hi) {
      if(nums[lo]<=nums[hi])
        return nums[lo];
      int mid = lo+ (hi-lo)/2;
      
      if(nums[mid]>=nums[lo])
        lo = mid+1;
      else
        hi = mid;
    }
    
    return nums[lo];
  }

  public int findMinVariant(int[] nums) {
    int lo = 0;
    int hi = nums.length - 1;

    while (lo < hi) {
      int mid = lo + (hi - lo) / 2;

      if (mid > 0 && mid < nums.length - 1) {
        if (nums[mid - 1] < nums[mid]) {
          if (nums[mid] > nums[mid + 1]) {
            return nums[mid + 1];
          } else if (nums[mid] < nums[nums.length - 1]) {
            hi = mid;
          } else {
            lo = mid + 1;
          }
        } else if (nums[mid - 1] > nums[mid]) {
          return nums[mid];
        } else {
          lo = mid + 1;
        }
      } else if (mid == 0) {
        if (nums.length > 1 && nums[mid] > nums[mid + 1]) {
          return nums[mid + 1];
        }
        return nums[mid];
      } else {
        hi = mid;
      }
    }
    return nums[0];
  }
}
