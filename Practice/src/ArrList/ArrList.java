package ArrList;

import java.util.NoSuchElementException;

public class ArrList<E> {
	private int size;
	private E arrList[];
	
	public ArrList() {
		arrList = (E[]) new Object[1];
		size = 0;
	}
	
	public boolean isEmpty() { return (size == 0); }
	
	public void resize(int newSize) {
		Object temp[] = new Object[newSize];
		
		for(int i = 0; i < size; i++) {
			temp[i] = arrList[i];
		}
		
		arrList = (E[])temp;
	}
	
	public E peek(int index) {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		
		return arrList[index];
	}
	
	public void insert(E newItem, int index) {
		if(size == arrList.length) {
			resize(arrList.length * 2);
		}
		
		for(int i = size - 1; i >= index; i--) {
			arrList[i+1] = arrList[i];
		}
		
		arrList[index] = newItem;
		size++;
	}
	
	public void insertLast(E newItem) {
		if(size == arrList.length) {
			resize(arrList.length * 2);
		}
		
		arrList[size++] = newItem;
	}
	
	public E delete(int index) {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		
		E temp = arrList[index];
		
		for(int i = index; i < size; i++) {
			arrList[i] = arrList[i + 1];
		}
		
		size--;
		
		if(size == arrList.length / 4) {
			resize(arrList.length / 2);
		}
		
		return temp;
	}
	
	public static void main(String[] args) {
		ArrList<String> arr = new ArrList<String>();
	}
}