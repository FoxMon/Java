package List;

import java.util.NoSuchElementException;

public class SList<E> {
	protected Node<E> head;
	private int size;
	
	public SList() {
		head = null;
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return ( size == 0 );
	}
	
	public int search(E target) {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		
		Node temp = head;
		
		for(int i = 0; i < size; i++) {
			if(target == temp.getItem()) {
				return i;
			}
			
			temp = temp.getNext();
		}
		
		return -1;
	}
	
	public void insertFront(E newItem) {
		head = new Node(newItem, head);
		size++;
	}
	
	public void insertAfter(E newItem, Node temp) {
		temp.setNext(new Node(newItem, temp.getNext()));
		size++;
	}
	
	public void deleteFront() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		
		head = head.getNext();
		size--;
	}
	
	public void deleteAfter(Node temp) {
		if(temp == null) {
			throw new NoSuchElementException();
		}
		
		Node p = temp.getNext();
		temp.setNext(p.getNext());
		p.setNext(null);
		size--;
	}
	
	public static void main(String[] args) {
		SList<String> slist = new SList<String>();
	}
}