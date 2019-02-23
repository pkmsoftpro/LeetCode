package binarytreeinorder_94;

import java.util.ArrayList;
import java.util.List;

public class mysol {

	public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        populateInorderTree(root, list);
		return list;
    }
	
	void populateInorderTree(TreeNode root, List<Integer> list){
		if(root!=null){
			populateInorderTree(root.left, list);
			list.add(root.val);
			populateInorderTree(root.right, list);
		}
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left=null;
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(3);
		System.out.println(new mysol().inorderTraversal(root));
	}
}
