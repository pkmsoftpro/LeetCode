package tree.binarytreeinvert;

public class Solution {
  
  public static void main(String[] args) {
    TreeNode root = new TreeNode(4);
    root.left = new TreeNode(2);
    root.right = new TreeNode(7);
    root.left.left = new TreeNode(1);
    root.left.right = new TreeNode(3);
    root.right.left = new TreeNode(6);
    root.right.right = new TreeNode(9);
    
    TreeNode invert = new Solution().invertTree(root);
    System.out.println(invert);
  }
  
  public TreeNode invertTree(TreeNode root) {
    
    if(root==null) 
      return null;
    TreeNode left = root.left, right = root.right;
    root.left = invertTree(right);
    root.right = invertTree(left);
    return root;
  }
}
