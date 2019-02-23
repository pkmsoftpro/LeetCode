package binarysearchsortedarrtoBST_108;

/*
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/discuss/35218/Java-Iterative-Solution_bestrecursive
 */

import java.util.Stack;

public class iterative_trytodoityourself {
	
    private static class MyNode {
        TreeNode node;
        int leftBound, rightBound;
        public MyNode(TreeNode node, int left, int right) {
            this.node = node;
            this.leftBound = left;
            this.rightBound = right;
        }
        
        public String toString(){
        	return "<" + toStringNotNull() + ">";
        }

		private String toStringNotNull() {
			String retVal = "";
			retVal = retVal+ (this.node==null?"E":this.node.val);
			retVal = retVal + " " + leftBound + " " + rightBound;
			return retVal;
		}
    }

	// Iterative version
    public static TreeNode sortedArrayToBST_Iterative_DFS(int[] nums) {
        if (nums == null || nums.length == 0)
            return null;

        TreeNode root = new TreeNode(0); // We start with zero as default
        Stack<MyNode> stack = new Stack<>();

        MyNode node = new MyNode(root, 0, nums.length - 1);
        stack.push(node);

        while (!stack.isEmpty()) {
            MyNode cur = stack.pop();
            int mid = cur.leftBound + (cur.rightBound - cur.leftBound) / 2;
            cur.node.val = nums[mid];

            if (cur.leftBound < mid) {
                cur.node.left = new TreeNode(0);
                stack.push(new MyNode(cur.node.left, cur.leftBound, mid - 1));
            }

            if (cur.rightBound > mid) {
                cur.node.right = new TreeNode(0);
                stack.push(new MyNode(cur.node.right, mid + 1, cur.rightBound));
            }
        }
        return root;
    }
    


	public static void main(String[] args) {
		int[] nums = {-10,-3,0,5,9};
		TreeNode n = new iterative_trytodoityourself().sortedArrayToBST_Iterative_DFS(nums);
		System.out.println(n);
	}
}
