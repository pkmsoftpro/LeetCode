package tree_separate.recoverbinarysearchtree;

import tree_separate.TreeNode;

import java.util.*;

public class Solution {

  TreeNode firstElement = null;
  TreeNode secondElement = null;
  TreeNode pre = new TreeNode(Integer.MIN_VALUE);

  public static void main(String[] args) {
    /*TreeNode root = new TreeNode(6);
    root.right = new TreeNode(3);
    root.right.right = new TreeNode(4);
    root.right.right.right = new TreeNode(5);
    root.right.right.right.right = new TreeNode(2);*/

    TreeNode root = new TreeNode(4);
    root.left = new TreeNode(2);
    root.right = new TreeNode(2);
    root.left.left = new TreeNode(1);
    root.left.right = new TreeNode(5);
    root.right.left = new TreeNode(5);
    root.right.right = new TreeNode(1);
    root.right.right.right = new TreeNode(1);
    //System.out.println("Before change: " + root);
    //new Solution().morrisTraversal(root);
    // System.out.println("After change: " + root);
    //System.out.println(new Solution().isSymmetric(root));
    //List<List<Integer>> list = new Solution().levelOrderRecursive(root);

    System.out.println(new Solution().maxDepth(root));
  }

  public int maxDepthRecursive(TreeNode root) {
    return root==null?0:Math.max(maxDepth(root.left), maxDepth(root.right))+1;
  }

  public int maxDepth(TreeNode root) {
    int max=0;
    if(root==null) return 0;
    Stack<TreeNode> path = new Stack<>();
    Stack<Integer> curDep = new Stack<>();
    path.push(root);
    curDep.push(1);
    while (!path.isEmpty()) {
      TreeNode current = path.pop();
      int cDep = curDep.pop();
      if(current.left==null && current.right==null) max = Math.max(max, cDep);
      else {
        if(current.left!=null){
          path.push(current.left);
          curDep.push(cDep+1);
        }
        if (current.right != null) {
          path.push(current.right);
          curDep.push(cDep+1);
        }
      }
    }
    return max;
  }

  public List<List<Integer>> levelOrderRecursive(TreeNode root) {
    List<List<Integer>> allList = new ArrayList<>();
    recursive(allList, root, 0);
    return allList;
  }

  public void recursive(List<List<Integer>> res, TreeNode root, int height){
    if(root==null) return;
    if(height>=res.size()){
      res.add(new ArrayList<>());
    }
    res.get(height).add(root.val);
    recursive(res, root.left, height+1);
    recursive(res, root.right, height+1);
  }

  public List<List<Integer>> levelOrderIterative(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();
    List<List<Integer>> allList = new ArrayList<>();
    if(root==null) return allList;
    queue.add(root);
    while(!queue.isEmpty()){
      int curSize = queue.size();
      List<Integer> list = new ArrayList<>();
      for(int i=0; i<curSize; i++){
        TreeNode node = queue.poll();
        if(node.left!=null) queue.add(node.left);
        if(node.right!=null) queue.add(node.right);
        list.add(node.val);
      }
      allList.add(list);
    }
    return allList;
  }

  public boolean isSymmetric(TreeNode root) {
    if(root==null) return true;
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root.left);
    stack.push(root.right);
    while (!stack.isEmpty()){
      if(!valid(stack))
        return false;
    }
    return true;
  }

  public boolean valid(Stack<TreeNode> stack){
    TreeNode p1 = stack.pop();
    TreeNode p2 = stack.pop();
    if(p1!=null && p2!=null){
      stack.push(p1.left);
      stack.push(p2.right);
      stack.push(p1.right);
      stack.push(p2.left);
    }
    if(p1==null && p2==null) return true;
    if(p1==null || p2==null) return false;
    if(p1.val != p2.val) return false;
    return true;
  }

  public void morrisTraversal(TreeNode root){
    while(root!=null){
      if(root.left!=null){
        TreeNode pre = root;
        pre = pre.left;
        while(pre.right!=null && pre.right!=root){
          pre = pre.right;
        }
        if(pre.right==null){
          pre.right = root;
          root = root.left;
        } else {
          pre.left = null;
          System.out.println(root.val);
          root = root.right;
        }
      } else {
        System.out.println(root.val);
        root = root.right;
      }

    }
  }
}
