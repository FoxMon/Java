import java.util.Scanner;

public class PersonGameStart {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Person[] user = new Person[2]; // 2명의 유저
		GameApp app = new GameApp();
		
		for(int i = 0; i < user.length; i++) {
			System.out.print((i+1)+"번째 선수 이름 >> ");
			user[i] = new Person(scan.next()); // 이름 설정
		}
		
		app.run(user); // 게임 시작
	}
}
