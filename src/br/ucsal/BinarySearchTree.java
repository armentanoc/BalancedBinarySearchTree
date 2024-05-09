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
	
	public void insert(int x) { 
		root = insert(x, root);
	}
	
	private BinaryNode insert(int x, BinaryNode t) {
		if(t == null)
			t = new BinaryNode(x, null, null); 
		else if(x < t.element)
			t.left = insert(x, t.left);
		else if(x > t.element)
			t.right = insert(x, t.right);
		return t; 
	}
	
	public void print() {
		if(isEmpty())
			System.out.println("A arvore esta vazia");
		print(root);
	}
	
	private void print(BinaryNode t) {
		if(t!= null ) {
			print(t.left);
			System.out.print(t.element + " ");
			print(t.right);
		}
	}
}
