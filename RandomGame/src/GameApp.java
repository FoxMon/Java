import java.util.Scanner;

public class GameApp {
	public void makeRandomNumber(Person p) { // ���� ���� �޼ҵ�
		int[] ranNum = new int[3]; // 3���� ���� ����
		
		for(int i = 0; i < ranNum.length; i++) {
			ranNum[i] = (int)(Math.random()*3 + 1); // 1~3���� ���� ����
		}
		
		p.setNum(ranNum); // ���� ����� �迭 �ѱ�
	}
	
	public boolean compareNumber(Person p) { // ���� ��
		int[] tempRanNum = new int[3]; // ���� �ӽ� ���� �迭
		tempRanNum = p.getNum(); // ���� �Ѱܹ���
		
		if(tempRanNum[0] == tempRanNum[1] && tempRanNum[1] == tempRanNum[2] && tempRanNum[0] == tempRanNum[2]) {
			return true; // ��� ������ true
		}
		
		else {
			return false; // �ٸ��� false
		}
	}
	
	public void run(Person[] p) { // ���� �޼ҵ�
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			String enter; // enter Ű �Է� ����
			
			for(int i = 0; i < p.length; i++) {
				System.out.print("[" + p[i].getName() + "]: <Enter>");
				
				enter = scan.nextLine();
				
				makeRandomNumber(p[i]); // ���� ����
				
				if(compareNumber(p[i])) {
					p[i].showNum();
					System.out.println("���� �̰���ϴ�!");
					
					scan.close();
					return;
				}
				else {
					p[i].showNum();
					System.out.println("�ƽ�����...");
				}
			}
		}
	}
}