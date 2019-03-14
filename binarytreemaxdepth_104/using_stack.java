package binarytreemaxdepth_104;

/*
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/discuss/34504/Accepted-Java-Solution_bestrecursive.-No-recursion.
 */

import java.util.LinkedList;
import java.util.Queue;

public class using_stack {

	public int maxDepth(TreeNode root) {
		if (root == null)
			return 0;

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		int count = 0;

		while (!queue.isEmpty()) {
			int size = queue.size();
			while (size-- > 0) {
				TreeNode node = queue.poll();

				if (node.left != null) {
					queue.add(node.left);
				}

				if (node.right != null) {
					queue.add(node.right);
				}
			}
			count++;
		}

		return count;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(2);
		root.left = new TreeNode(1);
		/*
		 * root.left.left = null; root.left.right = null;
		 */
		root.right = new TreeNode(3);
		/*
		 * root.right.left = new TreeNode_old(6); root.right.right = new
		 * TreeNode_old(20);
		 */
		System.out.println(new using_stack().maxDepth(root));
	}
}
