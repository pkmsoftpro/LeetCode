package tree.binarytreeinorder_94;
/*
 * https://leetcode.com/problems/binary-tree-bruteforce-traversal/discuss/232725/Clean-stack-based-Java-iterative-solution-1ms
 */

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class usingstack {

	public List<Integer> inorderTraversal(TreeNode_old root) {
		
	    final List<Integer> list = new ArrayList<>();
	    if (root == null) {
	      return list;
	    }
	    
	    final Set<TreeNode_old> visitedRoots = new HashSet<TreeNode_old>();
	    final Deque<TreeNode_old> stack = new ArrayDeque<TreeNode_old>();
	    stack.addLast(root);
	    
	    while (!stack.isEmpty()) {
	      final TreeNode_old n = stack.removeLast();
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
	public List<Integer> inorderTraversal2(TreeNode_old root) {
		List list = new ArrayList();
		Stack<TreeNode_old> stack = new Stack();
		List visit = new ArrayList();
		stack.push(root);
		while(!stack.isEmpty()){
			TreeNode_old node = stack.pop();
			if(visit.contains(node) || (node.left==null && node.right==null)){
				list.add(node.val);
			} else {
				if(node.right!=null){
					stack.push(node.right);
				}
				visit.add(node);
				stack.push(node);
				if(node.left!=null){
					stack.push(node.left);
				}
			}
		}
		return list;
	}
	public static void main(String[] args) {
		TreeNode_old root = new TreeNode_old(1);
		root.left=null;
		root.right = new TreeNode_old(2);
		root.right.left = new TreeNode_old(3);
		root.right.left.left = new TreeNode_old(4);
		System.out.println(new usingstack().inorderTraversal(root));
	}
}
