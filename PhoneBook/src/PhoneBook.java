import java.util.Scanner;

class Phone{
	private String name; // ����̸�
	private String tel; // ��ȭ��ȣ
	
	public String getName() { // ������
		return this.name;
	}
	
	public String getTel() {
		return this.tel;
	}
	
	public Phone(String name, String tel) { // ������
		this.name = name;
		this.tel = tel;
	}
}

public class PhoneBook{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Phone[] info;
		int peridx; // �ο���
		int cnt = 0; // �ο�����ŭ �����ϱ� ���� ī��Ʈ
		
		System.out.print("�ο���>>");
		peridx = scan.nextInt(); // �ο��� ����
		info = new Phone[peridx]; // Phone Ŭ������ ���� ���۷��� �迭 ����
		
		while(true) { // �̸��� ��ȭ��ȣ ����
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
			String pname, ptel;
			pname = scan.next();
			ptel = scan.next();
			info[cnt] = new Phone(pname, ptel); // ������ �� ���ҿ� ���� ��ü ����
			cnt++;
			
			if(cnt==peridx) { // �ο�����ŭ ���� �Ϸ� ��, �Է� ����
				System.out.println("����Ǿ����ϴ�.........");
				break;
			}
		}
		
		while(true) {
			String search;
			
			System.out.print("�˻��� �̸�>>");
			search = scan.next();
			
			if(search.equals("�׸�")) { // �׸��� ��� ����
				scan.close();
				System.out.println("�˻��� �����մϴ�......");
				break;
			}
			
			for(int i = 0;i<info.length;i++) {
				if(search.equals(info[i].getName())) { // ���� ��� ����� �ٷ� ����
					System.out.println(search+"�� ��ȣ�� "+info[i].getTel()+"�Դϴ�.");
					break;
				}
				else if(i == (info.length)-1) {
					System.out.println(search+" �� �����ϴ�.");
				}
			}
		}
	}
}