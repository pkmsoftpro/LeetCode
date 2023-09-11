package LeetcodePatterns.heap.KPairsSmallestSums_373;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

import util.PrintJavaFunction;

public class heap {

  public static void main(String[] args) {
    int[] nums1 = {1,1,2}, nums2 = {1,2,3};
    // nums1 = {1,7,11}, nums2 = {2,4,6};
    int k = 20;
    List list = new heap().kSmallestPairs(nums1, nums2, k);

    PrintJavaFunction.printList(list);
  }

  public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
    PriorityQueue<List<Integer>> que =
        new PriorityQueue<List<Integer>>((a, b) -> a.get(0) + a.get(1) - b.get(0) - b.get(1));
    List<List<Integer>> res = new ArrayList<>();
    if (nums1.length == 0 || nums2.length == 0 || k == 0)
      return res;
    for (int i = 0; i < nums1.length && i < k; i++)
      que.offer(Arrays.asList(nums1[i], nums2[0], 0));
    while (k-- > 0 && !que.isEmpty()) {
      List<Integer> cur = que.poll();
      res.add(Arrays.asList(cur.get(0), cur.get(1)));
      if (cur.get(2) == nums2.length - 1)
        continue;
      que.offer(Arrays.asList(cur.get(0), nums2[cur.get(2) + 1], cur.get(2) + 1));
    }
    return res;
  }
}
//[1, 1] [1, 2] [1, 3] [1, 1] [1, 2] [1, 3] [2, 1] [2, 2] [2, 3] 
//[1, 1] [1, 1] [1, 2] [1, 2] [2, 1] [1, 3] [2, 2] [1, 3] [2, 3] 