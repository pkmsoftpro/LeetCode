
public class Node {
	int value;
	Node left;
	Node right;
	Node parent;
	
	public Node(int value){
		this.value = value;
	}
	
	public String toString(){
		return Integer.toString(this.value);
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}
}
