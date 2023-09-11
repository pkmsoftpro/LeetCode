package LeetcodePatterns.heap.KthSmallestElementinSortedMatrix_378;

//https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/solutions/1322101/c-java-python-maxheap-minheap-binary-search-picture-explain-clean-concise/
/*
 * 
 * Complexity:
Time: O(M * N * logK), where M <= 300 is the number of rows, N <= 300 is the number of columns.
Space: O(K), space for heap which stores up to k elements.
 */
import java.util.PriorityQueue;

public class maxheap {

  public static void main(String[] args) {
    int[][] matrix = {{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
    // {{1,2},{1,3}};
    // {{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
    int k = 1;
    k = new maxheap().kthSmallest(matrix, k);
    System.out.println(k);
  }

  public int kthSmallest(int[][] matrix, int k) {
    int m = matrix.length, n = matrix[0].length; // For general, the matrix need not be a square
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> Integer.compare(o2, o1));
    for (int r = 0; r < m; ++r) {
      for (int c = 0; c < n; ++c) {
        maxHeap.offer(matrix[r][c]);
        if (maxHeap.size() > k)
          maxHeap.poll();
      }
    }
    return maxHeap.poll();
  }
}
