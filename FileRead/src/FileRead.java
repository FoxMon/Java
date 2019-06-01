import java.io.*;

public class FileRead {
	public static void main(String[] args) {
		InputStreamReader input = null;
		FileInputStream fileInput = null;
		
		try {
			fileInput = new FileInputStream("C:\\Temp\\phone.txt");
			input = new InputStreamReader(fileInput, "MS949"); // 스트림끼리 연결
			int readString;
			
			System.out.println("C:\\Temp\\phone.txt를 출력합니다.");
			
			while((readString = input.read()) != -1) { // 문자의 끝을 판별함
				System.out.print((char)readString); // 필수적으로 char타입으로 캐스팅해야함
			}
			
			fileInput.close(); // 스트림을 닫음
			input.close();
		}catch(IOException s) {
			System.out.println("입출력 오류입니다.");
		}
	}
}
