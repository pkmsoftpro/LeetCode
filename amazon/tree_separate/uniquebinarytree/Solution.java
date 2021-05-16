package tree_separate.uniquebinarytree;

import tree_separate.TreeNode;

import java.util.List;

public class Solution {
  public static void main(String[] args) {
    int k = 3;
    System.out.println(new Solution().generateTrees(k));
  }

  public List<TreeNode> generateTrees(int n) {

    return null;
  }

  public TreeNode recursiveApproach(int k, int first, int last){

    for(int i=1; i<=k; i++){
      TreeNode node = new TreeNode(i);
      node.left = recursiveApproach(k, 1, i-1);
      node.right = recursiveApproach(k, i+1, k);
    }
    return null;
  }
}
