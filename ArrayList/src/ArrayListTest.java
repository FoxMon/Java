import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Character> grade = new ArrayList<Character>(); // ���ڸ� ���� ������ ArrayList����
		String tempStr; // �ϴ� ���ڿ��� ����
		double sum = 0;
		double avg; // ��� ����
		
		System.out.print("6���� ������ �� ĭ���� �и� �Է�(A/B/C/D/F)>>");
		tempStr = scan.nextLine(); // 6���� ���� �Է�

		for(int i = 0; i < tempStr.length(); i++) {
			if(tempStr.charAt(i) == ' ') { // ������ ��� ����
				continue;
			}
			
			grade.add(tempStr.charAt(i)); // ������ ��� �ε����� �߰�
		}
		
		for(int i = 0; i < grade.size(); i++) {
			switch(grade.get(i)) { // �ش� ������ �´� ����
			case 'A':
				sum += 4.0;
				break;
			case 'B':
				sum += 3.0;
				break;
			case 'C':
				sum += 2.0;
				break;
			case 'D':
				sum += 1.0;
				break;
			case 'F':
				sum += 0;
				break;
			}
		}
		
		avg = sum / grade.size(); // ��հ��
		
		System.out.println("��� : " + avg);
		
		scan.close();
	}
}