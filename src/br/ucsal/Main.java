package br.ucsal;

public class Main {

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		System.out.println("IsEmpty? "+tree.isEmpty());
		tree.print();
		tree.insert(6);
		tree.insert(8);
		tree.insert(2);
		tree.insert(4);
		tree.insert(1);
		tree.insert(3);
		tree.print();
	}

}
