package tree.uniqbinsearchtreeii_95;

/*
 * https://leetcode.com/problems/unique-binary-search-trees-ii/discuss/31493/Java-bruteforce-with-DP
 */

import java.util.ArrayList;
import java.util.List;

public class iterative_dontconsider {

	public static List<TreeNode> generateTrees(int n) {
		
		List<TreeNode>[] result = new List[n + 1];
	    result[0] = new ArrayList<TreeNode>();
	    if (n == 0) {
	        return result[0];
	    }

	    result[0].add(null);
	    for (int len = 1; len <= n; len++) {
	        result[len] = new ArrayList<TreeNode>();
	        for (int j = 0; j < len; j++) {
	            for (TreeNode nodeL : result[j]) {
	                for (TreeNode nodeR : result[len - j - 1]) {
	                    TreeNode node = new TreeNode(j + 1);
	                    node.left = nodeL;
	                    node.right = clone(nodeR, j + 1);
	                    result[len].add(node);
	                }
	            }
	        }
	    }
	    return result[n];
	}

	private static TreeNode clone(TreeNode n, int offset) {
	    if (n == null) {
	        return null;
	    }
	    TreeNode node = new TreeNode(n.val + offset);
	    node.left = clone(n.left, offset);
	    node.right = clone(n.right, offset);
	    return node;
	}
	
	public static void main(String[] args) {
		System.out.println(new iterative_dontconsider().generateTrees(2));
	}
}
