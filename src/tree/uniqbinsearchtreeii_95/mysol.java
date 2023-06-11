package tree.uniqbinsearchtreeii_95;

import java.util.ArrayList;
import java.util.List;

public class mysol {

  public static void main(String[] args) {
    System.out.println(new mysol().generateTrees(3));
}

  public List<TreeNode> generateTrees(int n) {
    List<TreeNode> list = generateTree(1, n);
    return list;
  }
  
  
  public List<TreeNode> generateTree(int s, int e) {
    List<TreeNode> list = new ArrayList<TreeNode>();
    if(s>e) {
      list.add(null);
      return list;
    }
    for(int i=s; i<=e; i++) {
      TreeNode root = new TreeNode(i);
      
      for(TreeNode left : generateTree(s, i-1)) {
        for(TreeNode right : generateTree(i+1, e)) {
          root.left = left;
          root.right = right;
          list.add(root);
        }
      }
    }
    return list;
  }
}
