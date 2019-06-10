import java.util.ArrayList;
import java.util.Scanner;

public class StudentApp {
	Scanner scan = new Scanner(System.in);
	
	public void setUser(ArrayList<Student> s) { // �л��̸� �ʱ�ȭ
		System.out.println("�л� �̸�, �а�, �й�, ������� �Է��ϼ���.");
		
		for(int i = 0; i < 4; i++) {
			System.out.print(">> ");
			
			s.add(new Student(scan.next(), scan.next(), scan.nextInt(), scan.nextDouble()));
		}
		
		System.out.println("----------------");
	}
	
	public void print(ArrayList<Student> s) { // ��� �л��� ���� ���
		for(int i = 0; i < s.size(); i++) {
			Student tempS = s.get(i); // ��� ���
			String name, major;
			int studentNum;
			double grade;
			
			System.out.println("�̸� : " + tempS.getName());
			System.out.println("���� : " + tempS.getMajor());
			System.out.println("�й� : " + tempS.getStudentNum());
			System.out.println("���� : " + tempS.getGrade());
			System.out.println("----------------");
		}
	}
	
	public void search(ArrayList<Student> s) { // �л� ���� ã��
		while(true) {
			System.out.print("�л� �̸� >> ");
			
			String searchName = scan.next();
			
			if(searchName.equals("�׸�")) { // �׸� �Է� �� ����
				scan.close();
				
				return;
			}
			
			for(int i = 0; i < s.size(); i++) {
				Student tempS = s.get(i);
				
				if(searchName.equals(tempS.getName())) {
					System.out.println(tempS.getName() + ", " + tempS.getMajor() + ", " + tempS.getStudentNum() + ", " + tempS.getGrade());
				}
			}
		}
	}
	public static void main(String[] args) {
		ArrayList<Student> user = new ArrayList<Student>();
		StudentApp app = new StudentApp();
		
		app.setUser(user);
		app.print(user);
		app.search(user);
	}
}
