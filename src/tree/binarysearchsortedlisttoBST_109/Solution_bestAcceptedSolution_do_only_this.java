package tree.binarysearchsortedlisttoBST_109;

/*intuition:
 * if we take out the element of binary tree in in-order fashion then we get a sorted list
 * similarly, if we provide sorted list to binary tree constructor, it will give in-order tree.
 * 
 * 
 * https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/discuss/212307/Java-Solutions%3A-Top-Down-and-Bottom-Up
 */

public class Solution_bestAcceptedSolution_do_only_this
{
    ListNode head = null;
    
    public TreeNode sortedListToBST(ListNode head) 
    {
        this.head = head;
        return inorderHelper(0, getLength(head) - 1);
    }
    
    private TreeNode inorderHelper(int start, int end)
    {
        if(start > end)
            return null;
        
        int mid = start + (end - start) / 2;
        
        TreeNode leftChild = inorderHelper(start, mid - 1);
        
        TreeNode root = new TreeNode(head.val); 
		head = head.next;
        
		root.left = leftChild;
        root.right = inorderHelper(mid + 1, end);
        
        return root;
    }
    
    private int getLength(ListNode head)
    {
        int count = 0;
        
        for(ListNode current = head; current != null; current = current.next)
            count++;
        
        return count;
    }
}