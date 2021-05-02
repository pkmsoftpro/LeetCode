package tree_separate.binarytreeinordertravel;

import tree_separate.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> list = new ArrayList<>();

    list = inOrderStack(root, list);

    return list;
  }

  /*
  Solution Using STACK:
  1) Create an empty stack S.
  2) Initialize current node as root
  3) Push the current node to S and set current = current->left
      until current is NULL
  4) If current is NULL and stack is not empty then
     a) Pop the top item from stack.
     b) Print the popped item, set current = popped_item->right
     c) Go to step 3.
  5) If current is NULL and stack is empty then we are done.
   */
  public List<Integer> inOrderStack(TreeNode head, List list) {
    Stack<TreeNode> stack = new Stack<>();
    TreeNode current = head;
    while(!stack.isEmpty() || current!=null){
      while(current!=null){
        stack.push(current);
        current = current.left;
      }
      current = stack.pop();
      list.add(current.val);
      current = current.right;
    }
    return list;
  }

  public List<Integer> inOrder(TreeNode head, List list) {
    if (head != null) {
      inOrder(head.left, list);
      list.add(head.val);
      inOrder(head.right, list);
    }
    return list;
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(8);
    root.left = new TreeNode(5);
    root.left.right = new TreeNode(9);
    root.left.left = new TreeNode(2);
    root.right = new TreeNode(1);
    root.right.right = new TreeNode(6);
    root.right.left = new TreeNode(3);

    System.out.println(new Solution().inorderTraversal(root));
  }
}
