package tree.symmetrictree_101;

import java.util.Stack;

public class Practice {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(6);
    root.right = new TreeNode(3);
    root.right.right = new TreeNode(4);
    root.right.right.right = new TreeNode(5);
    root.right.right.right.right = new TreeNode(2);
    root.right.right.right.right.left = new TreeNode(1);

    root.left = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.left.left = new TreeNode(5);
    root.left.left.left.left = new TreeNode(2);
    root.left.left.left.left.right = new TreeNode(1);

    System.out.println(new Practice().isSymmetricTree(root));
  }

  private boolean isSymmetricTree(TreeNode root) {
    if(root==null) return false;
    Stack<TreeNode> stack = new Stack<TreeNode>();
    if(!push(root.left, root.right, stack))
      return false;
    while(!stack.isEmpty()) {
      TreeNode node1 = stack.pop();
      TreeNode node2 = stack.peek();
      if(!push(node1.left, node2.right, stack))
        return false;
      if(!push(node1.right, node2.left, stack))
        return false;
    }
    return true;
  }

  private boolean push(TreeNode left, TreeNode right, Stack<TreeNode> stack) {
    if(left==null || right==null) return left==right;
    if(left.val!=right.val) return false;
    stack.push(left);
    stack.push(right);
    return true;
  }


}
