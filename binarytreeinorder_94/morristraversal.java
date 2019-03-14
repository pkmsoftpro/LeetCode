package binarytreeinorder_94;
/*
 * https://www.youtube.com/watch?v=wGXB9OWhPTg
 * 
 * https://github.com/mission-peace/interview/blob/master/src/com/interview/tree/MorrisTraversal.java
 */

public class morristraversal {
    public void inorder(TreeNode_old root) {
        TreeNode_old current = root;
        while(current != null) {
            //left is null then print the node and go to right
            if (current.left == null) {
                System.out.print(current.val + " ");
                current = current.right;
            }
            else {
                //find the predecessor.
                TreeNode_old predecessor = current.left;
                //To find predecessor keep going right till right node is not null or right node is not current.
                while(predecessor.right != current && predecessor.right != null){
                    predecessor = predecessor.right;
                }
                //if right node is null then go left after establishing link from predecessor to current.
                if(predecessor.right == null){
                    predecessor.right = current;
                    current = current.left;
                }else{ //left is already visited. Go right after visiting current.
                    predecessor.right = null;
                    System.out.print(current.val + " ");
                    current = current.right;
                }
            }
        }
    }

    public void preorder(TreeNode_old root) {
        TreeNode_old current = root;
        while (current != null) {
            if(current.left == null) {
                System.out.print(current.val + " ");
                current = current.right;
            }
            else {
                TreeNode_old predecessor = current.left;
                while(predecessor.right != current && predecessor.right != null) {
                    predecessor = predecessor.right;
                }
                if(predecessor.right == null){
                    predecessor.right = current;
                    System.out.print(current.val + " ");
                    current = current.left;
                }else{
                    predecessor.right = null;
                    current = current.right;
                }
            }
        }
    }

    public static void main(String[] args) {
		TreeNode_old root = new TreeNode_old(8);
		root.left=new TreeNode_old(5);
		root.left.right=new TreeNode_old(9);
		root.left.left=new TreeNode_old(2);
		root.right = new TreeNode_old(1);
		root.right.right = new TreeNode_old(6);
		root.right.left = new TreeNode_old(3);
		//root.right.left.left = new TreeNode_old(4);
		new morristraversal().inorder(root);
		System.out.println();
		new morristraversal().preorder(root);
		System.out.println();
	}
}
