package tree.binarytreebalanced_110;

public class Solution {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(3);
    root.right = new TreeNode(20);
    root.left = new TreeNode(9);
    
    root.right.right = new TreeNode(7);
    root.right.right.right = new TreeNode(15);
    
    System.out.println(new Solution().isBalanced(root));
}

  private boolean isBalanced(TreeNode root) {
    if(root==null) return true;
    
    int leftHeight = getHeight(root.left);
    int rightHeight = getHeight(root.right);
    
    if(Math.abs(leftHeight-rightHeight) >1) return false;
    
    return isBalanced(root.left) && isBalanced(root.right);
  }

  private int getHeight(TreeNode root) {
    if(root==null) return 0;
    
    return Math.max(getHeight(root.left), getHeight(root.right))+1;

  }
}
