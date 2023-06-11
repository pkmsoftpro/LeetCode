package tree.binarysearchsortedlisttoBST_109;

public class Solution {
  ListNode head = null;
  private TreeNode buildTree(int i, int length) {
    if(i>length) return null;
    int mid = i+ (length-i)/2;
    TreeNode left = buildTree(i, mid-1);
    TreeNode root = new TreeNode(head.val);
    head = head.next;
    root.left = left;
    root.right = buildTree(mid+1, length);
    
    return root;
  }  
  
  public TreeNode sortedListToBST(ListNode headnode) {
    int length = 0;
    ListNode dummy = headnode;
    while(dummy != null) {
      length++;
      dummy = dummy.next;
    }
    head = headnode;
    TreeNode t = buildTree(0, length-1);
    return t;
    
  }

  public static void main(String[] args) {
    ListNode l = new ListNode(1);
    l.next = new ListNode(2);
    l.next.next= new ListNode(3);
    l.next.next.next=new ListNode(4);
    l.next.next.next.next=new ListNode(5);
    l.next.next.next.next.next=new ListNode(6);
    TreeNode t = new Solution().sortedListToBST(l);
    System.out.println(t);
}
}
