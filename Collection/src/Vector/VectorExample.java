package Vector;

import java.util.Vector;

public class VectorExample {
	private int count = 0;
	private Vector<String> vector = new Vector<String>(10, 5);
	
	public void execute() {
		this.printStatus(); // 1
		for(int i = 0; i < 9; i++) {
			vector.addElement(String.valueOf(i)); // String
		}
		
		this.printStatus(); // 2
		for(int i = 0; i < 4; i++) {
			vector.addElement(String.valueOf(i)); // String
		}
		
		this.printStatus(); // 3
		vector.setSize(20); // Capacity -> 20, elements + null
		
		this.printStatus(); // 4
		
		System.out.println(vector.toString()); // Show all
	}
	
	public void printStatus() {
		count++;
		
		System.out.println("[" + count + "] Capacity : " + vector.capacity() + "Element Size : " + vector.size());
	}
	
	public static void main(String[] args) {
		VectorExample example = new VectorExample();
		
		example.execute();
	}
}
