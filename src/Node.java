
public class Node {

	private	Node right, left;
	private int hits;
	private int element;
	
	public Node(int element) {
		this.element = element;
		this.hits = 0;
		
		this.right = null;
		this.left = null;
	}

	public boolean hasRight() {
		return right != null;
	}
	
	public boolean hasLeft() {
		return left != null;
	}
	
	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public int getHits() {
		return hits;
	}

	public void hit() {
		hits++;
	}

	public int getElement() {
		return element;
	}

	public void setElement(int element) {
		this.element = element;
	}
	
	
	
}
