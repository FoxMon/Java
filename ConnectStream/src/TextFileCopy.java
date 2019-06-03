import java.io.*;

public class TextFileCopy {
	public static void main(String[] args) {
		File srcfile = new File("C:\\Temp\\test.txt"); // 원본 파일 경로명
		File destfile = new File("C:\\Temp\\test_result.txt"); // 복사 파일 경로명

		FileInputStream fis = null; // 바이너리
		FileOutputStream fos = null; // 바이너리
		
		InputStreamReader isr = null; // 문자
		OutputStreamWriter osw = null; // 문자
		
		int c;
		
		try {
			fis = new FileInputStream(srcfile);
			fos = new FileOutputStream(destfile);
			isr = new InputStreamReader(fis, "MS949");
			osw = new OutputStreamWriter(fos, "MS949");
			
			while((c = isr.read()) != -1) { // 복사
				System.out.print((char)c);
				osw.write((char)c);
			}
			
			System.out.println();
			
			isr.close();
			osw.close();
			fis.close();
			fos.close();
		} catch(IOException e) {
			System.out.println("오류발생");
		}
	}
}
