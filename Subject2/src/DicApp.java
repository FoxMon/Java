import java.util.Scanner;

class Dictionary{
	private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
	private static String[] eng = {"love", "baby", "money", "future", "hope"};
	
	public static String kor2Eng(String word) {
		for(int i = 0;i<kor.length;i++) { // 문자열 비교
			if(word.equals(kor[i])) { // 같으면 대입 후 탈출
				word=eng[i];
				break;
			} // 같은게 없을 경우 원래의 word 반환
		}
		return word; // 변화된 문자열 반환
	}
}

public class DicApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word; // 한글
		String engword; // 영어
		
		System.out.println("한영 단어 검색 프로그램입니다.");
		
		while(true) {
			System.out.print("한글 단어?>>");
			word = scan.next();
			
			if(word.equals("그만")) { // 그만 나올 경우 끝냄
				break;
			}
			
			engword = Dictionary.kor2Eng(word); // 영어단어 넣어줌
			
			if(engword.equals(word)) { // 그대로인 경우, 사전에 없는 것임
				System.out.println(word+"는 저의 사전에 없습니다.");
			}
			else { // 아닌 경우, 영어로 변환된 것임
				System.out.println(word+"는 "+engword);
			}
		}
	}
}