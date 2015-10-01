public class HitBalancedTree {

	private Node root;
	private int count;
	
	public HitBalancedTree() {
		root = null;
		count = 0;
	}
	
	public void insert(int element) {
		Node newNode = new Node(element);
		
		if (root == null) {
			root = newNode;
		} else {
			Node temp = root;
			
			while (temp != null) {
				if (temp.getElement() > newNode.getElement()) {
					if (!temp.hasLeft()) {
						temp.setLeft(newNode);
					}
					
					temp = temp.getLeft();
				} else if (temp.getElement() < newNode.getElement()){
					if (!temp.hasRight()) {
						temp.setRight(newNode);
					}
					
					temp = temp.getRight();
				} else {
					break;
				}
			}
		}
		
		count++;
	}
	
	public boolean find(int targetElement)
	{
	   Node current = findAgain(targetElement, root);
	   
	   if (current != null) {
		   current.hit();
		   
		   Node parent = findParent(current);
		   		   		   
		   while (parent != null && parent.getHits() < current.getHits()) {
			   if (parent.getLeft() == current)
				   rotateRight(current);
			   else
				   rotateLeft(current);
			   
			   parent = findParent(current);
		   }
		   
	   }
	   
	   return current != null;
	}
	
	private Node rotateRight(Node node) {
		
		Node parent = findParent(node);
		Node parent2 = findParent(parent);
		
		if (parent2 != null) 
			if (parent2.getLeft() == parent)
				parent2.setLeft(node);
			else
				parent2.setRight(node);
		
		if (node.hasRight())
			parent.setLeft(node.getRight());
		else
			parent.setLeft(null);
		
		node.setRight(parent);
		
		if (parent == root)
			root = node;
		
		return node;
	}
	
	private Node rotateLeft(Node node) {
		
		Node parent = findParent(node);
		Node parent2 = findParent(parent);
		
		if (parent2 != null) 
			if (parent2.getLeft() == parent)
				parent2.setLeft(node);
			else
				parent2.setRight(node);
		
		if (node.hasLeft())
			parent.setRight(node.getLeft());
		else
			parent.setRight(null);
		
		node.setLeft(parent);
		
		if (parent == root)
			root = node;
		
		return node;
	}
	
	private Node findAgain(int targetElement, Node next) {
		if (next == null)
			return null;
		
		if (next.getElement() == targetElement) 
			return next;
		
		Node temp = findAgain(targetElement, next.getLeft());
		
		if (temp == null)
			temp = findAgain(targetElement, next.getRight());
		
		return temp;
	}
		
	public boolean remove(int targetElement) {
		Node current = findAgain( targetElement, root );
		
		if (current == null)
			return false;
		
		Node parent = findParent(current);
		Node left = current.getLeft();
		Node right = current.getRight();
		
		// TODO: implement remove
		
		return true;
	}
	
	private Node findParent(Node target) {
		return findParent(target, root);
	}
	
	private Node findParent(Node target, Node next) {
		if (next == null || next == target) 
			return null;
		
		if (next.getLeft() == target || next.getRight() == target) 
			return next;
		else {
			Node temp = findParent(target, next.getLeft());
			
			if (temp == null)
				temp = findParent(target, next.getRight());
			
			return temp;
		}
	}
		
	public boolean isBalanced() {
		if (root == null) {
			return true;
		} else {
			return checkBalance(root, root);
		}
	}
	
	private boolean checkBalance(Node current, Node next) {
		boolean result = true;
		
		if (next.getElement() > current.getElement())
			result = false;
		else {
			if (next.hasLeft())
				result = checkBalance(current, next.getLeft());
			else if (next.hasRight())
				result = checkBalance(current, next.getRight());
		}
		
		return result;					
	}
	
	public int size() {
		return count;
	}
	
	public boolean isEmpty() {
		return root == null;
	}
	
	public int getRoot() {
		return root.getElement();
	}
	
	public String toString() {
		if (root == null)
			return "";
		
		return drawLine(root,"");
	}
	
	private String drawLine(Node current, String spaces) {
		
		if(current != null) {
			String tree = spaces + "|-(" + current.getElement() + ")[" + current.getHits() + "]\n";
			 
			if (current.hasLeft() && current.hasRight())
				tree += drawLine(current.getRight(), spaces + "   |"); 
			else if (current.hasRight())
				tree += drawLine(current.getRight(), spaces + "    "); 
			
			if (current.hasLeft())
				tree += drawLine(current.getLeft(), spaces + "   ");
			
			return tree;
		}
		
		return "";
	}
	
}
