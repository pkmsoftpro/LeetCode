package setmatrixzero_73;

/*
 * Challenge is to use only O(1) space.
 * 
 * https://leetcode.com/problems/set-matrix-zeroes/discuss/26014/Any-shorter-O(1)-space-saddlebackvariant
 */

public class Solution {

	void setZeroes(int[][] matrix) {
	    int col0 = 1, rows = matrix.length, cols = matrix[0].length;

	    for (int i = 0; i < rows; i++) {
	        if (matrix[i][0] == 0) {
	        	col0 = 0;
	        }
	        for (int j = 1; j < cols; j++)
	            if (matrix[i][j] == 0)
	                matrix[i][0] = matrix[0][j] = 0;
	    }

	    for (int i = rows - 1; i >= 0; i--) {
	        for (int j = cols - 1; j >= 1; j--)
	            if (matrix[i][0] == 0 || matrix[0][j] == 0)
	                matrix[i][j] = 0;
	        if (col0 == 0) matrix[i][0] = 0;
	    }
	}
	
	public static void main(String[] args) {
		int[][] matrix = {
				  {0,   3,  5,  7},
				  {10,  0, 16, 20},
				  {23, 30, 34, 50}
				};
		new Solution().setZeroes(matrix);
		System.out.println("done");
	}
}
