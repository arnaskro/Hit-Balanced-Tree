import static org.junit.Assert.*;

import ark.HitBalancedTree;
import ark.HitBalancedTreeNode;
import ark.adt.HitBalancedTreeADT;

public class Test {

	@org.junit.Test
	public void testDraw1() {
		HitBalancedTreeNode[] a = new HitBalancedTreeNode[100];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = new HitBalancedTreeNode(i);
		}
		
		HitBalancedTreeADT tree = new HitBalancedTree();
		

		tree.insertNode(a[20]);
		tree.insertNode(a[80]);
		tree.insertNode(a[7]);
		tree.insertNode(a[4]);
		tree.insertNode(a[12]);
		
		System.out.println("~ Tree 1 ------------\n" + tree.toString());
	}

	@org.junit.Test
	public void testDraw2() {
		HitBalancedTreeNode[] a = new HitBalancedTreeNode[100];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = new HitBalancedTreeNode(i);
		}
		
		HitBalancedTreeADT tree = new HitBalancedTree();
		

		tree.insertNode(a[7]);
		tree.insertNode(a[4]);
		tree.insertNode(a[20]);
		tree.insertNode(a[12]);
		tree.insertNode(a[80]);
		tree.insertNode(a[15]);
		
		System.out.println("~ Tree 2 ------------\n" + tree.toString());
	}

	@org.junit.Test
	public void testDraw3() {
		HitBalancedTreeNode[] a = new HitBalancedTreeNode[100];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = new HitBalancedTreeNode(i);
		}
		
		HitBalancedTreeADT tree = new HitBalancedTree();
		

		tree.insertNode(a[50]);
		tree.insertNode(a[17]);
		tree.insertNode(a[76]);
		tree.insertNode(a[9]);
		tree.insertNode(a[23]);
		tree.insertNode(a[14]);
		tree.insertNode(a[54]);
		tree.insertNode(a[52]);
		tree.insertNode(a[19]);
		tree.insertNode(a[72]);
		tree.insertNode(a[12]);
		tree.insertNode(a[67]);
		tree.insertNode(a[15]);
		tree.insertNode(a[8]);
		
		System.out.println("~ Tree 3 ------------\n" + tree.toString());
	}
}
