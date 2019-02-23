package sametree_100;

import java.util.Stack;

public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}

	// Helper

	public String toString() {
		return "<" + toString_preorder(this,"") + ">";
	}

	// recursively printing out the nodes

	public static String toString_inorder(TreeNode r, String m) {
		Stack<TreeNode> s = new Stack<TreeNode>();
		TreeNode curr = r;
		while(curr!=null || s.size()>0){
			if(m.length()>20) break;
			while(curr!=null){
				s.push(curr);
				curr = curr.left;
			}
			curr = s.pop();
			m = m+" "+curr.val+" ";
			curr = curr.right;
		}
		return m;
	}
	
	public static String toString_preorder(TreeNode r, String m) {
		Stack<TreeNode> s = new Stack<TreeNode>();
		Stack<String> label = new Stack<String>();
		label.push("root");
		s.push(r);
		while(!s.isEmpty()){
			if(m.length()>1000) break;
			TreeNode tn = s.pop();
			m=m+tn.val+" ";
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
	
	public static String toString_preorder1(TreeNode r, String m) {
		Stack<TreeNode> s = new Stack<TreeNode>();
		Stack<String> label = new Stack<String>();
		label.push("root");
		s.push(r);
		while(!s.isEmpty()){
			if(m.length()>1000) break;
			TreeNode tn = s.pop();
			String name = label.pop();
			/*m=m+":"+label+":"+tn.val;*/
			m=m+name+":"+tn.val+",";
			if(tn.right!=null){
				label.push("right");
				s.push(tn.right);
			} else m=m+"right:null,";
			if(tn.left!=null){
				label.push("left");
				s.push(tn.left);
			} else m=m+"left:null,";
		}
		return m;
	}

}