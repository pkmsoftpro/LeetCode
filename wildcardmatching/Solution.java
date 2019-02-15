package wildcardmatching;

//https://leetcode.com/problems/wildcard-matching/discuss/218152/Clearly-Explained-Java-DP

public class Solution {
    public boolean isMatch(String s, String p) {
        int[][] dp = new int[p.length() + 1][s.length() + 1];
        dp[0][0] = 1;
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '?') {
                for (int j = 0; j < s.length(); j++) {
                    if (dp[i][j] == 1)
                        dp[i + 1][j + 1] = 1;
                }
            } else if (p.charAt(i) == '*') {
                int a = 0;
                for (int j = 0; j < dp[i].length; j++) {
                    if (dp[i][j] == 1) a = 1;
                    dp[i + 1][j] = a;
                }
            } else {
                for (int j = 0; j < s.length(); j++) {
                    if (dp[i][j] == 1 && p.charAt(i) == s.charAt(j))
                        dp[i + 1][j + 1] = 1;
                }
            }
        }
        return dp[p.length()][s.length()] == 1;
    }
    
    public static void main(String[] args) {
		/*String s = "aaabbzzzt ";
		String p = "a*z?*?t?";*/
    	String s = "aazzaa";
		String p = "a*z?aa";
		System.out.println(new Solution().isMatch(s, p));
	}
}
