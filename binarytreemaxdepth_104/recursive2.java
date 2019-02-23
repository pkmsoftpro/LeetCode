package binarytreemaxdepth_104;
/*
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/discuss/34216/Simple-solution-using-Java
 */

public class recursive2 {
	
	public int maxDepth(TreeNode root) {
		return root==null?0:maxLeftandRight(root.left,root.right,1);
	}

	private int maxLeftandRight(TreeNode left,TreeNode right,int length){
	    if(left ==null && right==null){
	        return length;
	    }
	    length++;
	    if(left==null){
	        return maxLeftandRight(right.left,right.right,length);
	    }
	    if(right==null){
	        return maxLeftandRight(left.left,left.right,length);
	    }
	    return Math.max(maxLeftandRight(left.left,left.right,length),maxLeftandRight(right.left,right.right,length));
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(2);
		root.left=new TreeNode(1);
		/*root.left.left = null;
		root.left.right = null;*/
		root.right = new TreeNode(3);
		/*root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(20);*/
		System.out.println(new recursive2().maxDepth(root));
	}

}
