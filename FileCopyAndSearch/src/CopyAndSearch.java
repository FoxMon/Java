import java.util.Scanner;
import java.util.Vector;
import java.io.*;

public class CopyAndSearch {
	private File srcfile = null; // 원본 파일
	private FileInputStream fis = null; // 바이너리
	private InputStreamReader isr = null; // 문자
	private BufferedReader br = null; // 문자 버퍼
	private Vector<String> stringVector = new Vector<String>();
	
	public void readFile(String fileName) { // 파일을 읽음 -> 벡터에 복사할 것임
		srcfile = new File(fileName);
		
		String line;
		
		try {
			fis = new FileInputStream(srcfile);
			isr = new InputStreamReader(fis, "MS949");
			br = new BufferedReader(isr);
			
			while((line = br.readLine()) != null) { // 한줄로 읽음
				stringVector.add(line); // 한 라인을 벡터에 추가함
			}
			
			fis.close();
			br.close();
		} catch(IOException e) {
			System.out.println("오류가 발생했습니다.");
		}
	}
	
	public Vector<Integer> search(String word){ // 단어를 찾아서 라인 번호를 반환할 것임
		Vector<Integer> line = new Vector<Integer>(); // 라인의 번호 저장하기 위함
		
		for(int i = 0; i < stringVector.size(); i++) {
			String tStr = stringVector.get(i);
			
			if(tStr.indexOf(word) != -1) { // word를 포함하고 있는 인덱스를
				line.add(i); // line 벡터에 넣는다.
			}
		}
		
		return line;
	}
	
	public void print(Vector<Integer> line) {
		for(int i = 0; i < line.size(); i++) {
			int lineNumber = line.get(i); // auto unboxing 객체 -> 기본타입
			String str = stringVector.get(lineNumber); // 해당 줄 번호에 해당하는 문자열
			
			System.out.println(lineNumber + ":" + str); // 출력
		}
	}
	
	public void start() {
		Scanner scan = new Scanner(System.in);
		Vector<Integer> line = new Vector<Integer>();
		String file;
		
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		System.out.print("대상 파일명 입력>> ");
		file = scan.nextLine();
		
		readFile(file);
		
		while(true) {
			String word;
			
			System.out.print("검색할 단어나 문장>> ");
			word = scan.nextLine();
			
			if(word.equals("그만")) { // 그만 입력 시 종료됨.
				scan.close();
				
				System.out.println("프로그램을 종료합니다...");
				
				break;
			}
			
			line = search(word); // word를 포함하는 모든 줄번호를 반환할 것임
			print(line);
		}
	}
	
	public static void main(String[] args) {
		CopyAndSearch cas = new CopyAndSearch();
		
		cas.start();
	}
}
