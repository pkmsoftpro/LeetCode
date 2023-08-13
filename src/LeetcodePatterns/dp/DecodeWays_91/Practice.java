package LeetcodePatterns.dp.DecodeWays_91;

import java.util.Arrays;

public class Practice {

  public static void main(String[] args) {
    String s = "1111";
    System.out.println(new Practice().numDecodings(s));
  }
  
  public int numDecodings(String s) {
    int[] memo = new int[s.length()];
    Arrays.fill(memo, -1);
    return compute(s, 0, memo);
  }
  
  public int compute(String s, int i, int[] memo) {
    int n = s.length();
    if(n == i) {
      return 1;
    }
    if(s.charAt(i)=='0') {
      return 0;
    }
    if(memo[i]!=-1)
      return memo[i];
    
    int count = compute(s, i+1, memo);
    
    if(i<n-1 && (s.charAt(i)=='1' || s.charAt(i)=='2' && s.charAt(i+1) < '7'))
      count += compute(s, i+2, memo);
    
    return memo[i] = count;
  }
}
