
public class BinaryTree {
	
	Node root;
	
	private Node addRecursive(Node current, int value){
		if(current==null){
			return new Node(value);
		}
		if(value<current.value){
			current.left = addRecursive(current.left, value);
		}
		else {
			current.right = addRecursive(current.right, value);
		}
		return current;
	}
	
	public void add(int value){
		root = addRecursive(root, value);
	}
	
	public BinaryTree createBinaryTree() {
		BinaryTree bt = new BinaryTree();
		bt.add(4);
		bt.add(2);
		bt.add(8);
		bt.add(1);
		bt.add(3);
		bt.add(7);
		bt.add(9);
		bt.add(9);
		bt.add(4);
		bt.add(4);
		bt.add(4);
		return bt;
	}
	
	private Node deleteRecursive(Node current, int value){
		if(current == null){
			return current;
		}
		if(value<current.value)
			current.left = deleteRecursive(current.left,value);
		else if (value>current.value)
			current.right = deleteRecursive(current.right,value);
		else {
			if(current.left==null)
				return current.right;
			else if (current.right==null)
				return current.left;
			current.value = minVal(current.right);
			current.right = deleteRecursive(current.right, current.value);
		}
		return current;
	}
	
	private int minVal(Node root){
		return root.left==null?root.value:minVal(root.left);
	}
	
	public Node delete (int value){
		return deleteRecursive(root, value);
	}
	
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt = bt.createBinaryTree();
		bt.delete(9);
		bt.delete(4);
		System.out.println(bt.root.value);
	}
}
