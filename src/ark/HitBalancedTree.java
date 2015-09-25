package ark;

import ark.adt.HitBalancedTreeADT;
import ark.exceptions.ElementNotFoundException;

public class HitBalancedTree implements HitBalancedTreeADT {

	protected HitBalancedTreeNode topNode;
	protected HitBalancedTreeNode node1, node2;
	protected int nodeCount;
	
	public HitBalancedTree() {
		topNode = null;
		node1 = null;
		node2 = null;
		nodeCount = 0;
	}
	
	@Override
	public void insertNode(HitBalancedTreeNode node) {
		if (topNode == null) {
			topNode = node;
		} else {
			HitBalancedTreeNode parent = null;
			HitBalancedTreeNode current = topNode;
		      while (current != null)
		        if (node.getNumber() < current.getNumber()) {
		          parent = current;
		          current = current.getLeft();
		        }
		        else if (node.getNumber() > current.getNumber()) {
		          parent = current;
		          current = current.getRight();
		        }
		        else
		          break;

		      // Create the new node and attach it to the parent node
		      if (node.getNumber() < parent.getNumber())
		        parent.setLeft(node);
		      else
		        parent.setRight(node);
		}
		nodeCount++;
	}
	
	@Override
	public void insertNumber(int number) {
		insertNode(new HitBalancedTreeNode(number));
	}

	@Override
	public HitBalancedTreeNode removeNode(HitBalancedTreeNode node) {
		if (!findNode(node) || node == null)
			throw new ElementNotFoundException("Hit-Balanced-Tree");
		
		if (node.hasLeft()) {
			node.getLeft().setTop(node.getTop());
		} else if (node.hasRight()) {
			node.getRight().setTop(node.getTop());
		} 
		
		node.setLeft(null);
		node.setRight(null);
		node.setTop(null);
		
		nodeCount--;
		
		return node;
	}

	@Override
	public boolean findNode(HitBalancedTreeNode node) {
		return find(node.getNumber());
	}
	
	@Override
	public boolean find(int number) {
		
		if (topNode != null) {
			if (topNode.getNumber() == number) {
				return true;
			} else {
				node2 = topNode;
			}
			
			while (node2 != null) {
				if (node2.getNumber() == number) {
					node2.hit();
					return true;
				} else if (node2.getNumber() > number) {
					node2 = node2.getLeft();
				} else {
					node2 = node2.getRight();
				}
			}
		}
		
		return false;
	}
	
	@Override
	public int size() {
		return nodeCount;
	}

	@Override
	public HitBalancedTreeNode getTopNode() {
		return topNode;
	}

	@Override
	public HitBalancedTreeNode rotateRight(HitBalancedTreeNode node) {

//		Node r = temp.getR();
//		r.setP(temp.getP());
//		temp.setR(r.getL());
//
//		if (temp.getR() != null) {
//			temp.getR().setP(temp);
//		}
//		r.setL(temp);
//		temp.setP(r);
//		if (r.getP() != null) {
//			if (r.getP().getR() == temp) {
//				r.getP().setR(r);
//			} else if (r.getP().getL() == temp) {
//				r.getP().setL(r);
//			}
//			if (temp == root) {
//				root = r;
//			}
//		}
		
		return null;
	}

	@Override
	public HitBalancedTreeNode rotateLeft(HitBalancedTreeNode node) {

//		Node r = temp.getR();
//		r.setP(temp.getP());
//		temp.setL(r.getR());
//
//		if (temp.getL() != null) {
//			temp.getL().setP(temp);
//		}
//		r.setR(temp);
//		temp.setP(r);
//		if (r.getP() != null) {
//			if (r.getP().getR() == temp) {
//				r.getP().setR(r);
//			} else if (r.getP().getR() == temp) {
//				r.getP().setR(r);
//			}
//			if (temp == root) {
//				root = r;
//			}
//		}
		
		return null;
	}
	
	@Override
	public String toString() {
		if (topNode == null)
			return "";
		
		return drawTree(topNode,"");
	}
	
	private String drawTree(HitBalancedTreeNode current, String spaces) {
		
		String tree = spaces + "|-(" + current.getNumber() + ")\n";
		 
		if (current.hasRight())
			tree += drawTree(current.getRight(), spaces + "  |");
		
		if (current.hasLeft())
			tree += drawTree(current.getLeft(), spaces + "  ");
		
		return tree;
	}

}
