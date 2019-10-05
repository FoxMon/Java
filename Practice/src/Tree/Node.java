package Tree;

public class Node<Key extends Comparable<Key>> {
	private Key item;
	Node<Key> left;
	Node<Key> right;
	
	public Node(Key item, Node<Key>left, Node<Key> right) {
		this.item = item;
		this.left = left;
		this.right = right;
	}
	
	public Key getKey() { return item; }
	public Node<Key> getLeft() { return left; }
	public Node<Key> getRight() { return right; }
	public void setKey(Key item) { this.item = item; }
	public void setLeft(Node<Key> left) { this.left = left; }
	public void setRight(Node<Key> right) { this.right = right; } 
}