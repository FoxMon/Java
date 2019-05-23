import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Character> grade = new ArrayList<Character>(); // 문자만 삽입 가능한 ArrayList생성
		String tempStr; // 일단 문자열로 받음
		double sum = 0;
		double avg; // 평균 저장
		
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
		tempStr = scan.nextLine(); // 6개의 학점 입력

		for(int i = 0; i < tempStr.length(); i++) {
			if(tempStr.charAt(i) == ' ') { // 공백일 경우 생략
				continue;
			}
			
			grade.add(tempStr.charAt(i)); // 문자일 경우 인덱스에 추가
		}
		
		for(int i = 0; i < grade.size(); i++) {
			switch(grade.get(i)) { // 해당 학점에 맞는 점수
			case 'A':
				sum += 4.0;
				break;
			case 'B':
				sum += 3.0;
				break;
			case 'C':
				sum += 2.0;
				break;
			case 'D':
				sum += 1.0;
				break;
			case 'F':
				sum += 0;
				break;
			}
		}
		
		avg = sum / grade.size(); // 평균계산
		
		System.out.println("평균 : " + avg);
		
		scan.close();
	}
}