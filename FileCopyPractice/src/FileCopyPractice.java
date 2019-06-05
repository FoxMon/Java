import java.io.*;

public class FileCopyPractice {
	public static final int BUFFER_SIZE = 1024; // 버퍼의 사이즈
	
	public static void main(String[] args) {
		File srcfile = new File("C:\\Temp\\testfile.jpg"); // 원본 파일 경로
		File destfile = new File("C:\\Temp\\testfile_result.jpg"); // 복사 파일 경로
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		byte[] buf = new byte[BUFFER_SIZE]; // 배열을 이용하여 파일복사를 시도함
		int readCount = 0;
		
		try {
			fis = new FileInputStream(srcfile);
			fos = new FileOutputStream(destfile);
			
			System.out.println("testfile.jpg를 testfile_result.jpg로 복사합니다.");
			System.out.println("10%마다 *를 출력합니다.");
			
			while(true) {
				int readfile = fis.read(buf);
				
				fos.write(buf, 0, BUFFER_SIZE);
				readCount += readfile;
				
				if(readfile < BUFFER_SIZE) { // EOF발견 시
					System.out.println("*");
					
					break; // 반복문 탈출
				}
				
				if(readCount >= (srcfile.length() / 10)) { // 10프로 초과 시
					System.out.print("*"); // 별 출력 후
					
					readCount -= (srcfile.length() / 10);
				}
			}
			System.out.println();
			
			fis.close(); // 스트림을 닫아줌
			fos.close();
			
			System.out.println(srcfile.getPath() + "를 " + destfile.getPath() + "로 복사하였습니다.");
		} catch(IOException e) {
			System.out.println("파일 복사 오류.");
		}
	}
}
