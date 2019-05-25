import java.util.Vector;
import java.util.Scanner;

class Word{
	private String engWord; // 영어단어
	private String korWord; // 한글단어
	
	public Word(String engWord, String korWord) { // Word클레스의 생성자
		this.engWord = engWord;
		this.korWord = korWord;
	}
	
	public String getEngWord() { // 영단어 접근자
		return engWord;
	}
	
	public String getKorWord() { // 영단어 접근자
		return korWord;
	}
}

public class WordQuiz {
	private String quiz; // 퀴즈이름
	private Vector<Word> w; // Vector컬렉션
	
	public WordQuiz(String quiz) { // WordQuiz클레스의 생성자
		this.quiz = quiz;
		
		w = new Vector<Word>(); // Vector컬렉션의 객체 생성
		/* 17개의 단어 생성 */
		w.add(new Word("love", "사랑"));
		w.add(new Word("car", "차"));
		w.add(new Word("bus", "버스"));
		w.add(new Word("doctor", "의사"));
		w.add(new Word("teacher", "선생님"));
		w.add(new Word("work", "일"));
		w.add(new Word("school", "학교"));
		w.add(new Word("mother", "엄마"));
		w.add(new Word("father", "아빠"));
		w.add(new Word("day", "요일"));
		w.add(new Word("university", "대학교"));
		w.add(new Word("hug", "포옹"));
		w.add(new Word("subway", "지하철"));
		w.add(new Word("travel", "여행"));
		w.add(new Word("schedule", "일정"));
		w.add(new Word("book", "책"));
		w.add(new Word("computer", "컴퓨터"));
	}
	
	public int makeQuestion(int q[], int answer) { // 문제를 만듬
		int[] tempQ = new int[4]; // 임시로 정답을 저장할 배열, 4개의 보기를 가짐
		int idx; // 인덱스
		
		for(int i = 0; i < tempQ.length; i++) {
			do{
				idx = (int)(Math.random() * w.size()); // vector인덱스에 있는 요소의 크기범위 내에서 난수 생성
			}while(idx == answer || exist(tempQ, idx)); // 문제 배열에는 정답 인덱스가 있으면 안됨
			
			tempQ[i] = idx;
		}
		
		for(int i = 0; i < tempQ.length; i++) {
			q[i] = tempQ[i];
		}
		
		return (int)(Math.random()*tempQ.length);
	}
	
	public boolean exist(int tempQ[], int idx) { // 베열에 idx가 존재하면
		for(int i = 0; i < tempQ.length; i++) {
			if(tempQ[i] == idx) {
				return true; // 참
			}
		}
		
		return false; // 거짓
	}
	
	public void start() { // 게임 실행
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\""+quiz+"\""+"의 단어 테스트를 시작합니다. -1을 입력하면 종료합니다.");
		System.out.println("현재  17개의 단어가 들어 있습니다.");
		
		while(true) {
			int answer = (int)(Math.random()*w.size()); // 정답이 들어있는 벡터의 인덱스 반환
			String engVoca = w.get(answer).getEngWord(); // get으로 String answer인덱스의 객체 받고 그 객체의 영어단어 넘김
			int[] example = new int[4]; // 4개의 보기
			int ansIndex = makeQuestion(example, answer); // 넷 중에 하나가 정답임
			example[ansIndex] = answer; 
			
			System.out.println(engVoca + "?");
			
			for(int i = 0; i < example.length; i++) {
				System.out.print("("+(i+1)+")"+w.get(example[i]).getKorWord()+" "); // 보기 출력
			}
			System.out.print(":>");
			
			int user = scan.nextInt(); // 사용자가 번호 입력
			
			if(user == -1) {
				System.out.println("\""+quiz+"\""+"를 종료합니다...");
				break; // -1입력시 종료
			}
			
			user--; // 인덱스의 범위로 바꾸고
			
			if(user == ansIndex) {
				System.out.println("Excellent !!");
			}
			else {
				System.out.println("No !!");
			}
		}
	}
	
	public static void main(String[] args) {
		WordQuiz quiz = new WordQuiz("명품영어");
		
		quiz.start();
	}
}
