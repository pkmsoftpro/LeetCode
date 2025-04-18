package LeetcodePatterns.dp.PalindromicSubstrings_647;

// https://leetcode.com/problems/palindromic-substrings/solutions/105707/java-python-dp-saddlebackvariant-based-on-longest-palindromic-substring/

public class dp {

  public static void main(String[] args) {
    String s = "abc";
    System.out.println(new dp().countSubstrings(s));
  }

  public int countSubstrings(String s) {
    int n = s.length();
    int res = 0;
    boolean[][] dp = new boolean[n][n];
    
    for (int i = n - 1; i >= 0; i--) {
      
      for (int j = i; j < n; j++) {
        dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i + 1 < 3 || dp[i + 1][j - 1]);
        if (dp[i][j])
          ++res;
      }
    }
    return res;
  }
}
