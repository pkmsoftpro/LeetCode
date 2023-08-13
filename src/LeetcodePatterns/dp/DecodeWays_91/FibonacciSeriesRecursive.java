package LeetcodePatterns.dp.DecodeWays_91;

import java.util.Arrays;

public class FibonacciSeriesRecursive {

  public static void main(String[] args) {
    int n = 50;
    int[] mem = new int[n+1];
    Arrays.fill(mem, -1);
    for(int i=0; i<n; i++) {
      System.out.print(fibSeries(i+1) + ":");
    }
  }
//1,1,2,3,5,8,-,21,34,55,89
  private int fibSeries1(int n, int[] mem) {
    
    if(n==0 || n==1)
      return 1;
    if(mem[n]!=-1) return mem[n];
    return mem[n] =  fibSeries1(n-1, mem) + fibSeries1(n-2, mem);
  }
  
  private static int fibSeries(int n) {
    int dp = 1, prev = 0, first = 1;
    for(int i=1; i<n; i++) {
      dp = first + prev;
      prev = first;
      first = dp;
    }
    
    return dp;
  }
}
