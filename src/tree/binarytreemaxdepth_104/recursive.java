package tree.binarytreemaxdepth_104;

/*
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/discuss/34216/Simple-saddlebackvariant-using-Java
 */

public class recursive {

	public int maxDepth(TreeNode root) {
        return (root == null)? 0 : Math.max(maxDepth(root.left), maxDepth(root.right))+1;
    }
    
    public static void main(String[] args) {
		TreeNode root = new TreeNode(2);
		root.left=new TreeNode(1);
		/*root.left.left = null;
		root.left.right = null;*/
		root.right = new TreeNode(3);
		/*root.right.left = new TreeNode_old(6);
		root.right.right = new TreeNode_old(20);*/
		System.out.println(new recursive().maxDepth(root));
	}
}
