package bintreeconstructpreorderin_105;

import java.util.HashMap;
import java.util.Map;

/*
 * https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/discuss/34541/5ms-Java-Clean-Solution-with-Caching
 */

public class sol_yavinci_best {

	public static void main(String[] args) {
		int[] preorder = { 4, 2, 1, 3, 6, 5, 7 };
		int[] inorder = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(new sol_yavinci_best().buildTree(preorder, inorder));
	}

	public TreeNode buildTree(int[] preorder, int[] inorder) {
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<inorder.length;i++){
			map.put(inorder[i], i);
		}
		return buildTree(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1, map);
	}

	public TreeNode buildTree(int[] preorder, int preStart, int preEnd,
			int[] inorder, int inStart, int inEnd, Map<Integer, Integer> inMap) {
		
		if(preStart>preEnd || inStart>inEnd) return null;
		
		TreeNode root = new TreeNode(preorder[preStart]);
		int inRoot = inMap.get(preorder[preStart]);
		int nums = inRoot-inStart;
		
		root.left = buildTree(preorder, preStart+1,preStart+nums, inorder, inStart,inRoot-1,inMap);
		root.right = buildTree(preorder, preStart+nums+1, preEnd, inorder, inRoot+1, inEnd, inMap);
		return root;
	}
}
