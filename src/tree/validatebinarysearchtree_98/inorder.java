package tree.validatebinarysearchtree_98;

public class inorder {
	
	// in-order traversal recursively
	public boolean isValidBST(TreeNode root) {
	    Integer[] pre = {null};
	    boolean[] ret = {true};
	    isValid(root, pre, ret);
	    return ret[0];
	}

	private void isValid(TreeNode node, Integer[] pre, boolean[] ret) {
	    if (node != null) {
	        isValid(node.left, pre, ret);
	        if (pre[0] != null && pre[0] >= node.val) {
	             ret[0] = false;
	        }
	        pre[0] = node.val;
	        isValid(node.right, pre, ret);
	    }
	}
    
    public static void main(String[] args) {
		TreeNode root = new TreeNode(2);
		root.left=new TreeNode(1);
		/*root.left.left = null;
		root.left.right = null;*/
		root.right = new TreeNode(3);
		/*root.right.left = new TreeNode_old(6);
		root.right.right = new TreeNode_old(20);*/
		System.out.println(new inorder().isValidBST(root));
	}
}
