public class Person {
	private String name; // User�� �̸�
	private int[] randomNumber = new int[3]; // ���� 3�� ����
	
	public Person(String name) {
		this.name = name; // �̸� �ʱ�ȭ
	}
	
	public String getName() {
		return this.name; // �̸� ������
	}
	
	public void setNum(int[] num) {
		randomNumber = num; // ���� ������
	}
	
	public void showNum() {
		System.out.println("\t" + randomNumber[0] + "\t" +  randomNumber[1] + "\t" + randomNumber[2]);
	}
	
	public int[] getNum() {
		return randomNumber; // ���� ������
	}
}
