package List;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;

public class ListExample {
	private final int MAX_INT = 9;
	private Random random = new Random();
	private ArrayList<Integer> arrayList = new ArrayList<Integer>();
	private Vector<Integer> vector = new Vector<Integer>();
	
	public void testArrayList() {
		for(int i = 0; i < MAX_INT; i++) {
			arrayList.add(random.nextInt(MAX_INT));
		}
		
		this.printMember(arrayList);
		arrayList.remove(2);
		this.printMember(arrayList);
		arrayList.add(8);
		this.printMember(arrayList);
		arrayList.clear();
		this.printMember(arrayList);
	}
	
	public void testVector() {
		for(int i = 0; i < MAX_INT; i++) {
			vector.add(random.nextInt(MAX_INT));
		}
		
		this.printMember(vector);
		vector.remove(2);
		this.printMember(vector);
		vector.add(8);
		this.printMember(vector);
		vector.clear();
		this.printMember(vector);
	}
	
	public void printMember(List<Integer> list) { // UpCasting
		int total = list.size();
		
		if(list instanceof ArrayList) {
			System.out.print("ArrayList Member (" + total + ") : ");
		} else if(list instanceof Vector) {
			System.out.print("Vector Member (" + total + ") : ");
		} else {
			System.out.print("Unknown Member (" + total + ") : ");
		}
		
		for(Integer item : list) {
			System.out.print("[" + item + "]");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		ListExample example = new ListExample();
		
		example.testArrayList();
		example.testVector();
	}
}
