package tree.symmetrictree_101;

/*
 * https://leetcode.com/problems/symmetric-tree/discuss/33217/Java-Iterative-Solution_bestrecursive%3A-concise-and-easy
 */

import java.util.Stack;

public class using_stack {

	public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        Stack<TreeNode> stack = new Stack<>();
        if(!pushToStack(root.left, root.right, stack))
            return false;
        
        while(!stack.isEmpty()){
            TreeNode left = stack.pop();
            TreeNode right = stack.pop();
            if(!pushToStack(left.left, right.right, stack))
                return false;
            if(!pushToStack(left.right, right.left, stack))
                return false;
        }
        
        return true;
    }
    
    public boolean pushToStack(TreeNode n1, TreeNode n2, Stack<TreeNode> stack){
        if(n1==null || n2==null) return n1==n2;
        if(n1.val!=n2.val) return false;
        stack.push(n1);
        stack.push(n2);
        return true;
    }
    
    public static void main(String[] args) {
		TreeNode root = new TreeNode(6);
		root.right = new TreeNode(3);
		root.right.right = new TreeNode(4);
		root.right.right.right = new TreeNode(5);
		root.right.right.right.right = new TreeNode(2);
		root.right.right.right.right.left = new TreeNode(1);
		
		root.left = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.left.left = new TreeNode(5);
		root.left.left.left.left = new TreeNode(2);
		root.left.left.left.left.right = new TreeNode(1);
		
		System.out.println(new using_stack().isSymmetric(root));
	}

}
