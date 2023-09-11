package LeetcodePatterns.heap.KPairsSmallestSums_373;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import util.PrintJavaFunction;

public class partitionsort {
  
  public static void main(String[] args) {
    int[] nums1 = {0,0,0,0,0}, nums2 = {-3,22,35,56,76};
    // nums1 = {0,0,0,0,0}, nums2 = {-3,22,35,56,76};
    // nums1 = {1,1,2}, nums2 = {1,2,3};
    // nums1 = {1,7,11,16}, nums2 = {2,9,10,15};
    // nums1 = {1,7,11}, nums2 = {2,4,6};
    int k = 22;
    List list = new partitionsort().kSmallestPairs(nums1, nums2, k);

    PrintJavaFunction.printList(list);
  }
  
  public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {

    int len1 = nums1.length, len2 = nums2.length;

    int left = nums1[0] + nums2[0];
    int right = nums1[len1 - 1] + nums2[len2 - 1];
    while (left <= right) {
      int middle = left + (right-left)/2;

      long cnt = getSmallerGreaterCnt(nums1, nums2, middle, k);
      if (cnt < k) {
        left = middle + 1;
      } else if (cnt > k) {
        right = middle - 1;
      } else {
        left = middle;
        break;
      }
    }
    return getPairs(nums1, nums2, left, k);
  }

  int getSmallerGreaterCnt(int[] nums1, int[] nums2, int target, int k) {
    int previousRight = nums2.length - 1;
    int cnt = 0;
    for (int i = 0; i < nums1.length && nums1[i] + nums2[0] <= target; i++) {
      int left = 0, right = previousRight;
      int pos = -1;
      while (left <= right) {
        int middle = (left + right) / 2;
        int sum = nums1[i] + nums2[middle];
        if (sum <= target) {
          pos = middle;
          left = middle + 1;
        } else {
          right = middle - 1;
        }
      }
      if (pos >= 0) {
        cnt += pos + 1;
        previousRight = pos;
      }
      if (cnt > k) {
        return cnt;
      }
    }
    return cnt;
  }

  List<List<Integer>> getPairs(int[] nums1, int[] nums2, int targetSum, int k) {
    List<List<Integer>> pairs = new ArrayList();
    for (int i = 0; i < nums1.length; i++) {
      for (int j = 0; j < nums2.length && nums1[i] + nums2[j] < targetSum; j++) {
        pairs.add(Arrays.asList(nums1[i], nums2[j]));
      }
    }
    for (int i = 0; i < nums1.length; i++) {
      for (int j = 0; j < nums2.length && pairs.size() < k; j++) {
        if(nums1[i] + nums2[j] == targetSum) {
          pairs.add(Arrays.asList(nums1[i], nums2[j]));
        }
      }
    }
    return pairs;
  }
}

// [0, -3] [0, 22] [0, 35] [0, 56] [0, -3] [0, 22] [0, 35] [0, 56] [0, -3] [0, 22] [0, 35] [0, 56] [0, -3] [0, 22] [0, 35] [0, 56] [0, -3] [0, 22] [0, 35] [0, 56] [0, 76] [0, 76] 
// [0, -3] [0, 22] [0, 35] [0, 56] [0, -3] [0, 22] [0, 35] [0, 56] [0, -3] [0, 22] [0, 35] [0, 56] [0, -3] [0, 22] [0, 35] [0, 56] [0, -3] [0, 22] [0, 35] [0, 56]
// [0, -3] [0, 22] [0, 35] [0, 56] [0, -3] [0, 22] [0, 35] [0, 56] [0, -3] [0, 22] [0, 35] [0, 56] [0, -3] [0, 22] [0, 35] [0, 56] [0, -3] [0, 22] [0, 35] [0, 56] [0, 76] [0, 76] 




