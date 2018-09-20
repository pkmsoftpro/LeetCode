package com.bst;

import java.util.LinkedList;
import java.util.Queue;

/*https://www.baeldung.com/java-binary-tree
 * Tree Structure
 * 								4
 *                            /   \
 * 							 /	   \
 * 							2		8
 * 						   / \     / \
 *                        1	  3   7   9
 *                               / \   \
 *                              4   7   9
 *                               \
 *                                4
 *                                 \
 *                                  4
 *                                   \
 *                                    5
 *                                     \
 *                                      6
 */

public class BinarySearchTree {

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
	
	public BinarySearchTree createBinarySearchTree() {
		BinarySearchTree bt = new BinarySearchTree();
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
	
	private Node deleteRecursive(Node current, int value){
		if(current == null){
			return current;
		}
		if(value<current.value)
			current.left = deleteRecursive(current.left, value);
		else if(value>current.value)
			current.right = deleteRecursive(current.right, value);
		else {
			if(current.left == null)
				return current.right;
			else if(current.right == null)
				return current.left;
			current.value = minVal(current.right);
			current.right = deleteRecursive(current.right,current.value);
		}
		return current;
	}

	private int minVal(Node root) {
		return root.left==null?root.value:minVal(root.left);
	}
	
	public Node delete(int value){
		return deleteRecursive(root, value);
	}
	
	public void inOrderTraversal(Node current){
		if(current != null){
			inOrderTraversal(current.left);
			System.out.println(current.value);
			inOrderTraversal(current.right);
		}
	}
	
	public void preOrderTraversal(Node current){
		if(current != null){
			System.out.println(current.value);
			preOrderTraversal(current.left);
			preOrderTraversal(current.right);
		}
	}
	
	public void postOrderTraversal(Node current){
		if(current != null){
			preOrderTraversal(current.left);
			preOrderTraversal(current.right);
			System.out.println(current.value);
		}
	}
	
	public void traverseLevelOrder(Node current) {
		Queue<Node> qNode = new LinkedList<Node>();
		qNode.add(current);
		Node polled = null;
		while (qNode.size() != 0) {
			polled = qNode.poll();
			if (polled != null) {
				System.out.println(polled);
				qNode.add(polled.left);
				qNode.add(polled.right);
			}
		}
	}
	
	public void mirror(Node current) {
		if (current != null) {

			Node temp = current.left;
			current.left = current.right;
			current.right = temp;

			mirror(current.left);
			mirror(current.right);
		}
	}
	
/*https://www.youtube.com/watch?v=ZL9f1pVrBuo
 *https://www.geeksforgeeks.org/write-an-efficient-c-function-to-convert-a-tree-into-its-mirror-tree/
 * 							    4
 *                            /   \
 * 							 /	   \
 * 							8		2
 * 						   / \     / \
 *                        9	  7   3   1
 *                       /   / \
 *                      9   7   4
 *                             / 
 *                            4   
 *                           /     
 *                          4        
 *                         /          
 *                        5            
 *                       /              
 *                      6  
 */
	
	public int calculateDaimeter(Node current) {
		if (current == null)
			return 0;

		
		int left = calculateDaimeter(current.left);
		int right = calculateDaimeter(current.right);
		
		max = Math.max(max, left+right);
		
		return Math.max(left, right) + 1;
	}
	
	public static void main(String[] args) {
		BinarySearchTree bt = new BinarySearchTree();
		bt = bt.createBinarySearchTree();
		//bt.delete(9);
		//bt.delete(4);
		//System.out.println(bt.root.value);
		//Node current = bt.root;
		//bt.postOrderTraversal(current);
		//bt.traverseLevelOrder(current);
		//bt.mirror(current);
		//System.out.println(bt.root.value);
		int treeDLeft = bt.calculateDaimeter(bt.root);
		System.out.println(bt.max+1);
	}
}
