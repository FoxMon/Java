package dicApp;

import dic.Dictionary;

public class DictionaryApp {
	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		
		dic.setKeyAndValue("���", "�ڹ�");
		dic.setKeyAndValue("Wow", "Phython");
		dic.setKeyAndValue("Wow", "C++"); // Wow�� ���� C++�� ��ü �ž���
		
		System.out.println("Wow�� ���� " + dic.getValue("Wow"));
		System.out.println("����� ���� " + dic.getValue("���"));
		
		dic.delete("���"); // ��찪 ����
		
		System.out.println("����� ���� " + dic.getValue("���")); // ������ �� ���� ��
	}
}
