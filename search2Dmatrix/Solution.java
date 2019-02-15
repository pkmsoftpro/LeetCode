package search2Dmatrix;

/*
 * https://leetcode.com/problems/search-a-2d-matrix/discuss/26220/Don't-treat-it-as-a-2D-matrix-just-treat-it-as-a-sorted-list
 */
public class Solution {

	public boolean searchMatrix(int[][] matrix, int target) {
	    if (matrix == null || matrix.length == 0){
	        return false;
	    }
	    int rSize = matrix.length;
	    int cSize = matrix[0].length;
	    return binaryMatrixSearch(matrix, cSize, 0, rSize*cSize-1, target);
	}

	public boolean binaryMatrixSearch(int[][] matrix, int cSize, int low, int high, int target){
	    int mid,rMid,cMid,midValue;
	    while (low <= high){
	        mid = (low + high) / 2;
	        rMid = mid / cSize;
	        cMid = mid % cSize;
	        midValue = matrix[rMid][cMid];
	        if (midValue == target){
	            return true;
	        } else if (midValue < target){
	            low = mid+1;
	        } else if (midValue > target){
	            high = mid-1;
	        }
	    }
	    return false;
	}
	
	public static void main(String[] args) {
		int[][] matrix = {
				  {1,   3,  5,  7},
				  {10, 11, 16, 20},
				  {23, 30, 34, 50}
				};
		System.out.println(new Solution().searchMatrix(matrix, 16));
	}
}
