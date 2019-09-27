package Queue;

import java.util.NoSuchElementException;

public class ArrQueue<E> {
	private E[] que;
	private int front, rear;
	private int size;
	
	public ArrQueue() {
		que = (E[]) new Object[2];
		front = rear = size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return (size == 0);
	}
	
	public void resize(int newSize) {
		Object temp[] = new Object[newSize];
		
		for(int i = 0; i < size; i++) {
			temp[i] = que[i];
		}
		
		que = (E[]) temp;
	}
	
	public void add(E newItem) {
		if((rear + 1) % que.length == front) {
			resize(que.length * 2);
		}
		
		rear = (rear + 1) % que.length;
		que[rear] = newItem;
		size++;
	}
	
	public E remove() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		
		front = (front + 1) % que.length;
		E item = que[front];
		que[front] = null;
		size--;
		
		if(size() > 0 && size() == que.length / 4) {
			resize(que.length / 2);
		}
		
		return item;
	}
	
	public static void main(String[] args) {
		ArrQueue<String> que = new ArrQueue<String>();
	}
}