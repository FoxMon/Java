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
	
	public boolean isEmpty() {
		return (size == 0);
	}
	
	public void resize(int newSize) {
		Object temp[] = new Object[newSize];
		
		for(int i = 1, j = front + 1; i < size + 1; i++, j++) {
			temp[i] = que[j % que.length];
		}
		
		front = 0;
		rear = size;
		que = (E[]) temp;
	}
	
	public void add(E newItem) {
		if(front == (rear + 1) % que.length) {
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
		E delete = que[front];
		que[front] = null;
		size--;
		
		if(size > 0 && size == que.length / 4) {
			resize(que.length / 2);
		}
		
		return delete;
	}
	
	public static void main(String[] args) {
		ArrQueue<String> que = new ArrQueue<String>();
	}
}