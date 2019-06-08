import java.util.Scanner;

public class GameApp {
	public void makeRandomNumber(Person p) { // 난수 생성 메소드
		int[] ranNum = new int[3]; // 3개의 난수 저장
		
		for(int i = 0; i < ranNum.length; i++) {
			ranNum[i] = (int)(Math.random()*3 + 1); // 1~3까지 난수 생성
		}
		
		p.setNum(ranNum); // 난수 저장된 배열 넘김
	}
	
	public boolean compareNumber(Person p) { // 난수 비교
		int[] tempRanNum = new int[3]; // 난수 임시 저장 배열
		tempRanNum = p.getNum(); // 난수 넘겨받음
		
		if(tempRanNum[0] == tempRanNum[1] && tempRanNum[1] == tempRanNum[2] && tempRanNum[0] == tempRanNum[2]) {
			return true; // 모두 같으면 true
		}
		
		else {
			return false; // 다르면 false
		}
	}
	
	public void run(Person[] p) { // 실행 메소드
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			String enter; // enter 키 입력 받음
			
			for(int i = 0; i < p.length; i++) {
				System.out.print("[" + p[i].getName() + "]: <Enter>");
				
				enter = scan.nextLine();
				
				makeRandomNumber(p[i]); // 난수 만듬
				
				if(compareNumber(p[i])) {
					p[i].showNum();
					System.out.println("님이 이겼습니다!");
					
					scan.close();
					return;
				}
				else {
					p[i].showNum();
					System.out.println("아쉽군요...");
				}
			}
		}
	}
}