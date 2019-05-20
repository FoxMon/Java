import java.util.Scanner;

public class HistogramApp{
	private int[] histoData = new int[26]; // 알파벳 26개
	
	public HistogramApp() { // 생성자
		for(int i = 0; i < histoData.length; i++) {
			histoData[i] = 0; // 생성자 호출 시 모두 0으로 초기화
		}
	}
	
	public void makeHistogram(String str) { // 히스토그램 그래프를 만들기 위한 알파벳 카운트 메소드
		String tStr = str.toString(); // String으로 문자열 리턴
		
		tStr = tStr.toLowerCase(); // 모두 소문자로 바꾸고
		
		for(int i = 0; i < tStr.length(); i++) { // 문자열 비교
			char c = tStr.charAt(i); // 해당인덱스의 char형 문자열 반환
			
			if(c >= 'a' && c <= 'z') { // 해당알파벳을 카운트 해줌
				int idx = c - 'a';
				histoData[idx]++; // 해당 인덱스의 histoData 카운트
			}
		}
	}
	
	private void drawHistogram() { // 히스토그램을 그리는 메소드
		System.out.println("히스토그램을 그립니다.");
		
		for(int i = 0; i < histoData.length; i++) {
			System.out.print((char)('A'+i)); // 먼저 대문자로 해당 알파벳 표시 후
			
			for(int j = 0; j < histoData[i]; j++) {
				System.out.print('-'); // 히스토그램 개수만큼 - 를 출력
			}
			
			System.out.println(); // 개행
		}
	}
	
	private String readText() { // 키보드로부터 문자열을 읽고, 버퍼에 저장하는 메소드
		System.out.println("영문 텍스트를 입력하고, 세미콜론을 입력하세요.");
		
		StringBuffer buffer = new StringBuffer(); // 키 입력 시, 버퍼에 저장할 객체 생성
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			String str = scan.nextLine(); // 텍스트 한 문장
			
			if(str.equals(";")) {
				break;
			}
			
			buffer.append(str); // 버퍼에 계속해서 문자열 버퍼 저장함
		}
		scan.close(); // Scanner 닫아줌
		
		return buffer.toString(); // 버퍼에 저장된 문자열을 리턴
	}
	
	public void run() { // 실행 메소드
		String str = readText(); // 문자열 읽어들임
		
		makeHistogram(str); // 알파벳 카운트
		drawHistogram(); // 히스토그램 그림
	}
	
 	public static void main(String[] args) {
		HistogramApp hisApp = new HistogramApp(); // 객체 생성
		
		hisApp.run(); // 히스토그램 실행
	}
}