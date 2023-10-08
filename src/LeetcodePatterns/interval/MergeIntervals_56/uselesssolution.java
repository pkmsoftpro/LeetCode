package LeetcodePatterns.interval.MergeIntervals_56;

// https://leetcode.com/problems/merge-intervals/solutions/3161191/uselesssolution/

/*
 * 
 * use the best.java to understand this useless
 */

import java.util.LinkedList;

import util.PrintJavaFunction;

public class uselesssolution {

  public static void main(String[] args) {
    int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
      //    {{2,3},{5,5},{2,2},{3,4},{3,4}};
      //    {{1, 3}, {2, 6}, {8, 10}, {15, 18}};

    intervals = new uselesssolution().merge(intervals);

    for (int[] interval : intervals) {
      System.out.print("[");
      PrintJavaFunction.printArray(interval);
      System.out.print("]");
    }
  }

  public int[][] merge(int[][] intervals) {
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < intervals.length; i++) {
      min = Math.min(min, intervals[i][0]);
      max = Math.max(max, intervals[i][0]);
    }

    int[] range = new int[max - min + 1];
    for (int i = 0; i < intervals.length; i++) {
      range[intervals[i][0] - min] = Math.max(intervals[i][1] - min, range[intervals[i][0] - min]);
    }

    int start = 0, end = 0;
    LinkedList<int[]> result = new LinkedList<>();
    for (int i = 0; i < range.length; i++) {
      if (range[i] == 0) {
        continue;
      }
      if (i <= end) {
        end = Math.max(range[i], end);
      } else {
        result.add(new int[] {start + min, end + min});
        start = i;
        end = range[i];
      }
    }
    result.add(new int[] {start + min, end + min});
    return result.toArray(new int[result.size()][]);
  }
}

// [1, 2, 0, 3]
// [2 4 ][5 5 ]

// [2, 5, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 0, 17]
// [1 6 ][8 10 ][15 18 ]