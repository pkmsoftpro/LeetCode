package binarytreeprintancestors;

//Java program to print ancestors of given node 

/* A binary tree node has data, pointer to left child 
and a pointer to right child */
class Node 
{ 
	int data; 
	Node left, right; 

	Node(int item) 
	{ 
		data = item; 
		left = right = null; 
	} 
} 

public class BinaryTree 
{ 
	TreeNode root; 

	/* If target is present in tree, then prints the ancestors 
	and returns true, otherwise returns false. */
	boolean printAncestors(TreeNode node, int target) 
	{ 
		/* base cases */
		if (node == null) 
			return false; 

		if (node.val == target) 
			return true; 

		/* If target is present in either left or right subtree 
		of this node, then print this node */
		if (printAncestors(node.left, target) 
				|| printAncestors(node.right, target)) 
		{ 
			System.out.print(node.val + " "); 
			return true; 
		} 

		/* Else return false */
		return false; 
	} 

	/* Driver program to test above functions */
	public static void main(String args[]) 
	{ 
		TreeNode tree = new TreeNode(1); 
		
		/* Construct the following binary tree 
					 1 
					/ \ 
				   2   3 
				  / \ 
				 4   5 
				/ 
			   7 
		*/
		tree.left = new TreeNode(2); 
		tree.right = new TreeNode(3); 
		tree.left.left = new TreeNode(4); 
		tree.left.right = new TreeNode(5); 
		tree.left.left.left = new TreeNode(7); 

		new BinaryTree().printAncestors(tree, 7); 

	} 
} 

//This code has been contributed by Mayank Jaiswal 
