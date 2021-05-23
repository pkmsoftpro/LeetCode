package tree_separate.validatebinarysearchtree;

import tree_separate.TreeNode;

import java.util.Stack;

public class Solution {

  public static void main(String[] args) {
    TreeNode root = new TreeNode(3);
    root.left=new TreeNode(1);
		/*root.left.left = null;
		root.left.right = null;*/
    root.right=new TreeNode(4);
		/*root.right.left = new TreeNode_old(6);
		root.right.right = new TreeNode_old(20);*/
    System.out.println(new Solution().isValidBST(root));
  }

  public boolean isValidBST(TreeNode root){
    Stack<TreeNode> stack = new Stack<>();
    Integer pre = null;
    while(true){
      while(root!=null){
        stack.push(root);
        root = root.left;
      }
      if(stack.isEmpty()){
        return true;
      }
      TreeNode node = stack.pop();
      if(pre!=null && pre>=node.val){
        return false;
      }
      pre = node.val;
      root = node.right;
    }
  }
}
