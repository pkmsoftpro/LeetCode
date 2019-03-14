package validatebinarysearchtree_98;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class stack_iterative2 {
	private boolean isValidBST(TreeNode root) {
		if(root==null){
			return true;
		}
		Integer[] val = {null};
		Stack<TreeNode> stack = new Stack<TreeNode>();
		List<Integer> visit = new ArrayList<Integer>();
		stack.push(root);
		while(!stack.isEmpty()){
			TreeNode node = stack.pop();
			if(visit.contains(node.val) || (node.right==null && node.left==null)){
				if(val[0]!=null && val[0]>=node.val) return false;
				else val[0] = node.val;
			} else {
				if(node.right != null){
					stack.push(node.right);
				}
				visit.add(node.val);
				stack.push(node);
				if(node.left!=null){
					stack.push(node.left);
				}
			}
		}
		return true;
	}	
    
    public static void main(String[] args) {
		TreeNode root = new TreeNode(2);
		root.left=new TreeNode(1);
		/*root.left.left = null;
		root.left.right = null;*/
		root.right = new TreeNode(3);
		/*root.right.left = new TreeNode_old(6);
		root.right.right = new TreeNode_old(20);*/
		System.out.println(new stack_iterative2().isValidBST(root));
	}
}
