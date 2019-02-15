package largestrectinhis_84;

import java.util.Stack;

public class Solution_stack {

	public static int largestRectangleArea3(int[] heights) {
	    Stack<Integer> stack = new Stack<>();
	    int n = heights.length;
	    int max = 0;
	    for (int i = 0; i <= n; i++) {
	        while (!stack.empty() && (i >= n || heights[stack.peek()] > heights[i])) {
	            int top = stack.pop();
	            int h = heights[top];
	            int w = stack.empty() ? i : (i-stack.peek()-1);
	            max = Math.max(max, h*w);
	        }
	        stack.push(i);
	    }
	    return max;
	}
	
	public static void main(String[] args) {
		int[] heights = {2,1,5,6,2,3};
		System.out.println(largestRectangleArea3(heights));
	}
}
