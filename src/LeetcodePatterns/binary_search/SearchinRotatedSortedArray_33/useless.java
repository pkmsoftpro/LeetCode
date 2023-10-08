package LeetcodePatterns.binary_search.SearchinRotatedSortedArray_33;

// https://leetcode.com/problems/search-in-rotated-sorted-array/solutions/14435/clever-idea-making-it-simple/

public class useless {
  
  public static void main(String[] args) {
    int[] nums = {4,5,6,7,0,1,2};
    int target = 6;
    
    System.out.println(new useless().search(nums, target));
  }
  
  int search(int[] nums, int target) {
    int lo = 0, hi = nums.length;
    while (lo < hi) {
        int mid = (lo + hi) / 2;
        
        double num = (nums[mid] < nums[0]) == (target < nums[0])
                   ? nums[mid]
                   : target < nums[0] ? Integer.MIN_VALUE : Integer.MAX_VALUE;
         
        if (num < target)
            lo = mid + 1;
        else if (num > target)
            hi = mid;
        else
            return mid;
    }
    return -1;
  }
}
