package tree.binarytreemindepth_111;

/**
https://leetcode.com/problems/minimum-depth-of-binary-tree/discuss/241008/Beats-100-easy-java-solution-in-9-line-simple-bruteforce-solution.
 */
class recursive {
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null){
           return minDepth(root.right)+1;
        }else if(root.right==null){
            return minDepth(root.left)+1;
        }else{
            return Math.min(minDepth(root.left),minDepth(root.right))+1;
        }
    }
   
	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.right = new TreeNode(20);
		root.left = new TreeNode(9);
		
		root.right.right = new TreeNode(7);
		root.right.right.right = new TreeNode(15);
		
		System.out.println(new recursive().minDepth(root));
	}
}