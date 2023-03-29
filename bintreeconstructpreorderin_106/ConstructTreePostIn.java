package bintreeconstructinorderpost_106;

import java.util.Arrays;

public class ConstructTreePostIn {

  public static void main(String[] args) {
    
//    int[] postOrder = {3,5,4,7,6,15,20,16,22,21,8};
//    int[] inOrder =   {3,4,5,6,7,8,15,16,20,21,22};
    int[] postOrder = {9,15,7,20,3};
    int[] inOrder =   {9,3,15,20,7};
    
    TreeNode treeNode = new ConstructTreePostIn().buildTree(postOrder, inOrder);
    System.out.println(treeNode);
  }

  public TreeNode buildTree(int[] postOrder, int[] inOrder) {
    if(postOrder==null || inOrder==null || postOrder.length==0 || inOrder.length==0)
      return null;
    
    int pivot = -1;
    int rootElement = postOrder[postOrder.length-1];
    
    for(int i=0; i<inOrder.length; i++)
      if(rootElement == inOrder[i]) {
        pivot = i;
        break;
      }
    
    int elementRight = inOrder.length - pivot -1;
    int elementLeft = pivot;
    
    TreeNode root = new TreeNode(rootElement);
    
    root.right = buildTree(Arrays.copyOfRange(postOrder,postOrder.length-elementRight-1,  postOrder.length-1),
                           Arrays.copyOfRange(inOrder, pivot+1, inOrder.length));
    root.left = buildTree(Arrays.copyOfRange(postOrder,0, elementLeft),
                           Arrays.copyOfRange(inOrder, 0, elementLeft));
    
    return root;
  }
}
