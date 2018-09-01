package com.zerosolutions.MyBinarySearchTree;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Traversalmpl implements Traversal {

	@Override
	public void preOrderTraversal(Node root) {
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

	@Override
	public void inOrderTraversal(Node root) {
		Stack<Node> stack = new Stack<>();
		Set<Node> printedNodes = new HashSet<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			Node topNode = stack.peek();
			if (!printedNodes.contains(topNode)) {
				System.out.print(topNode.getValue() + " ");
				printedNodes.add(topNode);
			}
			if (topNode.getLeftChild() != null && !printedNodes.contains(topNode.getLeftChild())) {
				stack.push(topNode.getLeftChild());
				continue;
			}
			if (topNode.getRightChild() != null && !printedNodes.contains(topNode.getRightChild())) {
				stack.push(topNode.getRightChild());
				continue;
			}
			stack.pop();
		}
	}

	@Override
	public void postOrderTraversal(Node root) {
		Stack<Node> stack = new Stack<>();
		Set<Node> printedNodes = new HashSet<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			Node topNode = stack.peek();
			if (topNode.getLeftChild() != null && !printedNodes.contains(topNode.getLeftChild())) {
				stack.push(topNode.getLeftChild());
				continue;
			}
			if (topNode.getRightChild() != null && !printedNodes.contains(topNode.getRightChild())) {
				stack.push(topNode.getRightChild());
				continue;
			}
			System.out.print(topNode.getValue() + " ");
			printedNodes.add(topNode);
			stack.pop();
		}
	}

}
