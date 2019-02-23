package bintreezigzag_103;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
similar to my solution 102

 https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/discuss/239841/Java-Solution_bestrecursive
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        if(root == null) return list;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            LinkedList<Integer> curr_level = new LinkedList<>();
            for(int i=0; i < size; i++){
                TreeNode curr = q.remove();
                if(list.size() % 2 == 0)
                    curr_level.add(curr.val);
                else       
                    curr_level.addFirst(curr.val);
                
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
                    
            }
            list.add(curr_level);
        }
        return list;
    }
}