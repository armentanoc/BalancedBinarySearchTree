package br.ucsal;

public class Main {

	public static void main(String[] args) {
		try {
			BinarySearchTree tree = new BinarySearchTree();
			System.out.println("IsEmpty? "+tree.isEmpty());
//			System.out.println("A arvore tem 1? ");
//			System.out.println(tree.find(1));
			tree.print();
			tree.insert(6);
			tree.insert(8);
			tree.insert(2);
			tree.insert(4);
			tree.insert(1);
			tree.insert(3);
			tree.print();
			System.out.println("\nA arvore tem 9? \n" + tree.find(9));
			System.out.println("A arvore tem 2? \n" + tree.find(2));
		} catch(Exception ex) {
			System.out.println("Erro: "+ex.getMessage());
		}
		
	}

}
