import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student s1 = new Student();
		Student s2 = new Student();
		int higherId;
		int compareN;
		
		System.out.print("학번을 입력하세요. >> "); // 학생1의 정보 입력
		s1.setstuId(scan.nextInt());
		scan.nextLine(); // 엔터 삭제
		System.out.print("이름을 입력하세요. >> ");
		s1.setname(scan.next());
		scan.nextLine();
		System.out.print("성적을 입력하세요. >> ");
		s1.setgrade(scan.nextDouble());
		scan.nextLine();
		
		System.out.print("학번을 입력하세요. >> "); // 학생2의 정보 입력
		s2.setstuId(scan.nextInt());
		scan.nextLine(); // 엔터 삭제
		System.out.print("이름을 입력하세요. >> ");
		s2.setname(scan.next());
		scan.nextLine();
		System.out.print("성적을 입력하세요. >> ");
		s2.setgrade(scan.nextDouble());
		scan.nextLine();
		
		higherId = s1.getstuId()>s2.getstuId()?s1.getstuId():s2.getstuId(); // 학번 비교
		System.out.println(s1.getstuId()+"학번 과 "+s2.getstuId()+"학번 중 더 높은 학번은 "+higherId+"입니다.");
		
		compareN = s1.getname().compareTo(s2.getname()); // 이름순서 비교
		if(compareN>0) {
			System.out.println("빠른 이름 순 출력 결과 >> "+s2.getname());
		}
		else if(compareN == 0) { // 동명이인 비교
			System.out.println("두 이름이 같습니다.");
		}
		else {
			System.out.println("빠른 이름 순 출력 결과>> "+s1.getname());
		}
		
		if(s1.passOrfail(1.5, s1.getgrade())) { // 성적합격 여부
			System.out.println("s1학생은 합격 입니다.");
		}
		else {
			System.out.println("s1학생은 불합격 입니다.");
		}
		
		if(s2.passOrfail(1.5, s2.getgrade())) {
			System.out.println("s2학생은 합격 입니다.");
		}
		else {
			System.out.println("s2학생은 불합격 입니다.");
		}
		
		scan.close();
	}
}
