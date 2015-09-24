package ark;

import ark.adt.HitBalancedTreeADT;

public class HitBalancedTree implements HitBalancedTreeADT {

	protected HitBalancedTreeNode topNode;
	protected HitBalancedTreeNode tempNode1, tempNode2;
	protected int nodeCount;
	
	public HitBalancedTree() {
		topNode = null;
		tempNode1 = null;
		tempNode2 = null;
		nodeCount = 0;
	}
	
	@Override
	public void insertNode(HitBalancedTreeNode node) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void insertNumber(int number) {
		// TODO Auto-generated method stub
	}

	@Override
	public HitBalancedTreeNode removeNode(HitBalancedTreeNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int removeNumer(int number) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean findNode(HitBalancedTreeNode node) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean find(int number) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public HitBalancedTreeNode getTopNode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HitBalancedTreeNode rotateRight(HitBalancedTreeNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HitBalancedTreeNode rotateLeft(HitBalancedTreeNode node) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
