package divideConquer.maxBinaryTree_654;

import java.util.LinkedList;

public class Solution {
  public TreeNode constructMaximumBinaryTree1(int[] nums) {
    TreeNode tree = construct(nums, 0, nums.length - 1);
    return tree;
  }

  public TreeNode construct(int[] nums, int st, int en) {
    if (st > en)
      return null;
    int maxIndex = 0;
    int maxNum = Integer.MIN_VALUE;
    for (int i = st; i <= en; i++)
      if (maxNum < nums[i]) {
        maxNum = Math.max(maxNum, nums[i]);
        maxIndex = i;
      }

    TreeNode root = new TreeNode(nums[maxIndex]);
    root.left = construct(nums, st, maxIndex - 1);
    root.right = construct(nums, maxIndex + 1, en);
    return root;
  }

  public TreeNode constructMaximumBinaryTree(int[] nums) {
    LinkedList<TreeNode> lklist = new LinkedList<>();
    for (int num : nums) {
      TreeNode cur = new TreeNode(num);
      while (!lklist.isEmpty() && lklist.peekFirst().val < cur.val) {
        cur.left = lklist.pop();
      }

      if (!lklist.isEmpty()) {
        lklist.peekFirst().right = cur;
      }
      lklist.push(cur);
    }

    return lklist.peekLast();
  }

  public static void main(String[] args) {
    // int[] nums = {3, 2, 1, 6, 0, 5};
    int[] nums = {10, 8, 6, 4, 7};
    TreeNode tree = new Solution().constructMaximumBinaryTree(nums);
    System.out.println(tree);
  }
}
