package binarytreelevelorder_102;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class MySol {
	
	public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        Queue<TreeNode> oldStack = new LinkedList<TreeNode>();
        oldStack.add(root);
        while(!oldStack.isEmpty()){
        	oldStack = levelOrderTraversal(lists, oldStack);
        }
        return lists;
    }
	
	public Queue<TreeNode> levelOrderTraversal(List<List<Integer>> lists, Queue<TreeNode> oldStack){
		Queue<TreeNode> newStack = new LinkedList<TreeNode>();
		List<Integer> list = new ArrayList<Integer>();
		while(!oldStack.isEmpty()){
			TreeNode temp = oldStack.remove();
			if(temp!=null){
				newStack.add(temp.left);
				newStack.add(temp.right);
				list.add(temp.val);
			}
		}
		if(!list.isEmpty())lists.add(list);
		return newStack;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.right = new TreeNode(20);
		root.right.right = new TreeNode(7);
		root.right.left = new TreeNode(15);
		/*root.right.right.right.right = new TreeNode(2);*/
		
		root.left = new TreeNode(9);
		root.left.left = null;
		root.left.right = null;
		/*root.left.left.left.left = new TreeNode(2);*/
		
		System.out.println(new MySol().levelOrder(root));
	}
}
