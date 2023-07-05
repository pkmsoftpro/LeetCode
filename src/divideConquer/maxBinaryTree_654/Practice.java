package divideConquer.maxBinaryTree_654;

import java.util.LinkedList;

public class Practice {

  public static void main(String[] args) {
    // int[] nums = {3, 2, 1, 6, 0, 5};
    int[] nums = {10, 8, 6, 4, 7};
    TreeNode tree = new Practice().constructMaximumBinaryTree(nums);
    System.out.println(tree);
  }
  
  
  
  public TreeNode constructMaximumBinaryTree(int[] nums) {
    LinkedList<TreeNode> lklist = new LinkedList<TreeNode>();
    for(int i=0; i<nums.length; i++) {
      TreeNode curr = new TreeNode(nums[i]);
      
      while(!lklist.isEmpty() && lklist.peekFirst().val<curr.val)
        curr.left = lklist.pop();
      
      if(!lklist.isEmpty())
        lklist.peekFirst().right = curr;
      
      lklist.addFirst(curr);
    }
    return lklist.peekLast();
  }
}
