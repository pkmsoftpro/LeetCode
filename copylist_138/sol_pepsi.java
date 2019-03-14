package copylist_138;

/*
 * https://leetcode.com/problems/copy-list-with-random-pointer/discuss/43647/Share-my-java-solution
 * 
 * The solution using a Map which is slow and space expensive. A better solution reuses the links to copy the random links without using extra map or array.

To do that, for each node, we create a copy copyNode and we rewire the nodes so that copyNode.next is node.next and node.next is copyNode. In other words,

    given 1->2->3->4
    becomes 1->1->2->2->3->3->4->4

Now, we can traversal this "doubled" list again. This time, we copy the random links for the copied nodes. After that, we just need to separate the list into two lists, odd and even, which is the same as the "Odd Even Linked List" except we do not connect even to odd in the end. Instead, we set the odd tail to null.

I didn't look at the posted solutions when I do this problem. Apparently the idea is the same. But I think the implement is a bit different so I posted this anyway. 
 */

public class sol_pepsi {

	public RandomListNode copyRandomList(RandomListNode head) {
	    if (head == null) return null;

	    for (RandomListNode iter = head; iter != null; iter = iter.next.next) {
	        RandomListNode copy = new RandomListNode(iter.label);
	        copy.next = iter.next;
	        iter.next = copy;
	    }

	    for (RandomListNode iter = head; iter != null; iter = iter.next.next)
	        if (iter.random != null)
	            iter.next.random = iter.random.next;

	    RandomListNode evenHead = head.next, odd = head, even = evenHead;
	    while (even.next != null) {
	        odd.next = odd.next.next;
	        even.next = even.next.next;
	        odd = odd.next;
	        even = even.next;
	    }
	    odd.next = null;
	    return evenHead;
	}
}
