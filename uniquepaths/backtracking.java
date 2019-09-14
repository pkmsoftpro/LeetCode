package uniquepaths;
/**
 * https://leetcode.com/problems/unique-paths/discuss/374561/100-or-5-Solutions-or-Step-by-Step-optimisation-or-Dp-thought-process
 *
 * We can solve this problem through backtracking.
 * Backtracking
 * 1. Our goal: To reach destination cell (m-1,n-1), once reach it counted as one path
 * 2. Our constraints: a) We can not move outside of boundary b
 * 3. Our choices: a) we can move either Down (i+1,j) or right (i, j+1) from any cell
 * <p>
 * Complexity:
 * To reach a cell there are two way and we try all the source cell to reach this cell.
 * Complexity: O((m*n)^2) /O (m*n)
 * <p>
 * TLE
 */

public class backtracking {

	int backtrack(int r, int c, int m, int n) {
		if (r == m-1 && c == n-1)
			return 1;
		if (r > m || c > n)
			return 0;

		return backtrack(r + 1, c, m, n) + backtrack(r, c + 1, m, n);
	}
	
	public static void main(String[] args) {
		System.out.println(new backtracking().backtrack(0,0,7,3));
	}
}
