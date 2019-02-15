package maxrect_85;
/*
 * https://leetcode.com/problems/maximal-rectangle/discuss/231921/Simple-Java-Solution-based-on-84.-Largest-Rectangle-in-Histogram
 */
class Solution {

	// First, it is also done with dp: heights holds the number of consecutive '1's 
	//                                 from the top row of the i-th row of a column;
    // Then use the logic of 84 to take the largest rectangle size in the continuous interval;
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) return 0;
        int width = matrix[0].length, res = 0;
        int[] heights = new int[width];
        for (char[] row : matrix) {
            for (int c = 0; c < width; c++) {
                if (row[c] == '1') heights[c]++;
                else heights[c] = 0;
            }
            res = Math.max(res, largestRectangleArea(heights));
        }
        return res;
    }
    

 // The following part is the solution to question 84: divide the rule to find the largest rectangle 
 //                                                    (no need to modify)
 // Idea: There is a minimum for each interval
 // For the minimum, nothing more than three possibilities:
 // 1: Either the whole area is the largest, 2, 3: either the left side of the minimum value 
 //    or the right side of the minimum value (the minimum value is not included)
 //    is the largest, and is solved recursively by divide and conquer;
 // When encountering an orderly interval, using recursion will reduce efficiency, 
 //	   so you can calculate and compare them separately.
	public int largestRectangleArea(int[] heights) {
        return largestRect(heights, 0, heights.length - 1);
    }
	
    private int largestRect(int[] heights, int start, int end) {
        if (start > end) return 0;
        if (start == end) return heights[start];
        int minIndex = start;
        // Use variables that are ordered to significantly improve efficiency
        // Here you can detect two-way (in the order of getting bigger or smaller)
        int inc = 0, dec = 0;
        for (int i = start + 1; i <= end; i++) {
            if (heights[i] < heights[minIndex]) minIndex = i;
            if (heights[i] > heights[i - 1]) inc++; // ascending
            else if (heights[i] < heights[i - 1]) dec--; // descending
        }
        int res = 0;
        // ascending
        if (dec == 0) {
            for (int i = start; i <= end; i++)
                res = Math.max(res, heights[i] * (end - i + 1));
        } 
        // descending
        else if (inc == 0) {
            for (int i = start; i <= end; i++)
                res = Math.max(res, heights[i] * (i - start + 1));
        }
        // disorder
        else {
            res = Math.max(Math.max(largestRect(heights, minIndex + 1, end), largestRect(heights, start, minIndex - 1)),
                    heights[minIndex] * (end - start + 1));
        }
        return res;
    }
    
    public static void main(String[] args) {
		char[][] matrix = {
				  {'1','0','1','0','0'},
				  {'1','0','1','1','1'},
				  {'1','1','1','1','1'},
				  {'1','0','0','1','0'}
				};
		System.out.println(new Solution().maximalRectangle(matrix));
	}
}