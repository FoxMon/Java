package List;

import java.util.NoSuchElementException;

public class SList<E> {
	private Node head;
	private int size;
	
	public SList() {
		head = null;
		size = 0;
	}
	
	public boolean isEmpty() { return (size == 0); }
	
	public int peek(E target) {
		Node temp = head;
		
		for(int i = 0; i < size; i++) {
			if(target == temp.getItem()) {
				return i;
			}
			
			temp = temp.getNext();
		}
		
		return -1;
	}
	
	public void insertFront(E item) {
		head = new Node(item, head);
		size++;
	}
	
	public void insertAfter(E item, Node previous) {
		previous.setNext(new Node(item, previous.getNext()));
		size++;
	}
	
	public void deleteFront() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		
		head = head.getNext();
		size--;
	}
	
	public void deleteAfter(Node previous) {
		if(previous == null) {
			throw new NoSuchElementException();
		}
		
		Node temp = previous.getNext();
		previous.setNext(temp.getNext());
		temp.setNext(null);
		size--;
	}
	
	public static void main(String[] args) {
		SList<String> list = new SList<String>();
	}
}