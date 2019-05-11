import java.util.Scanner;

interface Stack{
	public abstract int length(); // 저장된 문자열 개수 리턴
	public abstract int capacity(); // 저장 가능한 스택 메모리
	public abstract String pop(); // 스택에 저장된 문자열 반환
	public boolean push(String val); // 문자열 저장이 가능한가??
}

class StackApp implements Stack{
	private String[] str; // 문자열 저장할 배열
	private int cnt = 0; // 저장된 문자열 갯수 카운트
	private int idx; // 배열갯수 임시로 저장할 인덱스
	
	@Override
	public int length() { // 오버라이딩
		return cnt;
	}
	
	@Override
	public int capacity() { // 오버라이딩
		return str.length;
	}
	
	@Override
	public String pop() { // 오버라이딩
		String tStr;
		
		if(idx == -1) { // 만약 인덱스가  -1이면 반환 x
			return null;
		}

		tStr = str[idx-1];
		idx--;
		
		return tStr + " ";
	}
	
	@Override
	public boolean push(String val) { // 오버라이딩
		if(cnt < str.length) {
			str[cnt] = val; // 문자열 저장 후
			cnt++;
			return true; // true 반환
		}
		else {
			return false; 
		}
	}
	
	public void arrayCapacity(int idx) {
		str = new String[idx]; // 매개인자만큼 배열 크기 지정
		this.idx = str.length; // 인덱스 크기 저장
	}
}

public class StackMemory{
	public static void main(String[] args) {
		StackApp app = new StackApp(); // StackApp 객체 생성
		Scanner scan = new Scanner(System.in);
		String tStr;
		int num;
		
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		num = scan.nextInt();
		app.arrayCapacity(num);
		
		while(true) {
			System.out.print("문자열 입력 >> "); 
			tStr = scan.next();
			
			if(tStr.equals("그만")) { // 그만 입력 시 그만
				break;
			}
			
			if(app.push(tStr)==false) { // 메모리 꽉 차면 
				System.out.println("꽉 찼음!!!!"); // 출력
			}
		}
		
		System.out.print("스택에 저장된 모든 문자열 : ");
		
		for(int i = 0; i < num; i++) {
			System.out.print(app.pop()+" "); // 문자열 출력
		}
	}
}