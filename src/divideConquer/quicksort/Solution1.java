package divideConquer.quicksort;

public class Solution1 {
  
  public static void main(String[] args) {
    int[] arr = {3,4,8,4,5,6,1,2,3,9,6,5,7,0,4,3,1};
    int k = 7;
    int i = new Solution1().findKthLargest(arr, k);
    System.out.println(i);
  }
  
//  public int findKthLargest(int[] nums, int k) {
//
//    int max = nums[0];
//    int min = nums[0];
//
//    for(int i = 0; i < nums.length; ++i) {
//        max = max < nums[i] ? nums[i] : max;
//        min = min > nums[i] ? nums[i] : min;
//    }
//
//    int div = max - min + 1;
//    int[] temp = new int[div];
//
//    for(int i = 0; i < nums.length; ++i) {
//        temp[nums[i] - min]++;
//    }
//
//    for(int i = div - 1; i >= 0; --i) {
//        k -= temp[i];
//        if(k <= 0) return i + min;
//    }
//
//    return 0;
//
//}

  public int findKthLargest(int[] nums, int k) {
    int left = 0, right = nums.length - 1, kth;
    while (true) {
      int idx = partition(nums, left, right);
      if (idx == k - 1) {
        kth = nums[idx];
        break;
      }
      if (idx < k - 1) {
        left = idx + 1;
      } else {
        right = idx - 1;
      }
    }
    return kth;
  }

  private int partition(int[] nums, int left, int right) {
    int pivot = nums[left], l = left + 1, r = right;
    while (l <= r) {
      if (nums[l] < pivot && nums[r] > pivot) {
        swap(nums, l++, r--);
      }
      if (nums[l] >= pivot) {
        l++;
      }
      if (nums[r] <= pivot) {
        r--;
      }
    }
    swap(nums, left, r);
    return r;
  }

  public void swap(int[] arr, int i, int j) {
    int m = arr[i];
    arr[i] = arr[j];
    arr[j] = m;
  }
}
