public class Student {
	private String name; // �л� �̸�
	private String major; // ����
	private int studentNum; // �й�
	private double grade; // ����
	
	public Student(String name, String major, int studentNum, double grade) {
		this.name = name;
		this.major = major;
		this.studentNum = studentNum;
		this.grade = grade;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getMajor() {
		return this.major;
	}
	
	public int getStudentNum() {
		return this.studentNum;
	}
	
	public double getGrade() {
		return grade;
	}
}
