package LeetcodePatterns.dp.DecodeWays_91;
/*
 * https://leetcode.com/problems/decode-ways/discuss/30358/Java-clean-DP-saddlebackvariant-with-explanation
 * 
 *
 * video: https://www.youtube.com/watch?v=Q4_azFiO5nE
 * 
 *
 * I used a dp array of size n + 1 to save subproblem solutions. dp[0] means an empty string will have one 
 * way to decode, dp[1] means the way to decode a string of size 1. 
 * I then check one digit and two digit combination and save the results along the way. 
 * In the end, dp[n] will be the end result.
 */

public class Dp {
    public int numDecodings(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }
        int n = s.length();
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = s.charAt(0) != '0' ? 1 : 0;
        for(int i = 2; i <= n; i++) {
            int first = Integer.parseInt(s.substring(i-1, i));
            int second = Integer.parseInt(s.substring(i-2, i));
            if(first >= 1 && first <= 9) {
               dp[i] += dp[i-1];  
            }
            if(second >= 10 && second <= 26) {
                dp[i] += dp[i-2];
            }
        }
        return dp[n];
    }
    
    public static void main(String[] args) {
		String s = "111111";
		System.out.println(new Dp().numDecodings(s));
	}
}
