package largestrectinhis_84;

public class longestwidthmethod {

	public static int largestRectangleArea4(int[] heights) {
	    int n = heights.length;
	    if (n == 0) return 0;
	    int[] leftLess = new int[n], rightLess = new int[n];
	    // find left
	    leftLess[0] = 0;
	    for (int i = 1; i < n; i++) {
	        int p = i-1;
	        while (true) {
	            if (p >= 0 && heights[i] <= heights[p]) {
	                p -= leftLess[p] + 1;
	            } else {
	                leftLess[i] = i - p - 1;
	                break;
	            }
	        }
	    }
	    // find right
	    rightLess[n-1] = 0;
	    for (int i = n-2; i >= 0; i--) {
	        int p = i+1;
	        while (true) {
	            if (p < n && heights[i] <= heights[p]) {
	                p += rightLess[p] + 1;
	            } else {
	                rightLess[i] = p - 1 - i;
	                break;
	            }
	        }
	    }
	    int max = 0;
	    for (int i = 0; i < n; i++) {
	        max = Math.max(max, heights[i] * (leftLess[i] + rightLess[i] + 1));
	    }
	    return max;
	}
	
	public static void main(String[] args) {
		int[] heights = {2,1,5,6,2,3};
		System.out.println(largestRectangleArea4(heights));
	}
}
