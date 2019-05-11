import java.util.Scanner;

class Dictionary{
	private static String[] kor = {"���", "�Ʊ�", "��", "�̷�", "���"};
	private static String[] eng = {"love", "baby", "money", "future", "hope"};
	
	public static String kor2Eng(String word) {
		for(int i = 0;i<kor.length;i++) { // ���ڿ� ��
			if(word.equals(kor[i])) { // ������ ���� �� Ż��
				word=eng[i];
				break;
			} // ������ ���� ��� ������ word ��ȯ
		}
		return word; // ��ȭ�� ���ڿ� ��ȯ
	}
}

public class DicApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word; // �ѱ�
		String engword; // ����
		
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		
		while(true) {
			System.out.print("�ѱ� �ܾ�?>>");
			word = scan.next();
			
			if(word.equals("�׸�")) { // �׸� ���� ��� ����
				break;
			}
			
			engword = Dictionary.kor2Eng(word); // ����ܾ� �־���
			
			if(engword.equals(word)) { // �״���� ���, ������ ���� ����
				System.out.println(word+"�� ���� ������ �����ϴ�.");
			}
			else { // �ƴ� ���, ����� ��ȯ�� ����
				System.out.println(word+"�� "+engword);
			}
		}
	}
}