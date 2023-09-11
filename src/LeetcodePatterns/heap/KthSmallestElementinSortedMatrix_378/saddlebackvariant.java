package LeetcodePatterns.heap.KthSmallestElementinSortedMatrix_378;


// https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/solutions/1322101/c-java-python-maxheap-minheap-binary-search-picture-explain-clean-concise/

/*
 * 
 * Complexity

Time: O((M+N) * logD), where M <= 300 is the number of rows, N <= 300 is the number of columns, D <= 2*10^9 is the difference between the maximum element and the minimum element in the matrix.
Space: O(1).
 */
public class saddlebackvariant {
  
  public static void main(String[] args) {
    int[][] matrix = {{ 1,  2,  3, 4}, 
                      { 5,  6,  7, 18}, 
                      { 9, 10, 15, 19},
                      {14, 15, 16, 20}};
    // {{1,2},{1,3}};
    // {{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
    int k = 1;
    k = new saddlebackvariant().kthSmallest(matrix, k);
    System.out.println(k);
  }
  
  public int kthSmallest(int[][] matrix, int k) {
    int len = matrix.length;
    int low = matrix[0][0];
    int high = matrix[len - 1][len - 1];
    while (low <= high) {
      int mid = low + (high - low) / 2;
      int count = countNoBigger(matrix, mid);
      if (count >= k)
        high = mid - 1;
      else
        low = mid + 1;
    }
    return low;
  }

  private int countNoBigger(int[][] matrix, int mid) {
    int row = matrix.length - 1, col = 0, count = 0; // starting from the bottom left of the matrix,
                                                     // if want to be bigger then go right, smaller
                                                     // then go up.
    while (row >= 0 && col < matrix[0].length) {
      if (matrix[row][col] > mid)
        row--;
      else {
        count += row + 1; // since it is sorted, when the bottom is smaller then all the upper index
                          // must be smaller, + 1 means index starts from 0.
        col++;
      }
    }
    return count;
  }
  
  public int count(int[][] matrix, int x) {
    int r=0, c = matrix[0].length-1, count = 0;
    
    while(r<matrix.length && c>=0) {
      if(x>matrix[r][c]) {
        count += c+1;
        r++;
      } else {
        c--;
      }
    }
    return count;
  }
}
