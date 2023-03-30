package binarysearchsortedarrtoBST_108;

/*
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/discuss/35431/Simple-Recursive-Java-Solution_bestrecursive
 * (f+s)/2 is same as (s+(f-s))/2
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

//mySolution:
public class Solution {
  public TreeNode sortedArrayToBST(int[] nums) {
    return buildBalancedTree(nums, 0, nums.length-1);
  }

  public TreeNode buildBalancedTree(int[] nums, int s, int f){
    if(s>f) return null;
    int breakIndex = s + (f-s)/2;
    TreeNode root = new TreeNode(nums[breakIndex]);
    root.left = buildBalancedTree(nums, s, breakIndex-1);
    root.right = buildBalancedTree(nums, breakIndex+1, f);
    return root;
  }

  public static void main(String[] args) {
    int[] nums = {-10, -3, 0, 5, 9};
    System.out.println(new Solution().sortedArrayToBST(nums));
  }
}
