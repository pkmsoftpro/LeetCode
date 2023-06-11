package tree.binarytreeinorder_94;

public class InOrder {
	
	public static void inorderTraversal(TreeNode node) {
		if(node==null) return;
		inorderTraversal(node.left);
		System.out.println(node.val);
		inorderTraversal(node.right);
	}
	
	

	public static void main(String[] args) {
		TreeNode root = new TreeNode(8);
		root.left=new TreeNode(5);
		root.left.right=new TreeNode(9);
		root.left.left=new TreeNode(2);
		root.right = new TreeNode(1);
		root.right.right = new TreeNode(6);
		root.right.left = new TreeNode(3);
		//root.right.left.left = new TreeNode_old(4);
		inorderTraversal(root);
	}
}
