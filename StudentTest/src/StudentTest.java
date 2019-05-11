import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student s1 = new Student();
		Student s2 = new Student();
		int higherId;
		int compareN;
		
		System.out.print("�й��� �Է��ϼ���. >> "); // �л�1�� ���� �Է�
		s1.setstuId(scan.nextInt());
		scan.nextLine(); // ���� ����
		System.out.print("�̸��� �Է��ϼ���. >> ");
		s1.setname(scan.next());
		scan.nextLine();
		System.out.print("������ �Է��ϼ���. >> ");
		s1.setgrade(scan.nextDouble());
		scan.nextLine();
		
		System.out.print("�й��� �Է��ϼ���. >> "); // �л�2�� ���� �Է�
		s2.setstuId(scan.nextInt());
		scan.nextLine(); // ���� ����
		System.out.print("�̸��� �Է��ϼ���. >> ");
		s2.setname(scan.next());
		scan.nextLine();
		System.out.print("������ �Է��ϼ���. >> ");
		s2.setgrade(scan.nextDouble());
		scan.nextLine();
		
		higherId = s1.getstuId()>s2.getstuId()?s1.getstuId():s2.getstuId(); // �й� ��
		System.out.println(s1.getstuId()+"�й� �� "+s2.getstuId()+"�й� �� �� ���� �й��� "+higherId+"�Դϴ�.");
		
		compareN = s1.getname().compareTo(s2.getname()); // �̸����� ��
		if(compareN>0) {
			System.out.println("���� �̸� �� ��� ��� >> "+s2.getname());
		}
		else if(compareN == 0) { // �������� ��
			System.out.println("�� �̸��� �����ϴ�.");
		}
		else {
			System.out.println("���� �̸� �� ��� ���>> "+s1.getname());
		}
		
		if(s1.passOrfail(1.5, s1.getgrade())) { // �����հ� ����
			System.out.println("s1�л��� �հ� �Դϴ�.");
		}
		else {
			System.out.println("s1�л��� ���հ� �Դϴ�.");
		}
		
		if(s2.passOrfail(1.5, s2.getgrade())) {
			System.out.println("s2�л��� �հ� �Դϴ�.");
		}
		else {
			System.out.println("s2�л��� ���հ� �Դϴ�.");
		}
		
		scan.close();
	}
}
