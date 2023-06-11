package tree.binarytreemaxdepth_104;

import java.util.Stack;

public class Practice {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(6);
    root.right = new TreeNode(3);
    root.right.right = new TreeNode(4);
    root.right.right.right = new TreeNode(5);
    root.right.right.right.right = new TreeNode(2);
    root.right.right.right.right.left = new TreeNode(1);

    root.left = new TreeNode(7);
    root.left.left = new TreeNode(8);
    root.left.left.left = new TreeNode(9);
    root.left.left.left.left = new TreeNode(10);
    root.left.left.left.left.right = new TreeNode(11);
    System.out.println(new Practice().maxDepth(root));
  }

  private int maxDepth(TreeNode root) {
    int maxDepth = 0;
    if (root == null)
      return 0;
    Stack<TreeNode> path = new Stack<TreeNode>();
    Stack<Integer> depth = new Stack<Integer>();
    depth.push(1);
    path.push(root);
    while (!path.isEmpty()) {
      TreeNode node = path.pop();
      int currentDepth = depth.pop();
      if (node.left == null && node.right == null)
        maxDepth = Math.max(maxDepth, currentDepth);
      if (node.left != null) {
        path.push(node.left);
        depth.push(currentDepth + 1);
      }
      if (node.right != null) {
        path.push(node.right);
        depth.push(currentDepth + 1);
      }
    }
    return maxDepth;
  }
}
