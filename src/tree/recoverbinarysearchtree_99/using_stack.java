package tree.recoverbinarysearchtree_99;



/*
 * https://leetcode.com/problems/recover-binary-search-tree/discuss/32607/Beat-99-Fast-Java-Solution_bestrecursive-O(h)-Space-with-Explanation
 */

import java.util.Deque;
import java.util.LinkedList;

public class using_stack {

	public void recoverTree(TreeNode root) {
		TreeNode pre = null, first = null, second = null;
		Deque<TreeNode> stack = new LinkedList<TreeNode>();
		while (root != null) {
			stack.push(root);
			root = root.left;
		}
		while (!stack.isEmpty()) {
			TreeNode temp = stack.pop();
			if (pre != null)
				if (pre.val > temp.val) {
					if (first == null)
						first = pre;
					second = temp;
				}
			pre = temp;
			if (temp.right != null) {
				temp = temp.right;
				while (temp != null) {
					stack.push(temp);
					temp = temp.left;
				}
			}
		}

		int temp = first.val;
		first.val = second.val;
		second.val = temp;
	}
}
