
public class Node {
	int value;
	Node left;
	Node right;
	Node parent;

	Node(int value){
		this.value = value;
		left = null;
		right = null;
	}
	@Override
	public String toString(){
		return "Value:" + value; /* + ", lValue:" + left != null ? Integer
				.toString(left.value)
				: "null" + ", rValue:" + right != null ? Integer
						.toString(right.value) : "null"; */
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
	
	public Node getParent(){
		return this.parent;
	}
	
	public void setParent(Node parent){
		this.parent = parent;
	}
}
