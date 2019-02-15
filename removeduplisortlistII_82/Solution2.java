package removeduplisortlistII_82;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/discuss/232444/My-accepted-%22Recursion%22-java-code-for-0ms.
 */
class Solution2 {
    public ListNode deleteDuplicates(ListNode head) {
        return findFirstNoRepeatNode(head);
    }

    private ListNode findFirstNoRepeatNode(ListNode head) {
        ListNode firstNoRepeatNode = null;
        if (head == null || head.next == null) {
            return head;
        }
        if (head.val != head.next.val) {
            firstNoRepeatNode = head;
            firstNoRepeatNode.next = findFirstNoRepeatNode(firstNoRepeatNode.next);
            return firstNoRepeatNode;
        }
        ListNode curNode = head;
        while (curNode.val == curNode.next.val) {
            curNode = curNode.next;
            if (curNode == null || curNode.next == null) {
                return null;
            }
        }
        return findFirstNoRepeatNode(curNode.next);
    }
    
    public static void main(String[] args) {
		ListNode l = new ListNode(1);
		l.next = new ListNode(2);
		l.next.next= new ListNode(2);
		l.next.next.next=new ListNode(3);
		l.next.next.next.next=new ListNode(3);
		l.next.next.next.next.next=new ListNode(4);
		ListNode t = new Solution2().deleteDuplicates(l);
		System.out.println(t);
	}
}
