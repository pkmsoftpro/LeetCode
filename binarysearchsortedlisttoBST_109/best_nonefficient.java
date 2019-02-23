package binarysearchsortedlisttoBST_109;

/*
 * similar solution to 108
 */

import java.util.HashMap;

public class best_nonefficient {

	public TreeNode sortedListToBST(ListNode h){
	    HashMap<Integer, ListNode> indexes = new HashMap<>();
	    ListNode i = h;
	    int index = 0;
	    while(i != null){
	        indexes.put(index, i);
	        index++;
	        i = i.next;
	    }
	    return helper(indexes, 0, index-1);
	}

	public TreeNode helper(HashMap<Integer, ListNode> nodes, int l, int r){
	    if(l > r) return null;
	    int mid = (l + r) / 2;
	    TreeNode root = new TreeNode(nodes.get(mid).val);
	    root.left = helper(nodes, l, mid-1);
	    root.right = helper(nodes, mid+1, r);
	    return root;
	}
}
