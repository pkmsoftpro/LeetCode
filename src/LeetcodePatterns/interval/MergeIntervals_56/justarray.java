package LeetcodePatterns.interval.MergeIntervals_56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class justarray {
  public int[][] merge(int[][] intervals) {
    if (intervals.length <= 1)
      return intervals;

    // Sort by ascending starting point
    Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));

    List<int[]> result = new ArrayList<>();
    int[] newInterval = intervals[0];
    result.add(newInterval);
    for (int[] interval : intervals) {
      if (interval[0] <= newInterval[1]) // Overlapping intervals, move the end if needed
        newInterval[1] = Math.max(newInterval[1], interval[1]);
      else { // Disjoint intervals, add the new interval to the list
        newInterval = interval;
        result.add(newInterval);
      }
    }

    return result.toArray(new int[result.size()][]);
  }
}
