import java.util.Scanner;

public class PersonGameStart {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Person[] user = new Person[2]; // 2���� ����
		GameApp app = new GameApp();
		
		for(int i = 0; i < user.length; i++) {
			System.out.print((i+1)+"��° ���� �̸� >> ");
			user[i] = new Person(scan.next()); // �̸� ����
		}
		
		app.run(user); // ���� ����
	}
}
