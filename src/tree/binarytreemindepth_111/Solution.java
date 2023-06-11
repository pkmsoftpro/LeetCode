package tree.binarytreemindepth_111;

public class Solution {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(3);
    root.right = new TreeNode(20);
    root.left = new TreeNode(9);
    root.left.left = new TreeNode(9);
    
    root.right.right = new TreeNode(7);
    root.right.right.right = new TreeNode(15);
    
    System.out.println(new Solution().minDepth(root));
  }

  private int minDepth(TreeNode root) {
    if(root==null) return 0;
    if(root.left!=null) return minDepth(root.left)+1;
    if(root.right!=null) return minDepth(root.right)+1;
    return Math.min(minDepth(root.left), minDepth(root.right))+1;
  }
}
