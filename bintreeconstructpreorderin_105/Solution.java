package bintreeconstructpreorderin_105;

/*
 * https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/discuss/34744/Concise-Java-Recursive-Solution_bestrecursive
 * 
 * 
    1. The Root of the tree is the first element in Preorder Array.
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

	public TreeNode buildTree(int[] preorder, int[] inorder) {
		if(preorder==null || inorder==null || inorder.length==0 || preorder.length==0) return null;
		TreeNode root = new TreeNode(preorder[0]);
		if(preorder.length==1) return root;
		int breakindex = -1;
		for(int i=0;i<inorder.length;i++) { if(inorder[i]==preorder[0]) { breakindex=i; break;} }
		int[] subleftpre  = Arrays.copyOfRange(preorder,1,breakindex+1);
		int[] subleftin   = Arrays.copyOfRange(inorder,0,breakindex);
		int[] subrightpre = Arrays.copyOfRange(preorder,breakindex+1,preorder.length);
		int[] subrightin  = Arrays.copyOfRange(inorder,breakindex+1,inorder.length);
		root.left  = buildTree(subleftpre,subleftin);
		root.right = buildTree(subrightpre,subrightin);
		return root;
	}

	public static void main(String[] args) {
		int[] preorder = {3,9,20,15,7};
		int[] inorder = {9,3,15,20,7};
		System.out.println(new Solution().buildTree(preorder, inorder));
	}
}
