package com.zerosolutions.MyBinarySearchTree;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class MyBinarySearchTree {

	private final Node root;

	public MyBinarySearchTree(int value) {
		root = new Node(value);
	}
	
	public Node getRoot() {
		return root;
	}

	public void addNode(int value) {
		Node currentNode = root;
		while (true) {
			if (value <= currentNode.getValue()) {
				if (currentNode.getLeftChild() != null) {
					currentNode = currentNode.getLeftChild();
					continue;
				}
				currentNode.setLeftChild(new Node(value));
				break;
			} else {
				if (currentNode.getRightChild() != null) {
					currentNode = currentNode.getRightChild();
					continue;
				}
				currentNode.setRightChild(new Node(value));
				break;
			}
		}
	}

	public void draw() {
		int nodeCount = 1;
		int childNodeCount = 0;
		Queue<Node> queue = new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			if (nodeCount == 0) {
				nodeCount = childNodeCount;
				childNodeCount = 0;
				System.out.println();
				continue;
			}
			Node currentNode = queue.poll();
			if (currentNode.getLeftChild() != null) {
				queue.offer(currentNode.getLeftChild());
				childNodeCount++;
			}
			if (currentNode.getRightChild() != null) {
				queue.offer(currentNode.getRightChild());
				childNodeCount++;
			}
			System.out.print(currentNode.getValue() + " ");
			nodeCount--;
		}
	}

	public void printAscending() {
		Stack<Node> stack = new Stack<>();
		Set<Node> printedNodes = new HashSet<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			Node topNode = stack.peek();
			if (topNode.getLeftChild() != null && !printedNodes.contains(topNode.getLeftChild())) {
				stack.push(topNode.getLeftChild());
				continue;
			}
			System.out.print(topNode.getValue() + " ");
			printedNodes.add(stack.pop());
			if (topNode.getRightChild() != null && !printedNodes.contains(topNode.getRightChild())) {
				stack.push(topNode.getRightChild());
			}
		}
	}

	public void printDescending() {
		Stack<Node> stack = new Stack<>();
		Set<Node> printedNodes = new HashSet<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			Node topNode = stack.peek();
			if (topNode.getRightChild() != null && !printedNodes.contains(topNode.getRightChild())) {
				stack.push(topNode.getRightChild());
				continue;
			}
			System.out.print(topNode.getValue() + " ");
			printedNodes.add(stack.pop());
			if (topNode.getLeftChild() != null && !printedNodes.contains(topNode.getLeftChild())) {
				stack.push(topNode.getLeftChild());
			}

		}
	}
}
