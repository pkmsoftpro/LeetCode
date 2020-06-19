package constructtree_105;

import java.util.HashMap;
import java.util.Map;
import basenode.TreeNode;

public class BinaryTree {
  int preorder = 0;
  public static void main(String args[]) 
  { 
      BinaryTree tree = new BinaryTree(); 

      int in[] = new int[] { 9, 8, 4, 2, 10, 5, 1, 6, 3, 13, 12, 7 }; 
      int pre[] = new int[] { 1, 2, 4, 8, 9, 5, 10, 3, 6, 7, 12, 13 }; 
      
      Map<Integer, Integer> map = new HashMap<Integer, Integer>();
      for(int i=0; i<in.length; i++) {
        map.put(in[i], i);
      }

      TreeNode root = tree.buildTree(pre, in, 0, in.length-1, map); 
      System.out.println(root);
  }

  public TreeNode buildTree(int[] pre, int[] in, int strInx, int eInx, Map<Integer, Integer> map) {
    if(strInx>eInx) return null;
    TreeNode root = new TreeNode(pre[preorder++]);
    if(strInx == eInx) return root;
    
    int breakIndex = map.get(root.val);
    
    root.left = buildTree(pre, in, strInx, breakIndex-1, map);
    root.right = buildTree(pre, in, breakIndex+1, eInx, map);
    
    return root;
  }
}
