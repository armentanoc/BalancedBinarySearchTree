package br.ucsal;

public class BinarySearchTree {

	private BinaryNode root;
	
	class BinaryNode {
		private int element;
		private BinaryNode left;
		private BinaryNode right;
		BinaryNode(int e, BinaryNode l, BinaryNode r) {
			element = e;
			left = l;
			right = r;
		}
	}
	
	public BinarySearchTree() {
		root = null;
	}
	
	public void clear() {
		root = null;
	}
	
	public boolean isEmpty() {
		return(root == null);
	}

}
