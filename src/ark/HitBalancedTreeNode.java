/**
 * HitBalancedTreeNode represents a node in a hit balanced tree with a left and 
 * right child, has a parent node and also has a hit count.
 *
 * @author Arnas Kromelis
 * @version 1.0, 9/17/15
 */

package ark;

public class HitBalancedTreeNode<T> {

   protected HitBalancedTreeNode<T> leftNode;
   protected HitBalancedTreeNode<T> rightNode;
   protected HitBalancedTreeNode<T> parentNode;
   protected T element;
   private int hits;
   
   /**
    * Creates a new tree node with the specified data.
    * 
    * @param element  the element that will become a part of the new tree
    */
   public HitBalancedTreeNode(T element) {
      this.element = element;
      this.hits = 0;
      leftNode = null;
      rightNode = null;
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
    * @return the stored element
    */
   public T getElement() {
      return element;
   }
   
   /**
    * Set the element in this node to the new specified element
    * 
    * @param element  new element to be that will become a part of the tree node
    */
   public void setElement(T element) {
      this.element = element;
   }
   
   /**
    * 
    * @return the parent node
    */
   public HitBalancedTreeNode<T> getParent() {
      return parentNode;
   }
   
   /**
    * 
    * @return the node that is on the left side of the node
    */
   public HitBalancedTreeNode<T> getLeft() {
      return leftNode;
   }
   
   /**
    * 
    * @return the node that is on the right side of the node
    */
   public HitBalancedTreeNode<T> getRight() {
      return rightNode;
   }
   
   /**
    * sets a node on the left of this node
    * @param node  that will be on the left of this node
    */
   public void setParent(HitBalancedTreeNode<T> node) {
      parentNode = node;
   }
   
   /**
    * sets a node on the left of this node
    * @param node  that will be on the left of this node
    */
   public void setLeft(HitBalancedTreeNode<T> node) {
      leftNode = node;
   }
   
   /**
    * sets a node on the right of this node
    * @param node  that will be on the right of this node
    */
   public void setRight(HitBalancedTreeNode<T> node) {
      rightNode = node;
   }
   
   /**
    * Returns the number of non-null children of this node.
    * This method may be able to be written more efficiently.
    *
    * @return  the integer number of non-null children of this node 
    */
   public int numChildren() 
   {
      int children = 0;

      if (leftNode != null)
         children = 1 + leftNode.numChildren();

      if (rightNode != null)
         children = children + 1 + rightNode.numChildren();

      return children;
   }
   
}
