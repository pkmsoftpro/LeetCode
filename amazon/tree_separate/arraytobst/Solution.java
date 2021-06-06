package tree_separate.arraytobst;

import tree_separate.TreeNode;

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
