package ListQueue;

public class Node<E> {
	private Node<E> next;
	private E item;
	
	public Node(E item, Node<E> next) {
		this.item = item;
		this.next = next;
	}
	
	public E getItem() {
		return item;
	}
	
	public Node<E> getNext(){
		return next;
	}
	
	public void setItem(E item) {
		this.item = item;
	}
	
	public void setNext(Node<E> next) {
		this.next = next;
	}
}
