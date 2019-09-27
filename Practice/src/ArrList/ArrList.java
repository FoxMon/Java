package ArrList;

import java.util.NoSuchElementException;

public class ArrList<E> {
	private E[] list;
	private int size;
	
	public ArrList() {
		list = (E[]) new Object[1];
		size = 0;
	}
	
	public boolean isEmpty() {
		return (size == 0);
	}
	
	public void resize(int newSize) {
		Object temp[] = new Object[newSize];
		
		for(int i = 0; i < size; i++) {
			temp[i] = list[i];
		}
		
		list = (E[]) temp;
	}
	
	public E peek(int index) {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		
		return list[index];
	}
	
	public void insertLast(E newItem) {
		if(size == list.length) {
			resize(list.length * 2);
		}
		
		list[size++] = newItem;
	}
	
	public void insert(E newItem, int index) {
		if(size == list.length) {
			resize(list.length * 2);
		}
		
		for(int i = size -1; i >= index; i--) {
			list[i+1] = list[i];
		}
		
		list[index] = newItem;
		size++;
	}
	
	public E delete(int index) {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		
		E item = list[index];
		
		for(int i = index; i < size; i++) {
			list[i] = list[i+1];
		}
		
		size--;
		
		if(size > 0 && size == list.length) {
			resize(list.length / 2);
		}
		
		return item;
	}
	
	public static void main(String[] args) {
		ArrList<String> arrList = new ArrList<String>();
	}
}