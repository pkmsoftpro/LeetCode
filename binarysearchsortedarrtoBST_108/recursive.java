package binarysearchsortedarrtoBST_108;

/*
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/discuss/35431/Simple-Recursive-Java-Solution_bestrecursive
 */

public class recursive {
    public TreeNode sortedArrayToBST(int[] num) {
		if(num==null || num.length==0) return null;
		return buildTree(num, 0, num.length-1);
	}
	public TreeNode buildTree(int[] num, int start, int end) {
		int middle = (start+end)/2;
		int rootval = num[middle];
		TreeNode root = new TreeNode(rootval);
		if(start<middle) root.left=buildTree(num, start, middle-1);
		if(middle<end) root.right=buildTree(num,middle+1,end);
		return root;
	}

	public static void main(String[] args) {
		int[] nums = {-10,-3,0,5,9};
		TreeNode n = new recursive().sortedArrayToBST(nums);
		System.out.println(n);
	}
}
