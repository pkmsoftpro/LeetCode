package tree.binarytreeinvert;

import java.util.Stack;

public class IterativeSolution {

  public static void main(String[] args) {
    TreeNode root = new TreeNode(4);
    root.left = new TreeNode(2);
    root.right = new TreeNode(7);
    root.left.left = new TreeNode(1);
    root.left.right = new TreeNode(3);
    root.right.left = new TreeNode(6);
    root.right.right = new TreeNode(9);
    
    TreeNode invert = new IterativeSolution().invertTree(root);
    System.out.println(invert);
  }

  private TreeNode invertTree(TreeNode root) {
    if(root==null) return null;
    Stack<TreeNode> stack = new Stack<TreeNode>();
    stack.push(root);
    while(!stack.isEmpty()) {
      TreeNode node = stack.pop();
      TreeNode left = node.left, right = node.right;
      node.left = right;
      node.right = left;
      if(left!=null) stack.push(left);
      if(right!=null) stack.push(right);
    }
    return root;
  }
}
