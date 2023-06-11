package tree.binaryTreePrePost_889;

import java.util.HashMap;
import java.util.Map;

public class Solution {
  int index = 0;

  
  public static void main(String[] args) {
    int[] preOrder = {1,2,4,8,9,5,10,11,3,6,12,14,7,20,21};
    int[] postOrder = {8,9,4,10,11,5,2,12,14,6,20,21,7,3,1};

    System.out.println(new Solution().constructFromPrePost(preOrder, postOrder));
  }


  private TreeNode constructFromPrePost(int[] preOrder, int[] postOrder) {
    
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for(int i=0; i<postOrder.length; i++) {
      map.put(postOrder[i], i);
    }
    TreeNode root = buildTree(preOrder, map, 0, preOrder.length-1);
    return root;
  }


  private TreeNode buildTree(int[] preOrder, Map<Integer, Integer> map, int start, int en) {
    if(start>en)
      return null;
    TreeNode root = new TreeNode(preOrder[index++]);
    if(start==en)
      return root;
    int pivot = map.get(preOrder[index]);
    root.left = buildTree(preOrder, map, start, pivot);
    root.right = buildTree(preOrder, map, pivot+1, en-1);
    return root;
  }
}
