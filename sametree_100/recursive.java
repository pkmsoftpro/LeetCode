package sametree_100;

/*
 * https://leetcode.com/problems/same-tree/discuss/32977/Another-passed-Java-solution
 */

public class recursive {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
    
    public static void main(String[] args) {
		TreeNode root = new TreeNode(6);
		root.right = new TreeNode(3);
		root.right.right = new TreeNode(4);
		root.right.right.right = new TreeNode(5);
		root.right.right.right.right = new TreeNode(2);
		
		System.out.println(new recursive().isSameTree(root, root));
	}
    
}