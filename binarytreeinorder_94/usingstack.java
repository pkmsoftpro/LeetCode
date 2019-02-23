package binarytreeinorder_94;
/*
 * https://leetcode.com/problems/binary-tree-recursive-traversal/discuss/232725/Clean-stack-based-Java-iterative-solution-1ms
 */

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class usingstack {

	public List<Integer> inorderTraversal(TreeNode root) {
		
	    final List<Integer> list = new ArrayList<>();
	    if (root == null) {
	      return list;
	    }
	    
	    final Set<TreeNode> visitedRoots = new HashSet<TreeNode>();
	    final Deque<TreeNode> stack = new ArrayDeque<TreeNode>();
	    stack.addLast(root);
	    
	    while (!stack.isEmpty()) {
	      final TreeNode n = stack.removeLast();
	      if (visitedRoots.contains(n) || 
	          (n.left == null && n.right == null)) {
	        list.add(n.val);
	      } else {
	        if (n.right != null) {
	          stack.addLast(n.right);
	        }
	        
	        stack.addLast(n);
	        visitedRoots.add(n);
	        
	        if (n.left != null) {
	          stack.addLast(n.left);
	        }
	      }
	    }
	    
	    return list;
	  }
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left=null;
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(3);
		root.right.left.left = new TreeNode(4);
		System.out.println(new usingstack().inorderTraversal(root));
	}
}
