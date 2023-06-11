package tree.validatebinarysearchtree_98;

import java.util.Stack;

public class Practice {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(2);
    root.left=new TreeNode(1);
    root.right = new TreeNode(4);
    root.right.left = new TreeNode(3);
    root.right.right = new TreeNode(20);
    Stack<TreeNode> stack = new Stack<TreeNode>();
    System.out.println(new Practice().isValid(root, stack, null));
  }

  private boolean isValid(TreeNode root, Stack<TreeNode> stack, Integer pre) {
    while(true) {
      while(root!=null) {
        stack.push(root);
        root = root.left;
      }
      if(stack.isEmpty())
        return true;
      TreeNode node = stack.pop();
      if(pre!=null && pre>=node.val)
        return false;
      pre = node.val;
      root = node.right;
    }
  }
}