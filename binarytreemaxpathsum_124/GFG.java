package binarytreemaxpathsum_124;

/**
https://www.geeksforgeeks.org/find-maximum-path-sum-in-a-binary-tree/

video: https://www.youtube.com/watch?v=peyO-Nu1jGc


very important video, it gives a way to visualize tree recursion in the stack of memory

visualize call hierarchy
 */


class Solution {
    class Res { 
	    public int val; 
    } 
    
    public int maxPathSum(TreeNode root) {
        Res res = new Res(); 
		res.val = Integer.MIN_VALUE;
        findMaxUtil(root,res); 
        return res.val;
    }
    int findMaxUtil(TreeNode node, Res res) 
	{ 

		// Base Case 
		if (node == null) 
			return 0; 

		// l and r store maximum path sum going through left and 
		// right child of root respectively 
		int l = findMaxUtil(node.left, res); 
		int r = findMaxUtil(node.right, res); 

		// Max path for parent call of root. This path must 
		// include at-most one child of root 
		int max_single = Math.max(Math.max(l, r) + node.val, 
								node.val); 


		// Max Top represents the sum when the Node under 
		// consideration is the root of the maxsum path and no 
		// ancestors of root are there in max sum path 
		int max_top = Math.max(max_single, l + r + node.val); 

		// Store the Maximum Result. 
		res.val = Math.max(res.val, max_top); 

		return max_single; 
	} 
}