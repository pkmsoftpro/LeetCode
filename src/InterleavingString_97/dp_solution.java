package InterleavingString_97;

/*
 * https://leetcode.com/problems/interleaving-string/discuss/32029/Clean-Java-DP-saddlebackvariant
 * 
 * String Interleaving Dynamic Programming:
 * Tushar Roy - Coding Made Simple:
 * 
 * https://www.youtube.com/watch?v=ih2OZ9-M3OM
 */

public class dp_solution {

	public boolean isInterleave(String s1, String s2, String s3) {
		int m = s1.length(), n = s2.length();
		if (n + m != s3.length()) return false;
		if (s3.length() == 0) return true;
		
		boolean[][] dp = new boolean[m+1][n+1];
		dp[0][0] = true;
		for (int i = 0; i <= m; i++) {
			if (s1.substring(0, i).equals(s3.substring(0, i))) 
				dp[i][0] = true;
			else 
				dp[i][0] = false;
		}
		for (int j = 0; j <= n; j++) {
			if (s2.substring(0, j).equals(s3.substring(0, j))) 
				dp[0][j] = true;
			else 
				dp[0][j] = false;
		}
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				dp[i][j] = (dp[i-1][j] && s1.charAt(i-1) == s3.charAt(i+j-1)) 
						|| (dp[i][j-1] && s2.charAt(j-1) == s3.charAt(i+j-1));
			}
		}
	    return dp[m][n];
	}
	
	public static void main(String[] args) {
		String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac";
		System.out.println(new dp_solution().isInterleave(s1, s2, s3));
	}
}
