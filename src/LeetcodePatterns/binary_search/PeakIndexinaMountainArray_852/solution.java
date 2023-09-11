package LeetcodePatterns.binary_search.PeakIndexinaMountainArray_852;

// https://leetcode.com/problems/peak-index-in-a-mountain-array/solutions/139848/c-java-python-better-than-binary-search/
// https://medium.datadriveninvestor.com/golden-section-search-method-peak-index-in-a-mountain-array-leetcode-852-a00f53ed4076
class Solution {
  public int peakIndexInMountainArray(int[] A) {
      int l = 0, r = A.length - 1, m;
      while (l < r) {
          m = (l + r) / 2;
          if (A[m] < A[m + 1])
              l = m + 1;
          else
              r = m;
      }
      return l;
  }
}
