public class Student { 
	private int stuId;
	private String name;
	private double grade;
	
	public int getstuId() { // 학번 접근자
		return stuId;
	}
	public void setstuId(int stuId) { // 학번 설정자
		this.stuId = stuId;
	}
	
	public String getname() { // 이름 접근자
		return name;
	}
	public void setname(String name) { // 이름 설정자
		this.name = name;
	}
	
	public double getgrade() { // 성적 접근자
		return grade;
	}
	public void setgrade(double grade) { // 성적 설정자
		this.grade = grade;
	}
	
	public boolean passOrfail(double stdgrade, double grade) { // 합격여부 비교
		if(stdgrade<=grade) {
			return true;
		}
		else {
			return false;
		}
	}
}
