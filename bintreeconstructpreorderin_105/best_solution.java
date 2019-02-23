package bintreeconstructpreorderin_105;
/*
 * StefanPochmann:
 * https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/discuss/34543/Simple-O(n)-without-map
 * 
 * Explanation/Discussion:

Consider this input:

preorder: [1, 2, 4, 5, 3, 6]
inorder: [4, 2, 5, 1, 6, 3]

The obvious way to build the tree is:

    Use the first element of preorder, the 1, as root.
    Search it in inorder.
    Split inorder by it, here into [4, 2, 5] and [6, 3].
    Split the rest of preorder into two parts as large as the inorder parts, here into [2, 4, 5] and [3, 6].
    Use preorder = [2, 4, 5] and inorder = [4, 2, 5] to add the left subtree.
    Use preorder =[3, 6]andinorder = [6, 3] to add the right subtree.

But consider the worst case for this: A tree that's not balanced but is just a straight line to the left. Then inorder is the reverse of preorder, and already the cost of step 2, searching in inorder, is O(n^2) overall. Also, depending on how you "split" the arrays, you're looking at O(n^2) runtime and possibly O(n^2) space for that as well.

You can bring the runtime for searching down to O(n) by building a map from value to index before you start the main work, and I've seen several solutions do that. But that is O(n) additional space, and also the splitting problems remain. To fix those, you can use pointers into preorder and inorder instead of splitting them. And when you're doing that, you don't need the value-to-index map, either.

Consider the example again. Instead of finding the 1 in inorder, splitting the arrays into parts and recursing on them, just recurse on the full remaining arrays and stop when you come across the 1 in inorder. That's what my above solution does. Each recursive call gets told where to stop, and it tells its subcalls where to stop. It gives its own root value as stopper to its left subcall and its parent`s stopper as stopper to its right subcall.

Language details:

Small trick in my Javascript solution: The top-most call doesn't explicitly get a stopper value, so its stop is undefined. Which is good, because that's also what inorder[i] is when we have consumed all values, i.e., when i is inorder.length.

About the Python solution: I'm not sure there's a good way to have those p and i pointers that I use in my Javascript solution, so instead I opted for popping elements from preorder and inorder. Since popping from the front with pop(0) is expensive O(n), I reverse them before I start so I can use the cheap O(1) popping from the back.
 */

public class best_solution {

	private int in = 0;
    private int pre = 0;
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder, Integer.MIN_VALUE);
    }
    
    private TreeNode build(int[] preorder, int[] inorder, int stop) {
        if (pre >= preorder.length) return null;
        if (inorder[in] == stop) {
            in++;
            return null;
        }
        TreeNode node = new TreeNode(preorder[pre++]);
        node.left = build(preorder, inorder, node.val);
        node.right = build(preorder, inorder, stop);
        return node;        
    }

	public static void main(String[] args) {
		int[] preorder = {3,9,20,15,7};
		int[] inorder = {9,3,15,20,7};
		System.out.println(new best_solution().buildTree(preorder, inorder));
	}
}
