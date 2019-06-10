public class Student {
	private String name; // 학생 이름
	private String major; // 전공
	private int studentNum; // 학번
	private double grade; // 학점
	
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
