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
		return (root == null);
	}

	public void insert(int x) {
		root = insert(x, root);
	}

	private BinaryNode insert(int x, BinaryNode t) {
		if (t == null)
			t = new BinaryNode(x, null, null);
		else if (x < t.element)
			t.left = insert(x, t.left);
		else if (x > t.element)
			t.right = insert(x, t.right);
		return t;
	}

	public void print() {
		if (isEmpty())
			System.out.println("A arvore esta vazia");
		print(root);
	}

	private void print(BinaryNode t) {
		if (t != null) {
			print(t.left);
			System.out.print(t.element + " ");
			print(t.right);
		}
	}

	public int findMin() throws EmptyTreeException {
		if (isEmpty())
			throw new EmptyTreeException();
		return findMin(root).element;
	}

	private BinaryNode findMin(BinaryNode t) {
		if (t == null)
			return null;
		else if (t.left == null)
			return t;
		return findMin(t.left);
	}

	public int findMax() throws EmptyTreeException {
		if (isEmpty())
			throw new EmptyTreeException();
		return findMax(root).element;
	}

	private BinaryNode findMax(BinaryNode t) {
		if (t != null)
			while (t.right != null)
				t = t.right;
		return t;
	}

	public void remove(int x) {
		root = remove(x, root);
	}

	private BinaryNode remove(int x, BinaryNode t) {
		if (t == null)
			return t; // Item não está na árvore ou árvore vazia, não faça nada
		if (x < t.element)
			t.left = remove(x, t.left);
		else if (x > t.element)
			t.right = remove(x, t.right);
		else if (t.left != null && t.right != null) { // Caso 3 – nó com dois filhos
			t.element = findMin(t.right).element;
			t.right = remove(t.element, t.right);
		} else // Caso 1 e 2 – nó com um ou nenhum filho
			t = (t.left != null) ? t.left : t.right;
		return t;
	}

	public boolean find(int x) throws EmptyTreeException {
		if (isEmpty())
			throw new EmptyTreeException();
		return find(x, root);
	}

	private boolean find(int x, BinaryNode t) {
		if (t == null)
			return false;
		else if (x < t.element)
			return find(x, t.left);
		else if (x > t.element)
			return find(x, t.right);
		else
			return true;
	}
}
