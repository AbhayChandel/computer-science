package com.zerosolutions.MyBinarySearchTree;

public class Main {

	public static void main(String[] args) {
		MyBinarySearchTree myBST = new MyBinarySearchTree(50);
		myBST.addNode(45);
		myBST.addNode(70);
		myBST.addNode(18);
		myBST.addNode(32);
		myBST.addNode(68);
		myBST.addNode(33);
		myBST.addNode(16);
		myBST.addNode(66);
		myBST.addNode(98);
		myBST.addNode(8);
		myBST.addNode(85);
		myBST.draw();
		System.out.println();
		Traversal traverse = new Traversalmpl();
		traverse.preOrderTraversal(myBST.getRoot());
		System.out.println();
		traverse.inOrderTraversal(myBST.getRoot());
		System.out.println();
		traverse.postOrderTraversal(myBST.getRoot());
		
	}

}
