import java.util.Arrays;

public class StudentMain {
	public static void main(String[] args) {
		Student[] a = {
				new Student(35001, "��**", "����", 3), new Student(35002, "��**", "�Ϲ�", 1),
				new Student(35003, "��**", "����", 2), new Student(35004, "��**", "���þ�", 2),
				new Student(35005, "��**", "������", 2), new Student(35006, "��**", "�Ҿ�", 1),
				new Student(35007, "��**", "��ǻ��", 4), new Student(35008, "��**", "����", 2),
				new Student(35009, "��**", "��ǻ��", 2), new Student(350010, "��**", "��ġ", 4),
				new Student(350011, "��**", "����", 4), new Student(350012, "��**", "����", 3),
				new Student(350013, "��**", "����", 1), new Student(350014, "��**", "�濵", 4),
				new Student(350015, "��**", "����", 1)
		};
		
		Arrays.sort(a); // �й����� ����
		print(a, "id");
		
		Arrays.sort(a, Student.WITH_DEPT); // �а��� ����
		print(a, "�а�");
		
		Arrays.sort(a, Student.WITH_NAME); // �̸����� ����
		print(a, "�̸�");
		
		Arrays.sort(a, Student.WITH_GRADE); // �г����� ����
		print(a, "�г�");
	}
	
	public static void print(Student[] a, String key) {
		System.out.println();
		System.out.println("			" + key + "(��)�� �����ϱ�.");
		System.out.println("-----------------------------------");
		
		for(Student temp : a) {
			System.out.println(temp.getID() + " " + temp.getName() + " " + temp.getDept() + " " + temp.getGrade());
		}
	}
}
