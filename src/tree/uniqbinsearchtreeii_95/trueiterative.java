package tree.uniqbinsearchtreeii_95;

/*
 * https://leetcode.com/problems/unique-binary-search-trees-ii/discuss/31552/JAVA-DP-bruteforce-and-Brute-Force-One_Recursive-bruteforce.
 */

import java.util.ArrayList;
import java.util.List;

public class trueiterative {

	public List<TreeNode> generateTrees(int n) {
		
        List<TreeNode> res = new ArrayList<>();
        res.add(null);
        for(; n > 0; n--) {
            List<TreeNode> next = new ArrayList<>();
            for(TreeNode node: res) {
                //the special case when Node(n) is root of new tree
                TreeNode root = new TreeNode(n); 
                root.right = node;
                next.add(root);
               //while loop inserts new value to every possible position into the left tree side
                while(node != null) {
                    TreeNode cRoot = new TreeNode(root.right.val);
                    //clone left subtree
                    cRoot.left = copyTree(root.right.left);
                    //reusing - point new root.right to the original right subtree
                    cRoot.right = root.right.right;
                    //curr is the cutoff node whose left child will be replaced by the new n 
                    TreeNode curr = getValNode(cRoot, node.val); 
                    //place n as curr's left child, make curr's original left child as the right child of new n
                    TreeNode tmp = curr.left;
                    curr.left = new TreeNode(n);
                    curr.left.right = tmp;

                    next.add(cRoot);
                    node = node.left;
                }
            }
            res = next;
        }
        return res;
    }
    private TreeNode getValNode(TreeNode n, int val) { //find the cutoff node in the new tree
        while(n != null) {
            if(n.val == val) break;
            n = n.left;
        }
        return n;
    }

    private TreeNode copyTree(TreeNode root) { //clone the right subtree
        if(root == null) return null;
        TreeNode cRoot = new TreeNode(root.val);
        cRoot.left = copyTree(root.left);
        cRoot.right = copyTree(root.right);
        return cRoot;
    }
    
    public static void main(String[] args) {
		System.out.println(new trueiterative().generateTrees(4));
	}
}
