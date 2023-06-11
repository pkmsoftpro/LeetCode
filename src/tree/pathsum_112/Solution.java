package tree.pathsum_112;

public class Solution {
  
  public boolean hasPathSum(TreeNode root, int targetSum) {
    return sumn(root, targetSum);
  }
  
  public boolean sumn(TreeNode root, int targetSum) {
    if(root==null) return false;
    if(root.left==null && root.right==null && targetSum-root.val==0) return true;

    return sumn(root.left, targetSum) || sumn(root.right, targetSum);
  }
  
  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(2);
//    root.left = new TreeNode(9);
//    
//    root.right.right = new TreeNode(7);
//    root.right.right.right = new TreeNode(15);
    
    System.out.println(new Solution().hasPathSum(root, 1)); 
}
}
