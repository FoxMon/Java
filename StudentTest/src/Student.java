public class Student { 
	private int stuId;
	private String name;
	private double grade;
	
	public int getstuId() { // �й� ������
		return stuId;
	}
	public void setstuId(int stuId) { // �й� ������
		this.stuId = stuId;
	}
	
	public String getname() { // �̸� ������
		return name;
	}
	public void setname(String name) { // �̸� ������
		this.name = name;
	}
	
	public double getgrade() { // ���� ������
		return grade;
	}
	public void setgrade(double grade) { // ���� ������
		this.grade = grade;
	}
	
	public boolean passOrfail(double stdgrade, double grade) { // �հݿ��� ��
		if(stdgrade<=grade) {
			return true;
		}
		else {
			return false;
		}
	}
}
