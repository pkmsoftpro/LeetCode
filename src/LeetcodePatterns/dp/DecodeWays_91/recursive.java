package LeetcodePatterns.dp.DecodeWays_91;

/*
 * 
 * https://leetcode.com/problems/decode-ways/solutions/30451/evolve-from-recursion-to-dp/
 * 
 * 
 * https://leetcode.com/problems/decode-ways/discuss/233731/my-simple-java-saddlebackvariant
 * 
 * https://leetcode.com/problems/decode-ways/solutions/2645299/java-easy-to-understand-detailed-saddlebackvariant-recursion-memoization/
 */

public class recursive {
//  public int numDecodings(String s) {
//    if (s.length() == 0 || s.length() == 1) {
//      return 1;
//    }
//    if (s.charAt(0) == '0') {
//      return 0;
//    }
//    int num = s.charAt(0) - '0', num2 = s.charAt(1) - '0';
//    return numDecodings(s.substring(1))
//        + ((num == 1 || num == 2 && num2 < 7) ? numDecodings(s.substring(2)) : 0);
//  }

  public static void main(String[] args) {
    String s = "121";
    System.out.println(new recursive().numDecodings(s));
  }
  
  public int numDecodings(String s) {
    return s.length()==0?0:numDecodings(0,s);      
  }
  private int numDecodings(int p, String s) {
    int n = s.length();
    if(p==n)
      return 1;
    if(s.charAt(p)=='0')
      return 0;
    int res = numDecodings(p+1, s);
    
    if(p<n-1 && (s.charAt(p)=='1' || s.charAt(p)=='2' && s.charAt(p+1)<'7'))
      res += numDecodings(p+2, s);
    return res;
  }
}
