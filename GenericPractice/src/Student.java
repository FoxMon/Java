import java.util.Comparator;

public class Student implements Comparable<Student> {
	public static final Comparator<Student> WITH_NAME = new WithName();
	public static final Comparator<Student> WITH_DEPT = new WithDept();
	public static final Comparator<Student> WITH_GRADE = new WithGrade();
	
	private int id;
	private int grade;
	private String name;
	private String dept;
	
	public Student(int id, String name, String dept, int grade) {
		this.id = id;
		this.grade = grade;
		this.name = name;
		this.dept = dept;
	}
	
	public int getID() {
		return this.id;
	}
	
	public int getGrade() {
		return this.grade;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDept() {
		return dept;
	}
	
	public static class WithName implements Comparator<Student> {
		@Override
		public int compare(Student s1, Student s2) {
			return s1.name.compareTo(s2.name);
		}
	}
	
	public static class WithDept implements Comparator<Student>{
		@Override
		public int compare(Student s1, Student s2) {
			return s1.dept.compareTo(s2.dept);
		}
	}
	
	public static class WithGrade implements Comparator<Student>{
		@Override
		public int compare(Student s1, Student s2) {
			return s1.grade - s2.grade;
		}
	}
	
	@Override 
	public int compareTo(Student s1){
		return this.id - s1.id;
	}
}
