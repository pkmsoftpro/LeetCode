package LeetcodePatterns.binary_search.SearchinRotatedSortedArray_33;



public class sol {

  public static void main(String[] args) {
    int[] nums = {1,0,1,1,1};
      //{1};
      //{6,7,0,1,2,3,4,5};
      //{4,5,0,1,2};
      //{4,5,6,7,0,1,2};
    int target = 0;
    
    System.out.println(new sol().search(nums, target));
  }
  
  public int search(int[] a, int target) {
    int lo = 0;
    int hi = a.length-1;
    
    while(lo<hi) {
      int mid = lo + (hi-lo)/2;
      // if a[lo] is smaller than a[hi], then clean binary search, compare mid with target
            // if target>a[mid] lo = mid;
            // if target<a[mid] hi = mid;
            // else return 1;
      
      // if a[lo] is higher than a[hi], then rotated, compare a[mid] with a[lo] 
            // if a[lo]<=a[mid]
                  // target<a[mid] then hi = mid;
                  // target>a[mid] then lo = mid+1;
                  // target==a[mid] return 1;
            // if a[lo]>=a[mid]
                  // target>a[mid] and target<=a[hi] then lo = mid+1;
                  // target>a[mid] and target>a[hi] then hi = mid-1;
                  // target<a[mid] then hi = mid;
                  // target==a[mid] return 1
      if(a[lo]<a[hi]) {
        if(target>a[mid]) lo = mid+1;
        else if(target<a[mid]) hi = mid;
        else return mid;
      } 
      
      else {
        if(a[lo]<=a[mid]) {
          if(target<a[mid] && target>=a[lo]) hi = mid;
          else if(target<a[mid] && target<a[lo]) lo = mid+1;
          else if(target>a[mid]) lo = mid+1;
          else return mid;
        } else {
            if(target>a[mid] && target<=a[hi]) lo = mid+1;
            else if(target>a[mid] && target>a[hi]) hi = mid-1;
            else if(target<a[mid]) hi = mid;
            else return mid;
        }
      }
    }
    return a[lo]==target?lo:-1;
  }
}
