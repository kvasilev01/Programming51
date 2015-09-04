package com.hackbulgaria.programming51.week10;

import java.util.LinkedList;

public class BST<T extends Comparable<T>> {
	private BSTNode<T> root;
	private int height;

	public BST() {
		root = null;
		height = 0;
	}

	public boolean empty() {
		return root == null;
	}

	public void add(T data) {
		if (empty()) {
			root = new BSTNode<T>(data);
		} else {
			if (data.compareTo(root.data) < 0) {
				if (root.left == null) {
					root.left = new BSTNode<T>(data);
				} else {
					addRecursive(data, root.left);
				}
			} else {
				if (root.right == null) {
					root.right = new BSTNode<T>(data);
				} else {
					addRecursive(data, root.right);
				}
			}
		}
	}

	private void addRecursive(T data, BSTNode<T> root) {
		if (data.compareTo(root.data) < 0) {
			if (root.left == null) {
				root.left = new BSTNode<T>(data);
			} else {
				addRecursive(data, root.left);
			}
		} else {
			if (root.right == null) {
				root.right = new BSTNode<T>(data);
			} else {
				addRecursive(data, root.right);
			}
		}
	}

	private String toStringRecursive(BSTNode<T> root) {
		if (root == null)
			return "";
		String str = "";
		str += toStringRecursive(root.left);
		str += root.data + " ";
		str += toStringRecursive(root.right);
		return str;
	}

	public String toString() {
		String str = "";
		str += toStringRecursive(root);
		return str;
	}

	public int getTreeHeight() {
		getTreeHeightRecursive(root, 0);
		return height;
	}

	public LinkedList<T> getTreeLevel(int level) {
		LinkedList lastNums = new LinkedList<>();
		getTreeLevelRecursive(lastNums, root, level, 1);
		return lastNums;
	}

	private void getTreeHeightRecursive(BSTNode<T> data, int index) {
		if (data.left != null) {
			getTreeHeightRecursive(data.left, height += 1);
		} else if (data.right != null) {
			getTreeHeightRecursive(data.right, height += 1);
		}
	}

	private void getTreeLevelRecursive(LinkedList<T> lastNums, BSTNode<T> node,
			int level, int current) {
		if (node == null)
			return;
		if (level == current) {
			lastNums.add(node.data);
		} else {
			System.out.println(node.data);
			getTreeLevelRecursive(lastNums, node.left, level, current + 1);
			getTreeLevelRecursive(lastNums, node.right, level, current + 1);
		}
	}

	public void printLevel(int level) {
		printLevelRecursive(level, root, 1);
	}

	private void printLevelRecursive(int level, BSTNode<T> root, int counter) {
		if (root == null) {
			return;
		}
		if (level == counter) {
			System.out.print(root.data + " ");
		} else {
			printLevelRecursive(level, root.left, counter + 1);
			printLevelRecursive(level, root.right, counter + 1);
		}
	}
}