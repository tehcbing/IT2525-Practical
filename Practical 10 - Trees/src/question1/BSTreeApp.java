package question1;

public class BSTreeApp {
	public static void main (String[] args) {
		BSTree tree = new BSTree();
		
		tree.add(28);
		tree.add(14);
		tree.add(21);
		tree.add(35);
		tree.add(7);
		tree.add(84);
		tree.add(56);
		tree.add(42);
		
		System.out.println("");
		System.out.println("============================");
		System.out.println("Displaying Tree...");
		tree.getRoot().inOrderPrint();
		System.out.println("============================");
		
		System.out.println("");
		System.out.println("============================");
		System.out.println("Displaying pre order");
		tree.getRoot().preOrderPrint();
		System.out.println("============================");

		System.out.println("");
		System.out.println("============================");
		System.out.println("Displaying post order");
		tree.getRoot().postOrderPrint();
		System.out.println("============================");
		
		
		
	
	}

}
