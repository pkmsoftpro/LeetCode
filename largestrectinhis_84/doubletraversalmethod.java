package largestrectinhis_84;
/*
 * https://leetcode.com/problems/largest-rectangle-in-histogram/discuss/225556/Java-solution-with-explanations-in-Chinese
 * 
 * https://www.geeksforgeeks.org/largest-rectangle-under-histogram/
 */

/*
 * 
 * 
 S1: Double traversal method

This question requires a continuous rectangle, which can form the area of ​​the largest rectangle, so as long as the position of this rectangle can be found. The simplest idea is to solve all the possible combinations. It is better to keep the largest one after comparison, as follows:

public static int largestRectangleArea(int[] heights) {
    int max = 0;
    for (int i = 0; i < heights.length; i++) {
        int min = heights[i];
        for (int j = i; j >= 0; j--) {
            if (heights[j] < min) {
                min = heights[j];
            }
            max = Math.max(max, min * (i-j+1));
        }
    }
    return max;
}
Through a double traversal, the outer layer traverses the end address of the rectangle, and the inner layer traverses the starting address of the rectangle, and solves by calculating the maximum composition area of ​​each combination. The time complexity is O(n^2).

S2: divide and conquer

The above method is based on the classification and calculation of the starting and ending positions of the rectangle. Then we can use another method to calculate: according to the height of the combined matrix from low to high, then take the maximum. We know that in a given set of matrices, if the one with the lowest height is taken, then the width must take the length of the array. For example, given an array [2,1,2], then when we take a height of 1, then the width must be 3. The area of ​​the combination matrix is ​​now 3 . At this time, the combination matrix is ​​obtained at the lowest height of 1. Then, if you take a higher height, then the small matrix with height 1 will not be included, so the matrix to be formed next must be on the left or right side of this 1, so that we can Think of this small matrix with a height of 1 to divide the entire matrix into two parts. The combination matrix we want to judge next is on the left or right. So, we only need to be able to form the left and right parts. The maximum area is just fine, so an array [2,1,2] is split into two arrays [2] and [2] by the minimum value 1, so that the solution of [2,1,2] is obtained. The problem becomes the solution of [2], and the solution of [2] has only one 2, and so on, we can decompose any large problem into several small problems, and then in these small problems. Find the maximum value.

code show as below:

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
For an array, there are three solutions that can become the maximum:

a solution to the left of the minimum
a solution to the right of the minimum
iterative_dontconsider containing the current minimum
In addition, in the above method, by judging whether the current sub-array is an ordered array, the judgment of the array is simplified, and only the order from small to large is judged, and it is also judged whether it is a large or small The order further improves the judgment efficiency. The time complexity of this algorithm is O(n\log n).

S3: Using the stack

The outer traversal of the first method is the end position of the combination matrix, and then the inner position of the combination matrix is ​​traversed one by one in the inner layer. By analyzing such a model, for a combination matrix ending at position i, it has a certain relationship with the height of the matrix before the current position:

If the height of the i position is greater than the height of the i-1 position, the height of the current position cannot be used as the height of the combination matrix in the combination with the matrix before this position. As for array [1, 2], then for position 2, the combination of these two positions cannot be 2 as the combined matrix height.
If the height of the i position is not greater than the height of the i-1 position, there is a combination matrix whose height is the current height. For example, array [2,1], for position 1, there is a combination method [1,1], so in this case it should be judged.
In addition, we know that for a highly-incremented array, it is easy to find the maximum area of ​​its combined matrix, then can we convert any matrix into a highly-incremented matrix sequence? For example, if an array [2,3,1,3,5] is changed to [1,1,1,3,5], but the process changes in 2, we have to make up for the change here by a certain method. The method is to record the maximum area of ​​the combinatorial matrix that can be composed before making changes, and then change it after it is finished. For the example above, we actually solve for two incremental arrays: [2,3] and [1,1,1,3,5], and the largest solution between them must be with [2,3,1 , 3, 5] have the same solution. Thus, converting an irregular array into a number of ordered arrays and then solving them is the idea of ​​this method.

The following is an implementation of the stack. If you use the stack, you don't need to modify the original data. Instead, you can directly intercept the original array into multiple ordered arrays. Determine the width of the current combined matrix by saving the index value:

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
S4: longest width method

We know that a combination matrix consisting of multiple matrices has a width that is the number of matrices and a height that is the lowest of the matrices. Therefore, for a matrix of any position, assuming that the height of the combined matrix at this time is the height of the current position matrix, we only need to specify the maximum width of the combined matrix at this time, and then we can find the combination with the height of the current matrix as the height. The maximum area of ​​the matrix, then we only need to ask for the maximum solution that can be formed at each position, and we can get the solution to this problem.

Ask for the maximum solution for a location, such as i , as you can understand, find the largest segment [start,...,i,...end] from the array [0,...,n], and here In the segment, the height at position i is the lowest, then the area of ​​the combined matrix composed of this matrix must be (end-start) * heights[i]. So we have to find a section [start,...,i] on the left side of position i. Yes, the height of each matrix in this area is greater than or equal to the height of i. Similarly, we will find a section on the right side of i. ,...end], after finding this, the solution at position i can be found.

So, for each position, just find the position start on the left side of i that is less than the height of i, and then find the first position on the right side of i that is less than the height of i. And this data can be solved by two traversals.

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
Use an array leftLess to save the number of matrices whose height on the left side of each position is greater than the height of the current position, as well as rightLess. The specific solution method is: for position i, if the height at i-1 is greater than the height at i, then since leftLess[i-1] holds the number greater than the height at position i-1, the height of these positions is inevitable. Also greater than the height at position i, so we can skip 1 + leftLess[i-1] positions directly to determine if the height at the next position p is greater than the height at i, and if it is still greater, then continue to jump After leftLess[p] + 1 position, judge... until the height at p is less than the height at i, then the number of matrices on the left side of i that is higher than i is i - p - 1 One. The same is true for the solution of rightLess.
 
 
 
 * 
 */

public class doubletraversalmethod {

	public static int largestRectangleArea(int[] heights) {
	    int max = 0;
	    for (int i = 0; i < heights.length; i++) {
	        int min = heights[i];
	        for (int j = i; j >= 0; j--) {
	            if (heights[j] < min) {
	                min = heights[j];
	            }
	            max = Math.max(max, min * (i-j+1));
	        }
	    }
	    return max;
	}
	
	public static void main(String[] args) {
		int[] heights = {2,1,5,6,2,3};
		System.out.println(largestRectangleArea(heights));
	}
}
