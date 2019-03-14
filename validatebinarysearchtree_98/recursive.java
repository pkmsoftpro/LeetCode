package validatebinarysearchtree_98;

/*
 * https://leetcode.com/problems/validate-binary-search-tree/discuss/32307/Java-recursive-and-iterative-solutions.
 */

public class recursive {
    public boolean isValidBST(TreeNode root, Integer min, Integer max) {
    	if(root==null){
    		return true;
    	}
    	if((min!=null && min>=root.val) || (max!=null && max<=root.val)){
    		return false;
    	}
        return isValidBST(root.right, root.val,max) && isValidBST(root.left, min, root.val);
    }
    
    public static void main(String[] args) {
		TreeNode root = new TreeNode(2);
		root.left=new TreeNode(1);
		/*root.left.left = null;
		root.left.right = null;*/
		root.right = new TreeNode(3);
		/*root.right.left = new TreeNode_old(6);
		root.right.right = new TreeNode_old(20);*/
		System.out.println(new recursive().isValidBST(root, null, null));
	}
}
