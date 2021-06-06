package tree_separate.constructbinarytree_105;

import tree_separate.TreeNode;

import java.util.HashMap;
import java.util.Map;


public class Solution {
  public static void main(String[] args) {
    //int[] preorder = {3, 9, 20, 15, 7}, inorder = {9, 3, 15, 20, 7};
    int[] preorder = {1,2,4,8,9,5,10,11,3,6,12,14,7,15,18},
            inorder = {8,4,9,2,10,5,11,1,12,6,14,3,15,7,18};
    TreeNode node = new Solution().buildTree(preorder, inorder);
    System.out.println(node);
  }

  public TreeNode buildTree(int[] preorder, int[] inorder) {
    Map<Integer, Integer> inMap = new HashMap<>();
    for(int i=0; i<inorder.length; i++){
      inMap.put(inorder[i], i);
    }
    return buildIt(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1, inMap);
  }

  public TreeNode buildIt(int[] preorder, int preStart, int preEn, int[] inorder, int inStart, int inEn, Map<Integer, Integer> map){
    if(preStart>preEn || inStart>inEn) return null;
    TreeNode root = new TreeNode(preorder[preStart]);
    int inRoot = map.get(preorder[preStart]);
    int nums = inRoot-inStart;

    root.left = buildIt(preorder, preStart+1, preStart+nums, inorder, inStart, inRoot-1, map);
    root.right = buildIt(preorder, preStart+nums+1, preEn, inorder, inRoot+1, inEn, map);
    return root;
  }

}
