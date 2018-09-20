package com.bst;

//https://stackoverflow.com/questions/11897088/diameter-of-binary-tree-better-design#

public class BSTHeight {
	Node root;
	int max;
	
	private Node addRecursive(Node current, int value){
		if(current==null){
			return new Node(value);
		}
		if(value<current.value)
			current.left = addRecursive(current.left, value);
		else
			current.right = addRecursive(current.right, value);
		return current;
	}
	
	public Node add(int value){
		root = addRecursive(root, value);
		return root;
	}
	
	public BSTHeight createBSTHeight() {
		BSTHeight bt = new BSTHeight();
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
		bt.add(5);
		bt.add(6);
		bt.add(7);
		return bt;
	}
	
	public int getDiameter(Node current){
		if(current!=null){
			int leftDiameter = getDiameter(current.left);
			int rightDiameter = getDiameter(current.right);
			int leftHeight = getHeight(current.left);
			int rightHeight = getHeight(current.right);
			return Math.max(leftHeight+rightHeight+1, Math.max(leftDiameter, rightDiameter)); 
		}
		return 0;
	}
	
	public int getHeight(Node current){
		if(current!=null){
			int leftHeight = getHeight(current.left);
			int rightHeight = getHeight(current.right);
			return 1+Math.max(leftHeight,rightHeight);
		}
		return 0;
	}
	
	public static void main(String[] args) {
		BSTHeight bt = new BSTHeight().createBSTHeight();
		int height = bt.getHeight(bt.root);
		int diameter = bt.getDiameter(bt.root);
		System.out.println("height:" + height + " diameter:" + diameter);
	}
}
