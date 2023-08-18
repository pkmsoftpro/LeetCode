package tree.binarytreelevelorder_102;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
    
    //System.out.println(new iterative().levelOrder(root));
    List<List<Integer>> lists = new ArrayList<List<Integer>>();
    new Practice().recurssive(root, 0, lists);
    System.out.println(lists);
  }
  
  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> lists = new ArrayList<List<Integer>>();
    if(root==null) return lists;
    Queue<TreeNode> q = new LinkedList<TreeNode>();
    q.offer(root);
    while (!q.isEmpty()) {
      int level = q.size();
      List<Integer> list = new ArrayList<Integer>();
      for(int i=0; i<level; i++) {
        if(q.peek().left!=null)
          q.offer(q.peek().left);
        if(q.peek().right!=null)
          q.offer(q.peek().right);
        list.add(q.poll().val);
      }
      lists.add(list);
    }
    return lists;
  }
  
  public void recurssive(TreeNode root, int height, List<List<Integer>> lists){
    if(root==null)
      return;
    if(lists.size()<=height) {
      lists.add(new ArrayList<Integer>());
    }
    lists.get(height).add(root.val);
    recurssive(root.left, height+1, lists);
    recurssive(root.right, height+1, lists);
  }
}
