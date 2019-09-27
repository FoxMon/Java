package SlistStack;

import java.util.EmptyStackException;

public class SlistStack<E> {
	private Node<E> top;
	private int size;
	
	public SlistStack() {
		top = null;
		size = 0;
	}
	
	public boolean isEmpty() {
		return (size == 0);
	}
	
	public int size() {
		return size;
	}
	
	public E peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		
		return top.getItem();
	}
	
	public void push(E newItem) {
		Node newNode = new Node(newItem, top);
		top = newNode;
		size++;
	}
	
	public E pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		
		E item = top.getItem();
		top = top.getNext();
		size--;
		
		return item;
	}
	
	public static void main(String[] args) {
		SlistStack<String> slistStack = new SlistStack<String>();
	}
}