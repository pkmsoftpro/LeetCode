package reverselinklist_206;

/*
 * https://leetcode.com/problems/reverse-linked-list-ii/discuss/235483/Java-recursive-solution-2ms
 */

import java.util.ArrayList;
import java.util.List;

public class reverselinklist_ii_92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (m == n) return head;
        ListNode before = head, after, start = head, end;
        for (int i = 0; i< m - 2; i++)
            before = before.next;
        if (m > 1)
            start = before.next;
        // reverse linked list from start to end
        List<ListNode> list = reverse(start, n-m);
        end = list.get(0);
        after = list.get(1);
        before.next = end;
        start.next = after;
        // new head of the reversed list
        return m > 1 ? head : end;
    }
    
    private List<ListNode> reverse(ListNode node, int k) {
        if (k == 0 || node.next == null) {
            List<ListNode> list = new ArrayList<>();
            list.add(node);
            list.add(node.next);
            return list;
        }
        List<ListNode> list = reverse(node.next, k-1);
        node.next.next = node;
        node.next = null;
        return list;
    }
    
    public static void main(String[] args) {
		ListNode l = new ListNode(1);
		l.next = new ListNode(2);
		l.next.next= new ListNode(3);
		l.next.next.next=new ListNode(3);
		l.next.next.next.next=new ListNode(4);
		l.next.next.next.next.next=new ListNode(4);
		l.next.next.next.next.next.next=new ListNode(5);
		ListNode t = new reverselinklist_ii_92().reverseBetween(l, 3, 5);
		System.out.println(t);
	}
}
