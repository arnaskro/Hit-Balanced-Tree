
public class Test {

	public static void main(String[] args) {
		HitBalancedTree tree = new HitBalancedTree();
		
		tree.insert(20);
		tree.insert(80);
		tree.insert(7);
		tree.insert(12);
		tree.insert(4);
		tree.insert(90);
		tree.insert(50);
		tree.insert(30);
		tree.insert(60);
		
		System.out.println(tree);
		
		for (int i = 0; i < 1; i++)
			tree.find(7);
		
		System.out.println(tree);
		
		for (int i = 0; i < 2; i++)
			tree.find(80);
		
		System.out.println(tree);
		
		for (int i = 0; i < 3; i++)
			tree.find(30);
		
		System.out.println(tree);
		
		System.out.println("Tree is balanced: " + tree.isBalanced());
		
		for (int i = 0; i < 4; i++)
			tree.find(12);
		
		System.out.println(tree);
		
		System.out.println("Tree is balanced: " + tree.isBalanced());
	}

}
