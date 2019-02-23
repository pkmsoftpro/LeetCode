package distinctsubsequence_115;
/*
 * https://leetcode.com/problems/distinct-subsequences/discuss/142617/Java-Backtracking-solution-not-very-fast-but-very-intuitive.
 */

public class backtrack {
	
	public int numDistinct(String s, String t) {
		int[][] dp = new int[s.length()][t.length()];

		for (int i = 0; i < s.length(); ++i) {
			for (int j = 0; j < t.length(); ++j) {
				dp[i][j] = -1;
			}
		}

		return numDistinctDFS(s, t, 0, 0, dp);
	}

	int numDistinctDFS(String s, String t, int i, int j, int[][] dp) {

		if (j >= t.length())
			return 1;

		if (i >= s.length())
			return 0;

		if (dp[i][j] >= 0)
			return dp[i][j];

		int count = 0;
		for (int k = i; k < s.length(); ++k) {
			if (s.charAt(k) == t.charAt(j)) {
				count += numDistinctDFS(s, t, k + 1, j + 1, dp);
			}

		}

		dp[i][j] = count;

		return count;
	} 

	// Driver code to check above method 
	public static void main(String[] args) 
	{ 
		String T = "ge"; 
		String S = "geeksforgeeks"; 
		System.out.println(new backtrack().numDistinct("geeksforgeeks", "ge")); 
	}
}
