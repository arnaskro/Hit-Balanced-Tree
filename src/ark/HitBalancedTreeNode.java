/**
 * HitBalancedTreeNode represents a node in a hit balanced tree with a left and 
 * right child, has a parent node and also has a hit count.
 *
 * @author Arnas Kromelis
 * @version 1.0, 9/17/15
 */

package ark;

public class HitBalancedTreeNode {

   protected HitBalancedTreeNode leftNode;
   protected HitBalancedTreeNode rightNode;
   protected HitBalancedTreeNode topNode;
   protected int number;
   protected int hits;
   
   /**
    * Creates a new tree node with the specified data.
    * 
    * @param number  the number that will become a part of the new tree
    */
   public HitBalancedTreeNode(int number) {
      this.number = number;
      this.hits = 0;
      leftNode = null;
      rightNode = null;
      topNode = null;
   }

   /**
    * @return the integer number of hits
    */
   public int getHits() {
      return hits;
   }
   
   /**
    * Increase hit count
    */
   public void hit() {
      ++hits;
   }
   
   /**
    * @return the stored number
    */
   public int getNumber() {
      return number;
   }
   
   /**
    * Set the number in this node to the new specified number
    * 
    * @param number  new number to be that will become a part of the tree node
    */
   public void setNumber(int number) {
      this.number = number;
   }
   
   /**
    * 
    * @return the parent node
    */
   public HitBalancedTreeNode getTop() {
      return topNode;
   }
   
   /**
    * 
    * @return the node that is on the left side of the node
    */
   public HitBalancedTreeNode getLeft() {
      return leftNode;
   }
   
   /**
    * 
    * @return boolean status if the node exists
    */
   public boolean hasLeft() {
      return leftNode != null;
   }
   
   /**
    * 
    * @return boolean status if the node exists
    */
   public boolean hasRight() {
      return rightNode != null;
   }
   
   /**
    * 
    * @return the node that is on the right side of the node
    */
   public HitBalancedTreeNode getRight() {
      return rightNode;
   }
   
   /**
    * sets a node on the left of this node
    * @param node  that will be on the left of this node
    */
   public void setTop(HitBalancedTreeNode node) {
	   topNode = node;
   }
   
   /**
    * sets a node on the left of this node
    * @param node  that will be on the left of this node
    */
   public void setLeft(HitBalancedTreeNode node) {
      leftNode = node;
   }
   
   /**
    * sets a node on the right of this node
    * @param node  that will be on the right of this node
    */
   public void setRight(HitBalancedTreeNode node) {
      rightNode = node;
   }
   
}
