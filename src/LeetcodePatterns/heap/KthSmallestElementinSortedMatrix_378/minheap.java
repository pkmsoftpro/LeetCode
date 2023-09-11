package LeetcodePatterns.heap.KthSmallestElementinSortedMatrix_378;
//https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/solutions/1322101/c-java-python-maxheap-minheap-binary-search-picture-explain-clean-concise/

/*
 * 
 * Complexity:

Time: O(K * logK)
Space: O(K)
 */
import java.util.Comparator;
import java.util.PriorityQueue;

public class minheap {

  public static void main(String[] args) {
    int[][] matrix = {{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
    // {{1,2},{1,3}};
    // {{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
    int k = 5;
    k = new minheap().kthSmallest(matrix, k);
    System.out.println(k);
  }

  public int kthSmallest(int[][] matrix, int k) {
    int m = matrix.length, n = matrix[0].length, ans = -1; // For general, the matrix need not be a square
    PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(o -> o[0]));
    for (int r = 0; r < Math.min(m, k); ++r)
        minHeap.offer(new int[]{matrix[r][0], r, 0});

    for (int i = 1; i <= k; ++i) {
        int[] top = minHeap.poll();
        int r = top[1], c = top[2];
        ans = top[0];
        if (c + 1 < n) minHeap.offer(new int[]{matrix[r][c + 1], r, c + 1});
    }
    return ans;
}
}
