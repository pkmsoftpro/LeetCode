package constructtree_106;

import java.util.HashMap;
import java.util.Map;
import basenode.TreeNode;

public class Solution {
  int post = 0;
  
  public static void main(String args[]) {
    Solution tree = new Solution();

    int in[] = new int[] {1,9,2,3,15,20,7};
    int post[] = new int[] {1,2,9,15,7,20,3};
    
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for(int i=0; i<in.length; i++) {
      map.put(in[i], i);
    }

    tree.post = in.length-1;

    TreeNode root = tree.buildTree(post, in, 0, in.length-1, map);

    System.out.println(root);
  }

  public TreeNode buildTree(int[] postorder, int[] inorder, int sInx, int eInx, Map<Integer, Integer> map) {
    if(sInx>eInx) 
      return null;
    TreeNode root = new TreeNode(postorder[post--]);
    if(sInx==eInx) 
      return root;
    
    int breakInx = map.get(root.val);
    
    root.right = buildTree(postorder, inorder, breakInx+1, eInx, map);
    root.left = buildTree(postorder, inorder, sInx, breakInx-1, map);
    return root;
  }
}
