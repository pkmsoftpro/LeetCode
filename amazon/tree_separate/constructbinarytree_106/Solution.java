package tree_separate.constructbinarytree_106;

import tree_separate.TreeNode;

import java.util.Arrays;

public class Solution {
  public TreeNode buildTree(int[] in, int[] post) {
    if (in == null || post == null || in.length == 0 || post.length == 0) return null;
    TreeNode root = new TreeNode(post[post.length - 1]);
    int breakIndex = -1;

    for (int i = post.length - 1; i >= 0; i--) if (post[post.length - 1] == in[i]) breakIndex = i;
    int[] postLeftSub = Arrays.copyOfRange(post, 0, breakIndex);
    int[] postRightSub = Arrays.copyOfRange(post, breakIndex, post.length - 1);
    int[] inLeftSub = Arrays.copyOfRange(in, 0, breakIndex);
    int[] inRightSub = Arrays.copyOfRange(in, breakIndex + 1, in.length);
    root.right = buildTree(inRightSub, postRightSub);
    root.left = buildTree(inLeftSub, postLeftSub);
    return root;
  }

  public static void main(String[] args) {
    int[] preorder = {9, 3, 15, 20, 7}, inorder = {9, 15, 7, 20, 3};
    TreeNode node =
        new tree_separate.constructbinarytree_106.Solution().buildTree(preorder, inorder);
    System.out.println(node);
  }
}
