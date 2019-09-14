/*
 * https://leetcode.com/problems/minimum-path-sum/discuss/261220/Java-DP-and-backtrack
 *
 */

package minpathsum;

public class Solution {
	int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
	int[][] memo;

	public int backtrack(int r, int c) {
		if(r<0 || c<0 || r>=grid.length || c>=grid[0].length) {
			return Integer.MAX_VALUE;
		}
		if(r==grid.length-1 && c==grid[0].length-1) {
			return grid[r][c];
		}
		return grid[r][c] + Math.min(backtrack(r+1, c), backtrack(r, c+1));
    }
	
	public static void main(String[] args) {
		 
		System.out.println(new Solution().backtrack(0,0));
	}
}
