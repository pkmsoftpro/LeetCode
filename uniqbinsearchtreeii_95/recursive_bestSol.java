package uniqbinsearchtreeii_95;

/*
 * https://leetcode.com/problems/unique-binary-search-trees-ii/discuss/31508/Divide-and-conquer.-F(i)-G(i-1)-*-G(n-i)
 * 
 * https://leetcode.com/problems/unique-binary-search-trees/discuss/31666/DP-recursive-in-6-lines-with-explanation.-F(i-n)-G(i-1)-*-G(n-i)
 */

import java.util.LinkedList;
import java.util.List;

public class recursive_bestSol {
	
	public List<TreeNode> generateTrees(int n) {
		return generateSubtrees(1, n);
	}

	private List<TreeNode> generateSubtrees(int s, int e) {
		List<TreeNode> res = new LinkedList<TreeNode>();
		if (s > e) {
			res.add(null); // empty tree
			return res;
		}

		for (int i = s; i <= e; ++i) {
			List<TreeNode> leftSubtrees = generateSubtrees(s, i - 1);
			List<TreeNode> rightSubtrees = generateSubtrees(i + 1, e);

			for (TreeNode left : leftSubtrees) {
				for (TreeNode right : rightSubtrees) {
					TreeNode root = new TreeNode(i);
					root.left = left;
					root.right = right;
					res.add(root);
				}
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		System.out.println(new recursive_bestSol().generateTrees(2));
	}
}
