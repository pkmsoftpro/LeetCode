package largestrectinhis_84;

public class Solution_divideAndConquer {

	public static int largestRectangleArea2(int[] heights) {
	    return largest(heights, 0, heights.length-1);
	}
	public static int largest(int[] heights, int start, int end) {
	    if (start > end) return 0;
	    if (start == end) return heights[start];
	    boolean sorted = true;
	    int min = start;
	    for (int i = start+1; i <= end; i++) {
	        if (heights[i] < heights[i-1]) sorted = false;
	        if (heights[i] < heights[min]) min = i;
	    }
	    if (sorted) {
	        int max = heights[start] * (end - start + 1);
	        for (int i = start+1; i <= end; i++) {
	            max = Math.max(max, heights[i] * (end - i + 1));
	        }
	        return max;
	    }
	    return Math.max(Math.max(largest(heights, start, min-1), largest(heights, min+1, end)),
	            heights[min] * (end - start + 1));
	}
	
	public static void main(String[] args) {
		int[] heights = {2,1,5,6,2,3};
		System.out.println(largestRectangleArea2(heights));
	}
}
