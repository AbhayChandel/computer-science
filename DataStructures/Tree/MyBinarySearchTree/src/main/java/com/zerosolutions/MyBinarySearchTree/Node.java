package com.zerosolutions.MyBinarySearchTree;

public class Node {
	
	private final int value;
	Node leftChild = null;
	Node rightChild = null;
	
	public Node(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}

	public Node getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}

	public Node getRightChild() {
		return rightChild;
	}

	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}
	
	
	
	

}
