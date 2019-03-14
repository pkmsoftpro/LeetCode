package reorderlist_143;
/*
 * https://leetcode.com/problems/reorder-list/discuss/137832/Java-Solution-using-Stack
 */

import java.util.Stack;

import linkedlistcycle_141.ListNode;

public class using_stack {

	public void reorderList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        for (ListNode node = head; node != null; node = node.next) {
            stack.push(node);
        }
        ListNode node = head;
        while (!stack.isEmpty()) {
            ListNode temp = node.next;
            if (stack.peek() == temp) {
                temp.next = null;
                break;
            } else if (stack.peek() == node) {
                node.next = null;
                break;
            }
            node.next = stack.pop();
            node.next.next = temp;
            node = node.next.next;
        }
    }
}
