package LeetcodePatterns.interval.IntervalListIntersections_986;

// // https://leetcode.com/problems/interval-list-intersections/discuss/3534592/Solution

import java.util.LinkedList;
import java.util.List;

public class recursive {
  public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
    List<int[]> result = new LinkedList<>();
    getInterval(firstList, secondList, 0, 0, result);
    return result.toArray(new int[result.size()][]);
  }

  public List<int[]> getInterval(int[][] firstList, int[][] secondList, int pointerA, int pointerB,
      List<int[]> result) {
    if (pointerA == firstList.length || pointerB == secondList.length) {
      return result;
    }
    int[] a = firstList[pointerA];
    int[] b = secondList[pointerB];
    int min = Math.max(a[0], b[0]);
    int max = Math.min(a[1], b[1]);
    if (min <= max) {
      result.add(new int[] {min, max});
      if (a[1] == max) {
        return getInterval(firstList, secondList, pointerA + 1, pointerB, result);
      }
      return getInterval(firstList, secondList, pointerA, pointerB + 1, result);
    }
    if (a[0] == min) {
      return getInterval(firstList, secondList, pointerA, pointerB + 1, result);
    }
    return getInterval(firstList, secondList, pointerA + 1, pointerB, result);
  }
}
