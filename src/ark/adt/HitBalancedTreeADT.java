/**
 * HitBalancedTreeADT defines the interface to a hit balanced tree data structure.
 *
 * @author Arnas Kromelis
 * @version 1.0, 9/17/15
 */

package ark.adt;

import ark.HitBalancedTreeNode;

public interface HitBalancedTreeADT {

	/**
	 * Inserts the node to the tree
	 * 
	 * @param node
	 */
	public void insertNode(HitBalancedTreeNode node);
   
	/**
	 * Inserts the element to the tree
	 * 
	 * @param node
	 */
	public void insertNumber(int number);
	
	/**
	 * Removes the node from the tree
	 * 
	 * @param node
	 * @return the node we wanted to remove
	 */
	public HitBalancedTreeNode removeNode(HitBalancedTreeNode node);
	
	/**
	 * 
	 * @param node
	 * @return
	 */
	public boolean findNode(HitBalancedTreeNode node);
	
	/**
	 * 
	 * @param node
	 * @return
	 */
	public boolean find(int node);
	
	
	/**
	 * 
	 * @return the number of nodes in the tree
	 */
	public int size();

	/**
	 * 
	 * @return the node that is on the top of the tree
	 */
	public HitBalancedTreeNode getTopNode();
	
	/**
	 * Rotates the three at the node position to right
	 * 
	 * @param node - node on which we want to rotate the tree
	 * @return node with rotated tree
	 */
	public HitBalancedTreeNode rotateRight(HitBalancedTreeNode node);
	
	/**
	 * Rotates the three at the node position to left
	 * 
	 * @param node - node on which we want to rotate the tree
	 * @return node with rotated tree
	 */
	public HitBalancedTreeNode rotateLeft(HitBalancedTreeNode node);

	/**
	 * 
	 * @return view of the tree
	 */
	public String toString(); 
}
