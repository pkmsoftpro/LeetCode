package bintreeconstructinorderpost_106;
/*
 * https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/discuss/34942/Concise-Java-Recursive-Solution_bestrecursive
 * 
 * 
    1. The Root of the tree is the last element in Postorder Array.
    2. Find the position of the Root in Inorder Array.
    3. Elements to the left of Root element in Inorder Array are the left
       subtree.
    4. Elements to the right of Root element in Inorder Array are the right
       subtree.
    5. Call recursively buildTree on the subarray composed by the elements
       in the left subtree. Attach returned left subtree root as left child
       of Root node.
    6. Call recursively buildTree on the subarray composed by the elements
       in the right subtree. Attach returned right subtree root as right
       child of Root node.
    7. return Root.


 */

import java.util.Arrays;

public class Solution {
	public TreeNode buildTree(int[] inorder, int[] postorder) {
		if(inorder==null || postorder==null || inorder.length==0 || postorder.length==0) return null;
		TreeNode root = new TreeNode(postorder[postorder.length-1]);
		if(postorder.length==1) return root;
		int rootindex = -1;
		for(int i=0;i<inorder.length;i++) { if(inorder[i]==root.val) { rootindex=i; break; } }
		int[] inordersubleft    = Arrays.copyOfRange(inorder, 0, rootindex);
		int[] inordersubright   = Arrays.copyOfRange(inorder, rootindex+1, inorder.length);
		int[] postordersubleft  = Arrays.copyOfRange(postorder, 0, rootindex);
		int[] postordersubright = Arrays.copyOfRange(postorder, rootindex, postorder.length-1);
		root.left  = buildTree(inordersubleft,postordersubleft);
		root.right = buildTree(inordersubright,postordersubright);
		return root;
	}
}
