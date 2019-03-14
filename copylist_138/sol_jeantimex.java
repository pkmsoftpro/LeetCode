package copylist_138;

import java.util.HashMap;
import java.util.Map;


class RandomListNode {
	public int label;
	public RandomListNode next;
	public RandomListNode random;

	public RandomListNode() {
	}

	public RandomListNode(int _val) {
		label = _val;
		next = new RandomListNode();
		random = new RandomListNode();
	}
	
	@Override
	public String toString() {
		return label+" ";
	}
};

public class sol_jeantimex {

	public RandomListNode copyRandomList(RandomListNode head) {
		if (head == null)
			return null;

		Map<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();

		// loop 1. copy all the nodes
		RandomListNode node = head;
		while (node != null) {
			map.put(node, new RandomListNode(node.label));
			node = node.next;
		}

		// loop 2. assign next and random pointers
		node = head;
		while (node != null) {
			map.get(node).next = map.get(node.next);
			map.get(node).random = map.get(node.random);
			node = node.next;
		}

		return map.get(head);
	}
	
	public static void main(String[] args) {
		RandomListNode r1 = new RandomListNode(1);
		RandomListNode r2 = new RandomListNode(2);
		RandomListNode r3 = new RandomListNode(3);
		RandomListNode r4 = new RandomListNode(4);
		RandomListNode r5 = new RandomListNode(5);
		r1.next = r2;
		r2.next = r3;
		r3.next = r4;
		r4.next = r5;
		r2.random = r1;
		r3.random = r2;
		r4.random = r3;
		r5.random = r4;
		
		RandomListNode root = new sol_jeantimex().copyRandomList(r1);
		System.out.println(root);
	}
}
