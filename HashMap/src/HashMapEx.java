import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap<String, String> dic = new HashMap<String, String>();
		
		dic.put("Baby", "�Ʊ�");
		dic.put("Love", "���");
		dic.put("apple", "���");
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("ã�� ���� �ܾ��?");
			
			String eng = scan.next();
			
			if(eng.equals("�׸�")) {
				System.out.println("�����մϴ�...");
				
				break;
			}
			
			String kor = dic.get(eng);
			
			if(kor == null) {
				System.out.println(eng + "�� ���� �ܾ� �Դϴ�.");
			} else {
				System.out.println(kor);
			}
		}
		
		scan.close();
	}
}
