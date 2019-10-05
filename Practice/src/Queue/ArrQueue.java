package Queue;

import java.util.NoSuchElementException;

public class ArrQueue<E> {
	private E q[];
	private int front, rear;
	private int size;
	
	public ArrQueue() {
		q = (E[]) new Object[2];
		front = rear = 0;
		size = 0;
	}
	
	public boolean isEmpty() { return (size == 0); }
	public int size() { return size; }
	
	public void resize(int newSize) {
		Object temp[] = new Object[newSize];
		
		for(int i = 1, j = front + 1; i < size + 1; i++, j++) {
			temp[i] = q[j];
		}
		
		front = 0;
		rear = size;
		q = (E[]) temp;
	}
	
	public void add(E item) {
		if(front == (rear + 1) % q.length) {
			resize(q.length * 2);
		}
		
		rear = (rear + 1) % q.length;
		q[rear] = item;
		size++;
	}
	
	public E remove() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		
		front = (front + 1) % q.length;
		E temp = q[front];
		q[front] = null;
		size--;
		
		if(size > 0 && size == q.length / 4) {
			resize(q.length / 2);
		}
		
		return temp;
	}
	
	public static void main(String[] args) {
		ArrQueue<String> arr = new ArrQueue<String>();
	}
}