class GStack<T> {
	int tos;
	Object []stack;
	
	public GStack() {
		tos = 0;
		stack = new Object[10];
	}
	
	public void push(T item) {
		if(tos == 10) {
			return;
		}
		
		stack[tos] = item;
		tos++;
	}
	
	public T pop() {
		if(tos == 0) {
			return null;
		}
		
		tos--;
		
		return (T)stack[tos];
	}
}

public class StackEx {
	public static void main(String[] args) {
		GStack<String> stringStack = new GStack<String>();
		
		stringStack.push("Seoul");
		stringStack.push("Busan");
		stringStack.push("LA");
		
		for(int i = 0; i < 3; i++) {
			System.out.println(stringStack.pop());
		}
		
		GStack<Integer> intStack = new GStack<Integer>();
		
		intStack.push(1);
		intStack.push(2);
		intStack.push(3);
		
		for(int i = 0; i < 3; i++) {
			System.out.println(intStack.pop());
		}
	}
}
