package graph.clonegraph_133;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;

class Node {
	public int val;
	public List<Node> neighbors;

	public Node() {
	}

	public Node(int _val, List<Node> _neighbors) {
		val = _val;
		neighbors = _neighbors;
	}

	public String toString() {
		// TODO Auto-generated method stub
		return this.val + " ";
	}
}

public class MySol {

	public Node cloneGraph(Node node) {
		Map<Node, Node> map = new HashMap<Node, Node>();
		Stack<Node> stack = new Stack<Node>();
		Node nn1 = new Node(node.val, new ArrayList<Node>());
		map.put(node, nn1);
		stack.push(node);
		while (!stack.isEmpty()) {
			Node n1pop = stack.pop();
			for (Node tempNode : n1pop.neighbors) {
				if (!map.containsKey(tempNode)) {
					stack.push(tempNode);
					Node nn2 = new Node(tempNode.val, new ArrayList<Node>());
					map.put(tempNode, nn2);
				}
				map.get(n1pop).neighbors.add(map.get(tempNode));
			}
		}
		/*for(Entry<Node, Node> n : map.entrySet()){
			Node newn = n.getValue();
			for(Node t : n.getKey().neighbors){
				newn.neighbors.add(map.get(t));
			}
		}*/
		return nn1;
	}

	public static void main(String[] args) {
		Node root = new Node(1, new ArrayList<Node>());
		Node neighbour2 = new Node(2, new ArrayList<Node>());
		Node neighbour4 = new Node(4, new ArrayList<Node>());
		Node neighbour3 = new Node(3, new ArrayList<Node>());
		root.neighbors.add(neighbour2);
		root.neighbors.add(neighbour4);
		neighbour2.neighbors.add(root);
		neighbour2.neighbors.add(neighbour3);
		neighbour3.neighbors.add(neighbour2);
		neighbour3.neighbors.add(neighbour4);
		neighbour4.neighbors.add(root);
		neighbour4.neighbors.add(neighbour3);

		neighbour2 = new MySol().cloneGraph(root);
		System.out.println("done");
	}

}
