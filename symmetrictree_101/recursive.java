package symmetrictree_101;

public class recursive {
    public boolean isSymmetricTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        return isSymmetricTree(p.left, q.right) && isSymmetricTree(p.right, q.left);
    }
    
    public static void main(String[] args) {
		TreeNode root = new TreeNode(6);
		root.right = new TreeNode(3);
		root.right.right = new TreeNode(4);
		root.right.right.right = new TreeNode(5);
		root.right.right.right.right = new TreeNode(2);
		
		TreeNode root1 = new TreeNode(6);
		root1.left = new TreeNode(3);
		root1.left.left = new TreeNode(4);
		root1.left.left.left = new TreeNode(5);
		root1.left.left.left.left = new TreeNode(2);
		
		System.out.println(new recursive().isSymmetricTree(root, root1));
	}
    
}