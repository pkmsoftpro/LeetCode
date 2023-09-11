package LeetcodePatterns.interval.nonOverlappingIntervals_435;

import java.util.PriorityQueue;

public class solution {
  
  public static void main(String[] args) {
    int[][] intervals = {{-52,31},{-73,-26},{82,97},{-65,-11},{-62,-49},{95,99},{58,95},{-31,49},{66,98},{-63,2},{30,47},{-40,-26}};
      //{{3,4},{0,1},{1,2}};
      //{{0,1},{3,4},{1,2}};
      //{{1,8},{1,2},{1,3},{2,3},{3,4}};
      //{{-52,31},{-73,-26},{82,97},{-65,-11},{-62,-49},{95,99},{58,95},{-31,49},{66,98},{-63,2},{30,47},{-40,-26}};
      //{{-73,-26},{-65,-11},{-63,2},{-62,-49},{-52,31},{-40,-26},{-31,49},{30,47},{58,95},{66,98},{82,97},{95,99}}
      //       47 ,      54 ,    65 ,       B ,     83 ,      14 ,     80 ,    17 ,    37 ,    32 ,    15 ,  4
      //{{-62,-49},{-73,-26},{-40,-26},{-65,-11},{-63,2},{-52,31},{30,47},{-31,49},{58,95},{82,97},{66,98},{95,99}}
    System.out.println(new solution().eraseOverlapIntervals(intervals));
  }

  public int eraseOverlapIntervals(int[][] intervals) {
    //Arrays.sort(intervals, (a,b)-> Integer.compare(a[1], b[1]));
    PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a,b)->Integer.compare(a[1], b[1]));
    for(int[] vals: intervals) {
      pq.add(vals);
    }
    int result = 0;
    int count = intervals.length;
    while(count-->1) {
      int[] first = pq.poll();
      int[] second = pq.poll();
      
      if(first[0]==second[0] || second[0]<first[1]) {
        pq.add(first);
        result++;
      }else pq.add(second);
    }
    return result;
  }
}
