import java.util.Scanner;

interface Stack{
	public abstract int length(); // ����� ���ڿ� ���� ����
	public abstract int capacity(); // ���� ������ ���� �޸�
	public abstract String pop(); // ���ÿ� ����� ���ڿ� ��ȯ
	public boolean push(String val); // ���ڿ� ������ �����Ѱ�??
}

class StackApp implements Stack{
	private String[] str; // ���ڿ� ������ �迭
	private int cnt = 0; // ����� ���ڿ� ���� ī��Ʈ
	private int idx; // �迭���� �ӽ÷� ������ �ε���
	
	@Override
	public int length() { // �������̵�
		return cnt;
	}
	
	@Override
	public int capacity() { // �������̵�
		return str.length;
	}
	
	@Override
	public String pop() { // �������̵�
		String tStr;
		
		if(idx == -1) { // ���� �ε�����  -1�̸� ��ȯ x
			return null;
		}

		tStr = str[idx-1];
		idx--;
		
		return tStr + " ";
	}
	
	@Override
	public boolean push(String val) { // �������̵�
		if(cnt < str.length) {
			str[cnt] = val; // ���ڿ� ���� ��
			cnt++;
			return true; // true ��ȯ
		}
		else {
			return false; 
		}
	}
	
	public void arrayCapacity(int idx) {
		str = new String[idx]; // �Ű����ڸ�ŭ �迭 ũ�� ����
		this.idx = str.length; // �ε��� ũ�� ����
	}
}

public class StackMemory{
	public static void main(String[] args) {
		StackApp app = new StackApp(); // StackApp ��ü ����
		Scanner scan = new Scanner(System.in);
		String tStr;
		int num;
		
		System.out.print("�� ���� ���� ������ ũ�� �Է� >> ");
		num = scan.nextInt();
		app.arrayCapacity(num);
		
		while(true) {
			System.out.print("���ڿ� �Է� >> "); 
			tStr = scan.next();
			
			if(tStr.equals("�׸�")) { // �׸� �Է� �� �׸�
				break;
			}
			
			if(app.push(tStr)==false) { // �޸� �� ���� 
				System.out.println("�� á��!!!!"); // ���
			}
		}
		
		System.out.print("���ÿ� ����� ��� ���ڿ� : ");
		
		for(int i = 0; i < num; i++) {
			System.out.print(app.pop()+" "); // ���ڿ� ���
		}
	}
}