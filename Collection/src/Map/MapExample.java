package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {
	private HashMap<String, Integer> asciiMap = new HashMap<String, Integer>();
	
	public void init() {
		for(int i = 65; i <= 90; i++) {
			asciiMap.put(String.valueOf((char)i ), i);
		}
	}
	
	public void execute() {
		// EntrySet
		Set<Entry<String, Integer>> entrySet = asciiMap.entrySet();
		
		for(Entry<String, Integer> item : entrySet) {
			System.out.print("[" + item.getKey() + "/" + item.getValue() + "] "); // 1
		}
		System.out.println();
		
		System.out.println("asciiMap contains 69 value : " + asciiMap.containsValue(69)); // containsValue
		System.out.println("asciiMap contains C key : " + asciiMap.containsKey("C")); // containsKey
		
		asciiMap.remove("Z"); // remove
		
		Collection<Integer> values = asciiMap.values(); // Values
		
		for(Integer item : values) {
			System.out.print("(" + item + ") "); // 2
		}
		System.out.println();
		
		Set<String> keySet = asciiMap.keySet(); // KeySet
		
		for(String item : keySet) {
			System.out.print("[" + asciiMap.get(item) + "] "); // 3
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		MapExample example = new MapExample();
		
		example.init();
		example.execute();
	}
}
