package validatebinarysearchtree_98;

import java.util.Stack;

public class stack_iterate {

	public boolean isValidBST2(TreeNode root) {
	    Integer pre = null;
	    Stack<TreeNode> stack = new Stack<>();
	    while (true) {
	        while (root != null) {
	            stack.push(root);
	            root = root.left;
	        }
	        if (stack.isEmpty()) {
	            return true;
	        }
	        TreeNode node = stack.pop();
	        if (pre != null && pre >= node.val) {
	            return false;
	        }
	        pre = node.val;
	        root = node.right;
	    }
	}
    
    public static void main(String[] args) {
		TreeNode root = new TreeNode(2);
		root.left=new TreeNode(1);
		/*root.left.left = null;
		root.left.right = null;*/
		root.right = new TreeNode(3);
		/*root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(20);*/
		System.out.println(new stack_iterate().isValidBST2(root));
	}
}
