import java.util.ArrayList;
import java.util.Scanner;

public class StudentApp {
	Scanner scan = new Scanner(System.in);
	
	public void setUser(ArrayList<Student> s) { // 학생이름 초기화
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
		
		for(int i = 0; i < 4; i++) {
			System.out.print(">> ");
			
			s.add(new Student(scan.next(), scan.next(), scan.nextInt(), scan.nextDouble()));
		}
		
		System.out.println("----------------");
	}
	
	public void print(ArrayList<Student> s) { // 모든 학생의 정보 출력
		for(int i = 0; i < s.size(); i++) {
			Student tempS = s.get(i); // 요소 얻기
			String name, major;
			int studentNum;
			double grade;
			
			System.out.println("이름 : " + tempS.getName());
			System.out.println("전공 : " + tempS.getMajor());
			System.out.println("학번 : " + tempS.getStudentNum());
			System.out.println("학점 : " + tempS.getGrade());
			System.out.println("----------------");
		}
	}
	
	public void search(ArrayList<Student> s) { // 학생 정보 찾기
		while(true) {
			System.out.print("학생 이름 >> ");
			
			String searchName = scan.next();
			
			if(searchName.equals("그만")) { // 그만 입력 시 끝냄
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
