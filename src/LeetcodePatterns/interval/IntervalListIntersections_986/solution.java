package LeetcodePatterns.interval.IntervalListIntersections_986;

// https://leetcode.com/problems/interval-list-intersections/discuss/1593667/C%2B%2BPython-Simple-Solution-w-Images-and-Explanation-or-2-Pointers-Merge-Approach
import java.util.ArrayList;
import java.util.List;

import util.PrintJavaFunction;

public class solution {

  public static void main(String[] args) {
    int[][] firstList = {{4,6},{7,8},{10,17}}, secondList = {{5,10}};
        //firstList = {{3,5},{9,20}}, secondList = {{4,5},{7,10},{11,12},{14,15},{16,20}};
        //firstList = {{8,15}}, secondList = {{2,6},{8,10},{12,20}};
        //firstList = {{0,2},{5,10},{13,23},{24,25}}, secondList = {{1,5},{8,12},{15,24},{25,26}};
    
    firstList = new solution().intervalIntersection(firstList, secondList);
    
    for(int[] arr : firstList) {
      PrintJavaFunction.printArray(arr);
    }
  }
  
  public int[][] intervalIntersection(int[][] A, int[][] B) {
    List<int[]> list = new ArrayList<int[]>();
    int i=0, j=0;
    
    while(i<A.length && j<B.length) {
      if(A[i][0]<=B[j][1] && A[i][1]>=B[j][0]) {
        list.add(new int[] {Math.max(A[i][0], B[j][0]), Math.min(A[i][1], B[j][1])});
      }
      if(A[i][1]<B[j][1]) i++;
      else j++;
    }
    
    return list.toArray(new int[list.size()][]);
  }
}
