package com.bst;

public class Node {
	
	int value;
	Node left;
	Node right;
	
	Node(int value){
		this.value=value;
	}
	
	@Override
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
}
