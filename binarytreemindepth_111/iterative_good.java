package binarytreemindepth_111;

import java.util.LinkedList;
import java.util.Queue;

public class iterative_good {

	// iteratively, BFS
	public int minDepth(TreeNode root) {
	    if (root == null) {
	        return 0;
	    }
	    Queue<TreeNode> queue = new LinkedList<>();
	    queue.add(root);
	    int depth = 1;
	    while (!queue.isEmpty()) {
	        int l = queue.size();
	        for (int i = 0; i < l; i++) {
	            TreeNode n = queue.poll();
	            if (n.left == null && n.right == null) {
	                return depth;
	            } 
	            if (n.left != null) {
	                queue.add(n.left);
	            }
	            if (n.right != null) {
	                queue.add(n.right);
	            }
	        }
	        depth++;
	    }
	    return depth;
	}
	   
		public static void main(String[] args) {
			TreeNode root = new TreeNode(3);
			root.right = new TreeNode(20);
			root.left = new TreeNode(9);
			
			root.right.right = new TreeNode(7);
			root.right.right.right = new TreeNode(15);
			
			System.out.println(new iterative_good().minDepth(root));
		}
}
