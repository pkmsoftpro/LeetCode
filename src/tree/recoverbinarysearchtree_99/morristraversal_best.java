package tree.recoverbinarysearchtree_99;



/*
 * https://leetcode.com/problems/recover-binary-search-tree/discuss/32559/Detail-Explain-about-How-Morris-Traversal-Finds-two-Incorrect-Pointer
 */

/*
 * 
 * To understand this, you need to first understand Morris Traversal or Morris Threading Traversal.
	It take use of leaf nodes' right/left pointer to achieve O(1) space Traversal on a Binary Tree.
	Below is a standard Inorder Morris Traversal, referred from http://www.cnblogs.com/AnnieKim/archive/2013/06/15/morristraversal.html 
	(a Chinese Blog, while the graphs are great for illustration)
	
	public void morrisTraversal(TreeNode_old root){
			TreeNode_old temp = null;
			while(root!=null){
				if(root.left!=null){
					// connect threading for root
					temp = root.left;
					while(temp.right!=null && temp.right != root)
						temp = temp.right;
					// the threading already exists
					if(temp.right!=null){
						temp.right = null;
						System.out.println(root.val);
						root = root.right;
					}else{
						// construct the threading
						temp.right = root;
						root = root.left;
					}
				}else{
					System.out.println(root.val);
					root = root.right;
				}
			}
		}
	
	In the above code, System.out.println(root.val);appear twice, which functions as outputing the Node in ascending order (BST). 
	Since these places are in order, replace them with
	
	    if(pre!=null && pre.val > root.val){
	    	if(first==null){first = pre;second = root;}
	    	else{second = root;}
	  }
	pre = root;
	
	each time, the pre node and root are in order as System.out.println(root.val); outputs them in order.
	
	Then, come to how to specify the first wrong node and second wrong node.
	
	When they are not consecutive, the first time we meet pre.val > root.val ensure us the first node is the pre node, 
	since root should be traversal ahead of pre, pre should be at least at small as root. 
	The second time we meet pre.val > root.val ensure us the second node is the root node, 
	since we are now looking for a node to replace with out first node, which is found before.
	
	When they are consecutive, which means the case pre.val > cur.val will appear only once. 
	We need to take case this case without destroy the previous analysis. 
	So the first node will still be pre, and the second will be just set to root. 
	Once we meet this case again, the first node will not be affected.
	
	Below is the updated version on Morris Traversal.
 */

public class morristraversal_best {

	public void recoverTree(TreeNode root) {
        TreeNode pre = null;
        TreeNode first = null, second = null;
        // Morris Traversal
        TreeNode temp = null;
		while(root!=null){
			if(root.left!=null){
				// connect threading for root
				temp = root.left;
				while(temp.right!=null && temp.right != root)
					temp = temp.right;
				// the threading already exists
				if(temp.right!=null){
				    if(pre!=null && pre.val > root.val){
				        if(first==null){first = pre;second = root;}
				        else{second = root;}
				    }
				    pre = root;
				    
					temp.right = null;
					root = root.right;
				}else{
					// construct the threading
					temp.right = root;
					root = root.left;
				}
			}else{
				if(pre!=null && pre.val > root.val){
				    if(first==null){first = pre;second = root;}
				    else{second = root;}
				}
				pre = root;
				root = root.right;
			}
		}
		// swap two node values;
		if(first!= null && second != null){
		    int t = first.val;
		    first.val = second.val;
		    second.val = t;
		}
    }
    
    public static void main(String[] args) {
		TreeNode root = new TreeNode(6);
		root.right = new TreeNode(3);
		root.right.right = new TreeNode(4);
		root.right.right.right = new TreeNode(5);
		root.right.right.right.right = new TreeNode(2);
		new morristraversal_best().recoverTree(root);
		System.out.println();
	}
}

/*
 * 
 * https://leetcode.com/problems/recover-binary-search-tree/discuss/32652/Java-Solution_bestrecursive%3A-Morris-Traversal-and-Iteration
 * 
 * 
 * For me, the true O(1) space solution means Morris Traversal and an iterative instead of bruteforce solution.

public void recoverTree(TreeNode_old root) {
    List<TreeNode_old> targets = new ArrayList<TreeNode_old>(2);
    TreeNode_old curr = root, prev = null;
    while (curr != null) {
        if (curr.left == null) {
            getTargets(prev, curr, targets);
            prev = curr;
            curr = curr.right;
        } else {
            TreeNode_old rightmost = curr.left;
            while (rightmost.right != null && rightmost.right != curr)
                rightmost = rightmost.right;
            if (rightmost.right != curr) {
                rightmost.right = curr;
                curr = curr.left;
            } else {
                rightmost.right = null; // remove the bridge
                getTargets(prev, curr, targets);
                prev = curr;
                curr = curr.right;
            }
        }
    }
    if (targets.size() == 2) {
        int temp = targets.get(0).val;
        targets.get(0).val = targets.get(1).val;
        targets.get(1).val = temp;
    }
}

private void getTargets(TreeNode_old prev, TreeNode_old curr, List<TreeNode_old> targets) {
    if (prev != null && prev.val > curr.val) {
        if (targets.isEmpty()) {
            targets.add(prev);
            targets.add(curr);
        } else
            targets.set(1, curr);
    }
}
 */
