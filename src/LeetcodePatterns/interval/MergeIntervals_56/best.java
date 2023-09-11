package LeetcodePatterns.interval.MergeIntervals_56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import util.PrintJavaFunction;

public class best {

  public static void main(String[] args) {
    int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
    // {{2,3},{5,5},{2,2},{3,4},{3,4}};
    // {{1, 3}, {2, 6}, {8, 10}, {15, 18}};

    List<int[]> list = new best().merge(intervals);

    for (int[] interval : list) {
      System.out.print("[");
      PrintJavaFunction.printArray(interval);
      System.out.print("]");
    }
  }

  public List<int[]> merge(int[][] intervals) {

    // sort our intervals
    Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);

    ArrayList<int[]> ans = new ArrayList<>();
    // intial range
    int start = intervals[0][0];
    int end = intervals[0][1];

    int interv = 1;
    while (interv < intervals.length) {
      int s = intervals[interv][0];
      int e = intervals[interv][1];
      // next interval start is smaller than prev end and array is sorted
      // so these two internal can merge
      if (s <= end) {
        // so merge both intervals
        end = Math.max(end, e);
      } else { // if merge not possible , then insert prev interval into list
        ans.add(new int[] {start, end});
        start = s;
        end = e;
      }
      interv++;
    }

    ans.add(new int[] {start, end});

    return ans;

  }
}
