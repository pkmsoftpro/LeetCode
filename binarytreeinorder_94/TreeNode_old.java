package binarytreeinorder_94;

import java.util.Stack;

public class TreeNode_old {
	int val;
	TreeNode_old left;
	TreeNode_old right;

	TreeNode_old(int x) {
		val = x;
	}

	// Helper

	public String toString() {
		return "<" + toString_preorder(this,"") + ">";
	}

	// recursively printing out the nodes

	public static String toString_inorder(TreeNode_old r, String m) {
		Stack<TreeNode_old> s = new Stack<TreeNode_old>();
		TreeNode_old curr = r;
		while(curr!=null || s.size()>0){
			if(m.length()>20) break;
			while(curr!=null){
				s.push(curr);
				curr = curr.left;
			}
			curr = s.pop();
			m = m+curr.val+" ";
			curr = curr.right;
		}
		return m;
	}
	
	public static String toString_preorder(TreeNode_old r, String m) {
		Stack<TreeNode_old> s = new Stack<TreeNode_old>();
		Stack<String> label = new Stack<String>();
		label.push("root");
		s.push(r);
		while(!s.isEmpty()){
			if(m.length()>50) break;
			TreeNode_old tn = s.pop();
			String name = label.pop();
			/*m=m+":"+label+":"+tn.val;*/
			m=m+name+":"+tn.val+",";
			if(tn.right!=null){
				label.push("right");
				s.push(tn.right);
			}
			if(tn.left!=null){
				label.push("left");
				s.push(tn.left);
			}
		}
		return m;
	}

}