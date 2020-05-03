package Set;

import java.util.HashSet;
import java.util.Random;

public class HashSetExample {
	private int count = 0;
	private Random random = new Random();
	private HashSet<Integer> set = new HashSet<Integer>();
	
	public void printStatus(HashSet<Integer> hashSet) {
		if(hashSet == null || hashSet.size() == 0) {
			System.out.println("Object is null or size is zero...");
			
			return;
		}
		
		count++;
		
		Integer[] array = hashSet.toArray(new Integer[hashSet.size()]); // use toArray
		
		System.out.print("Count : " + count + ", ");
		
		for(Integer item : array) {
			System.out.print("[" + item + "] ");
		}
		System.out.println();
	}
	
	public void init() {
		for(int i = 0; i < 10; i++) {
			set.add(random.nextInt(10));
		}
		
		this.printStatus(set); // 1
	}
	
	public void execute() {
		HashSet<Integer> setObject = new HashSet<Integer>();
		
		for(int i = 0; i < 10; i++) {
			setObject.add(random.nextInt(5));
		}
		
		this.printStatus(setObject); // 2
		set.addAll(setObject);
		this.printStatus(set); // 3
	}
	
	public static void main(String[] args) {
		HashSetExample example = new HashSetExample();
		
		example.init();
		example.execute();
	}
}
